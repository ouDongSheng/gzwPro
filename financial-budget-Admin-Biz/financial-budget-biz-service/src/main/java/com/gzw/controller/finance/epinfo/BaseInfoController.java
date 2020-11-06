package com.gzw.controller.finance.epinfo;

import com.gzw.common.Result;
import com.gzw.entity.BaseInfo;
import com.gzw.service.BaseInfoService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController(value = "baseInfoController")
@RequestMapping(value = "baseInfo")
public class BaseInfoController {
    @Autowired
    private BaseInfoService baseInfoService;

    @GetMapping(value = "list")
    public List<BaseInfo> list() {
        BaseInfo pojo = new BaseInfo();
        pojo.setId(111);
        return baseInfoService.select(pojo);
//        return Result.success("查询成功", baseInfoList);
    }
}
