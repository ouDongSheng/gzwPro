package com.gzw.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import java.util.List;
import com.gzw.entity.BaseInfo;
import org.springblade.modules.develop.entity.Code;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;
@Mapper
public interface BaseInfoDao {

    int insert(@Param("pojo") BaseInfo pojo);

    int insertList(@Param("pojos") List< BaseInfo> pojo);

    List<BaseInfo> select(@Param("pojo") BaseInfo pojo);

    int update(@Param("pojo") BaseInfo pojo);

}
