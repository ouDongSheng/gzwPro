/*
package com.etop.property.right.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.metadata.CellData;
import com.etop.property.right.common.constant.CompanyConstants;
import com.etop.property.right.common.constant.utils.DateUtil;
import com.etop.property.right.common.constant.utils.EnumUtil;
import com.etop.property.right.entity.BaseInfo;
import com.etop.property.right.entity.RegionCn;
import com.etop.property.right.entity.RegisterInfo;
import com.etop.property.right.entity.StockInfo;
import com.etop.property.right.service.IBaseInfoService;
import com.etop.property.right.service.IRegionCnService;
import com.etop.property.right.service.IRegisterInfoService;
import com.etop.property.right.service.IStockInfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.util.ResourceUtils;
import org.springframework.util.StringUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

*/
/**
 * TODO
 *
 * @author jxc
 * @date 2020/6/24
 *//*

@Slf4j
public class BsseInfoDataListener extends AnalysisEventListener<BaseInfoDto> {
    private IStockInfoService stockInfoService;
    private IBaseInfoService baseInfoService;
    private IRegisterInfoService registerInfoService;
    private IRegionCnService regionCnService;
    private List<BaseInfo> chanQuanCompanyList = new ArrayList<>();
    private Set<Long> sets = new HashSet<>();
    private Long baseId;
    private String companyName;

    private String exprotPath;

    // 记录产权企业数量
    private int chanQuanCompanyCount = 0;
    private List<BaseInfoEntity> qiXinBaoCompanyList;

    public BsseInfoDataListener(IStockInfoService stockInfoService,
                                IBaseInfoService baseInfoService,
                                IRegisterInfoService registerInfoService,
                                IRegionCnService regionCnService,
                                List<BaseInfoEntity> list,long baseId,
                                String companyName) {
        this.stockInfoService = stockInfoService;
        this.baseInfoService = baseInfoService;
        this.registerInfoService = registerInfoService;
        this.regionCnService = regionCnService;
        this.qiXinBaoCompanyList = list;
        this.baseId = baseId;
        this.companyName = companyName;
        this.exprotPath = "C:\\Users\\jiangxuecheng\\Desktop\\数据对比\\处理\\"+companyName+".xlsx";
    }

    */
/**
     * 这个每一条数据解析都会来调用
     *//*

    @Override
    public void invoke(BaseInfoDto data, AnalysisContext context) {
        BaseInfoEntity entity = new BaseInfoEntity();
        BeanUtils.copyProperties(data,entity);
        qiXinBaoCompanyList.add(entity);
    }

    */
/**
     * 所有数据解析完成了 都会来调用
     *//*

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        this.recursion(baseId);
        sets.add(baseId);
        sets.forEach(bId->{
            BaseInfo baseInfo = baseInfoService.getById(bId);
            if(baseInfo!=null){
                chanQuanCompanyList.add(baseInfo);
            }else{
                log.info("企业被删除，企业id:{}",baseId);
            }
        });

        List<BaseInfoEntity> exprotData = new ArrayList<>();
        qiXinBaoCompanyList.forEach(qiXinBaoCompanyInfo->{
            // 数据情况  产权/启信宝
            String shuJu_QingKuang  = "";
            // 信息情况 正常  信息有差异
            String xinXin_QingKuang = "";

            // 产权列表是否存在
            BaseInfo chanQuanCompanyInfo = this.qixinbaoExistInChanquan(qiXinBaoCompanyInfo);
            if(chanQuanCompanyInfo!=null){
                chanQuanCompanyCount++;
                shuJu_QingKuang="产权/启信宝";
                // 对比信息差异
               if(this.biDuiCompanyInfo(chanQuanCompanyInfo,qiXinBaoCompanyInfo)){
                   xinXin_QingKuang = "正常";
               }else{
                   xinXin_QingKuang= "信息有差异";
               }
            }else{
                shuJu_QingKuang="启信宝";
                xinXin_QingKuang = "";
            }
            qiXinBaoCompanyInfo.setShujuqingkuang(shuJu_QingKuang);
            qiXinBaoCompanyInfo.setXinxinqingkuang(xinXin_QingKuang);
            exprotData.add(qiXinBaoCompanyInfo);
        });

        chanQuanCompanyList.forEach(baseInfo -> {
            // 启信宝是否存在
            BaseInfoEntity qiXinBaoCompanyInfo = this.chanquanExistInqixinbao(baseInfo);
            if(qiXinBaoCompanyInfo==null){
                chanQuanCompanyCount++;
                BaseInfoEntity entity = new BaseInfoEntity();
                this.setCompanyInfo(baseInfo,entity);
                entity.setShujuqingkuang("产权"); // 数据情况
                entity.setXinxinqingkuang(""); // 信息情况
                exprotData.add(entity);
            }
        });

        log.info("产权企业数量：{}", chanQuanCompanyCount);

        // 导出企业信息
        try {
            File file = ResourceUtils.getFile(exprotPath);
            String fileName = file.getPath();
            EasyExcel.write(fileName, BaseInfoEntity.class).sheet(companyName).doWrite(exprotData);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            log.error("导出异常:{}",e.toString());
        }
    }

    @Override
    public void invokeHead(Map<Integer, CellData> headMap, AnalysisContext context) {}

    @Override
    public void onException(Exception exception, AnalysisContext context){}

    */
/**
     * 递归查询子企业
     *//*

    public void recursion(long baseId){
        // 获取当前企业股东
        List<StockInfo> stockInfos = stockInfoService.getStockInfoByHoldid(baseId);
        stockInfos.forEach(stockInfo->{
            // 如果是控股
            if(stockInfo.getIsHold()==1){
                sets.add(stockInfo.getBaseId());
                recursion(stockInfo.getBaseId());
            }else{
                // 参股
                sets.add(stockInfo.getBaseId());
            }
        });
    }

    */
/**
     * 比对企业信息
     *//*

    private boolean biDuiCompanyInfo( BaseInfo chanQuanCompanyInfo,BaseInfoEntity qiXinBaoCompanyInfo){
        RegisterInfo registerInfo = registerInfoService.getById(chanQuanCompanyInfo.getId());
        // 比较信息差异
        String zuCeZhiBen = qiXinBaoCompanyInfo.getZucezhiben()==null?"":qiXinBaoCompanyInfo.getZucezhiben();
        zuCeZhiBen = zuCeZhiBen.replace("万","")
                .replace("元","")
                .replace("人","")
                .replace("民","")
                .replace("币","");
        String registerCapital= registerInfo.getRegisterCapital()==null?"":String.valueOf(registerInfo.getRegisterCapital());
        registerCapital = registerCapital.replace(".00","");
        // 对比信息差异
        if(
            qiXinBaoCompanyInfo.getZhijiegubi().equals( chanQuanCompanyInfo.getHoldRatio()+"%") &&
            zuCeZhiBen.equals(registerCapital) &&
            qiXinBaoCompanyInfo.getZhuzhijigoudaima().equals(chanQuanCompanyInfo.getOrganizationCode())
        ){
            // 信息相同
            return true;
        }else{
            // 信息存在差异
            return false;
        }
    }

    */
/**
     * 设置企业信息
     *//*

    private void setCompanyInfo(BaseInfo baseInfo,BaseInfoEntity entity ){
        // 工商信息
        RegisterInfo registerInfo = registerInfoService.getById(baseInfo.getId());
        // 产权单位信息
        BaseInfo propertyUnit=null;
        if(baseInfo.getPropertyUnitId()!=null){
            propertyUnit = baseInfoService.getById(baseInfo.getPropertyUnitId());
        }
        entity.setCompanyName(baseInfo.getCompanyName()); // 企业名称
        entity.setShehuixinyongdaima(""); //统一社会信用代码
        entity.setZhuzhijigoudaima(baseInfo.getOrganizationCode()); // 组织机构代码
        entity.setChuantoubili("");//穿透股比
        entity.setZhijiegubi(String.valueOf(baseInfo.getHoldRatio())+"%"); // 直接股比
        entity.setChanquancengji(String.valueOf(baseInfo.getLevel())); // 产权层级
        entity.setShifoukonggu(baseInfo.getHasControlPower()==1?"是":"否"); //是否控股
        entity.setZhucehao(registerInfo.getBRegisterNo());//注册号
        entity.setGongsiType("");//公司类型
        entity.setChengliriqi(registerInfo.getSetupDate()==null?null:  DateUtil.format(registerInfo.getSetupDate()));//成立日期
        entity.setHezunriqi("");//核准日期
        entity.setJingyingState(EnumUtil.getDesc(CompanyConstants.OperatingConditions.class,registerInfo.getBusinessState()));//经营状态
        entity.setFadingdaibiaoren(registerInfo.getDelegate());//法定代表人
        entity.setZucezhiben(String.valueOf(registerInfo.getRegisterCapital()));//注册资本
        entity.setSheng("");//省
        entity.setShengdaima("");//省代码
        entity.setShi("");//市
        entity.setShidama("");//市代码
        entity.setSuozaiquyu("");//所在区域
        entity.setQuyudaima("");//区域代码
        entity.setQiyedizhi(registerInfo.getRegisterAddress());//企业地址
        entity.setYijiname("");//一级行业名称
        entity.setYijicode("");//一级行业代码
        entity.setErjiname("");//二级行业名称
        entity.setErjicode(""); //二级行业代码
        entity.setJingyingfanwei(registerInfo.getBusinessScope());//经营范围

        if(propertyUnit!=null){
            entity.setChanquandanwei(propertyUnit.getCompanyName()); // 产权单位
            entity.setChanquandanweizhuzijigoudaima(propertyUnit.getOrganizationCode()); //产权单位组织机构代码
            entity.setChanquandanweitongyishehui(""); //产权单位统一社会信用代码
        }else{
            entity.setChanquandanwei("");// 产权单位
            entity.setChanquandanweizhuzijigoudaima("");//产权单位组织机构代码
            entity.setChanquandanweitongyishehui(""); //产权单位统一社会信用代码
        }

        // 区域
        Integer areaId = registerInfo.getAreaId();
        RegionCn regionCn = null;
        Integer quPid = null;
        if(areaId!=null){
            // 所在区
            regionCn = regionCnService.getById(areaId);
            if(regionCn!=null){
                entity.setSuozaiquyu(regionCn.getName());//所在区域
                entity.setQuyudaima(regionCn.getCitycode());//区域代码
                quPid = regionCn.getPid();
            }
        }
        // 城市
        RegionCn cityRegionCn = null;
        Integer cityPid = null;
        if(quPid!=null){
            cityRegionCn = regionCnService.getById(quPid);
            if(cityRegionCn!=null){
                entity.setShi(cityRegionCn.getName());//市
                entity.setShidama(cityRegionCn.getCitycode());//市代码
                cityPid = cityRegionCn.getPid();
            }
        }
        // 省份
        if(cityPid!=null){
            RegionCn shengRegionCn = regionCnService.getById(cityPid);
            if(shengRegionCn!=null){
                entity.setSheng(shengRegionCn.getName());//省
                entity.setShengdaima(shengRegionCn.getCitycode());//省代码
            }
        }
    }

    */
/**
     * 查找启信宝企业在产权内是否存在
     * @param entity
     * @return com.etop.property.right.entity.BaseInfo
     * @author jxc
     * @date 2020/6/28 9:54
     *//*

    private BaseInfo qixinbaoExistInChanquan(BaseInfoEntity entity){
        for (BaseInfo baseInfo : chanQuanCompanyList) {
            if(entity.getCompanyName().equals(baseInfo.getCompanyName())){
                return baseInfo;
            }
        }
        return null;
    }

    */
/**
     *  查找产权企业在启信宝内是否存在
     * @param baseInfo
     * @return com.etop.property.right.excel.BaseInfoEntity
     * @author jxc
     * @date 2020/6/28 9:53
     *//*

    private BaseInfoEntity chanquanExistInqixinbao(BaseInfo baseInfo){
        for (BaseInfoEntity entity : qiXinBaoCompanyList) {
            if(baseInfo.getCompanyName().equals(entity.getCompanyName())){
                return entity;
            }
        }
        return null;
    }
}
*/
