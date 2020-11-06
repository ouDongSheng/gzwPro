package com.gzw.service;

import com.gzw.entity.BaseInfo;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;

import com.gzw.dao.BaseInfoDao;

@Service
public class BaseInfoService {

    @Resource
    private BaseInfoDao baseInfoDao;

    public int insert(BaseInfo pojo){
        return baseInfoDao.insert(pojo);
    }

    public int insertList(List< BaseInfo> pojos){
        return baseInfoDao.insertList(pojos);
    }

    public List<BaseInfo> select(BaseInfo pojo){
        return baseInfoDao.select(pojo);
    }

    public int update(BaseInfo pojo){
        return baseInfoDao.update(pojo);
    }

}
