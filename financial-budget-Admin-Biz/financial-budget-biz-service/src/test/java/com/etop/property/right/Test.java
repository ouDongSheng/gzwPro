/*
package com.etop.property.right;

import com.alibaba.excel.EasyExcel;
import com.etop.property.right.entity.BaseInfo;
import com.etop.property.right.entity.StockInfo;
import com.etop.property.right.excel.BaseInfoDto;
import com.etop.property.right.excel.BaseInfoEntity;
import com.etop.property.right.excel.BsseInfoDataListener;
import com.etop.property.right.mapper.BaseInfoMapper;
import com.etop.property.right.mapper.CompanyShipMapper;
import com.etop.property.right.mapper.StockInfoMapper;
import com.etop.property.right.model.base.SimpleStockInfo;
import com.etop.property.right.service.IBaseInfoService;
import com.etop.property.right.service.IRegionCnService;
import com.etop.property.right.service.IRegisterInfoService;
import com.etop.property.right.service.IStockInfoService;
import com.etop.property.right.service.impl.BaseInfoServiceImpl;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springblade.core.test.BladeBootTest;
import org.springblade.core.test.BladeSpringRunner;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.ResourceUtils;
import javax.annotation.Resource;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

@Slf4j
@RunWith(BladeSpringRunner.class)
@SpringBootTest(classes = BaseTest.class)
@BladeBootTest(appName = "etop-message", profile = "pre", enableLoader = true)
public class Test {

    @Resource
    private IBaseInfoService baseInfoService;
    @Resource
    private IStockInfoService stockInfoService;
    @Resource
    private BaseInfoMapper baseInfoMapper;
    @Resource
    private StockInfoMapper stockInfoMapper;
    @Resource
    private BaseInfoServiceImpl infoService;
    @Resource
    private CompanyShipMapper companyShipMapper;
    @Resource
    private IRegisterInfoService registerInfoService;
    @Resource
    private IRegionCnService regionCnService;

    private List<BaseInfo> baseInfos = new ArrayList<>();
    private Set<Long> sets = new HashSet<>();

//    @org.junit.Test
    public void Test(){
        Map<Long,String> map = new HashMap<>();
        map.put(386L,"深圳市特发集团有限公司");
        map.put(771L,"深业集团有限公司");
        map.put(930L,"深圳市资本运营集团有限公司");
        map.put(2533L,"深圳能源集团股份有限公司");
        map.put(2605L,"深圳市投资控股有限公司");
        map.put(2743L,"深圳市创新投资集团有限公司");
        map.forEach((baseId,companyName)->{
            log.info("企业id:{},企业名称:{}",baseId,companyName);
            this.writeExcel(baseId,companyName);
        });
        System.out.println("结束.");
    }

    */
/**
     * 查询子企业
     * @return
     * @author jxc
     * @date 2020/6/22 18:06
     *//*

//    @org.junit.Test
    public void findChindCompanyInfo() {
        */
/*
        //控股企业id
        List<Long> isHoldBaseIds = new ArrayList<>();
        //所有下级企业id
        List<Long> allHoldBaseIds = companyShipMapper.getAllChildBaseId(baseId);
        //股权表所有数据
        List<SimpleStockInfo> allSimpleStockInfo = stockInfoMapper.getAllSimpleStockInfo();
        //获取所有控股企业id
        infoService.getBaseIdByHoldId(baseId,allSimpleStockInfo,isHoldBaseIds);
        System.out.println(isHoldBaseIds.stream().distinct().count());
        *//*


        sets.add(2605L);
        this.recursion(2605L);
        System.out.println("子企业数量："+sets.size());
        sets.forEach(bId->{
            BaseInfo baseInfo = baseInfoService.getById(bId);
            if(baseInfo==null){
                System.out.println(123);
            }
            baseInfos.add(baseInfo);
        });

//        try {
//            File file = ResourceUtils.getFile("C:\\Users\\jiangxuecheng\\Desktop\\base_info.xlsx");
//            String fileName = file.getPath();
//            EasyExcel.write(fileName, CompanyInfo.class).sheet("Sheet1").doWrite(baseInfos);
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//
//        }
    }


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



    private void writeExcel(long baseId,String companyName)   {
        List<BaseInfoEntity> list = new ArrayList<>();
        BaseInfoEntity dto = new BaseInfoEntity();
        dto.setShujuqingkuang("数据情况");
        dto.setXinxinqingkuang("信息情况");
        dto.setCompanyName("企业名称");
        dto.setShehuixinyongdaima("统一社会信用代码");
        dto.setZhuzhijigoudaima("组织机构代码");
        dto.setChanquandanwei("产权单位");
        dto.setChanquandanweitongyishehui("产权单位统一社会信用代码");
        dto.setChanquandanweizhuzijigoudaima("产权单位组织机构代码");
        dto.setChuantoubili("穿透股比");
        dto.setZhijiegubi("直接股比");
        dto.setChanquancengji("产权层级");
        dto.setShifoukonggu("是否控股");
        dto.setZhucehao("注册号");
        dto.setGongsiType("公司类型");
        dto.setChengliriqi("成立日期");
        dto.setHezunriqi("核准日期");
        dto.setJingyingState("经营状态");
        dto.setFadingdaibiaoren("法定代表人");
        dto.setZucezhiben("注册资本");
        dto.setSheng("省");
        dto.setShengdaima("省代码");
        dto.setShi("市");
        dto.setShidama("市代码");
        dto.setSuozaiquyu("所在区域");
        dto.setQuyudaima("区域代码\n");
        dto.setQiyedizhi("企业地址\n");
        dto.setYijiname("一级行业名称\n");
        dto.setYijicode("一级行业代码\n");
        dto.setErjiname("二级行业名称\n");
        dto.setErjicode("二级行业代码\n");
        dto.setJingyingfanwei("经营范围");
        list.add(dto);
        try {
            String resourceLocation = "C:\\Users\\jiangxuecheng\\Desktop\\数据对比\\筛选\\"+companyName+".xlsx";
            File file = ResourceUtils.getFile(resourceLocation);
            String fileName = file.getPath();
            EasyExcel.read(fileName, BaseInfoDto.class, new BsseInfoDataListener(stockInfoService,baseInfoService,
                    registerInfoService,regionCnService,list,baseId,companyName)).sheet().doRead();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }


    */
/**
     * TODO公司企业信息导出
     * @param
     * @return void
     * @author jxc
     * @date 2020/6/22 18:05
     *//*

//    @org.junit.Test
    public void exprotCompanyInfo() {
        List<CompanyInfo> data = new ArrayList<>();

        List<BaseInfo> baseInfos = baseInfoMapper.getAllBaseInfo();
        baseInfos.forEach(baseInfo -> {
            CompanyInfo companyInfo =  new CompanyInfo();
            companyInfo.setCompanyName(baseInfo.getCompanyName());
            companyInfo.setTongyia("");
            companyInfo.setOrganizationCode(baseInfo.getOrganizationCode());

            BaseInfo propertyUnit = baseInfoService.getById(baseInfo.getPropertyUnitId());
            if(propertyUnit!=null){
                companyInfo.setPropertyUnit(propertyUnit.getCompanyName());
                companyInfo.setPropertyUnitOrganizationCode(propertyUnit.getOrganizationCode());
                companyInfo.setPropertyUnitTongyib("");
            }
            companyInfo.setHoldRatio(String.valueOf(baseInfo.getHoldRatio() )+"%");
            companyInfo.setLevel(baseInfo.getLevel());
            companyInfo.setHasControlPower(baseInfo.getHasControlPower()==1?"是":"否");
            data.add(companyInfo);
        });

        try {
            File file = ResourceUtils.getFile("C:\\Users\\jiangxuecheng\\Desktop\\baseInfo.xlsx");
            String fileName = file.getPath();
            EasyExcel.write(fileName, CompanyInfo.class).sheet("Sheet1").doWrite(data);
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }
    }



}



@Data
class CompanyInfo  {
    @ApiModelProperty(value = "企业名称")
    private String companyName;

    @ApiModelProperty(value = "产权单位统一社会信用代码")
    private String  tongyia;

    @ApiModelProperty(value = "组织机构代码")
    private String organizationCode;

    @ApiModelProperty(value = "产权单位")
    private String propertyUnit;

    @ApiModelProperty(value = "产权单位统一社会信用代码")
    private String  propertyUnitTongyib;

    @ApiModelProperty(value = "产权单位组织机构代码")
    private String propertyUnitOrganizationCode;

    @ApiModelProperty(value = "持股比例")
    private String holdRatio;

    @ApiModelProperty(value = "层级")
    private Integer level;

    @ApiModelProperty(value = "是否具有控制力")
    private String hasControlPower;

}

*/
