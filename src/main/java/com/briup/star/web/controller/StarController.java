package com.briup.star.web.controller;

import com.briup.star.bean.Star;
import com.briup.star.util.Message;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class StarController {
    @GetMapping("/test1")
    @ApiOperation(value="测试")
    @ApiImplicitParams({@ApiImplicitParam(name="id",value="序号",paramType = "query",dataType = "int",required = true)})
    public Message test1(Star star){
        Message<String> message=new Message<>();
        message.setData("Lee");
        message.setMessage("Success!");
        message.setStatus(150);
        Date date=new Date();
        message.setTime(date.getTime());
        return message;

    }

}
