package com.tlcb.springbootdemo.web;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2019/1/29
 * @Time: 14:22
 * Description:
 */
@RestController
public class HelloController {
    @ApiOperation(value = "hello world" ,notes = "")
    @ApiImplicitParam(name = "name" ,value = "用户姓名")
    @RequestMapping("/hello")
    public String index(String name ,String age) {
        return "Hello World";
    }
}
