package com.study.stuhostelsys.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * 测试类
 */

// @RestController： 代表是一个controller，可以接收前台发送的请求，对数据进行处理
@RestController
public class hellocontroller {

    //从 application.properties中读取配置，如取不到默认值为HelloShanhy
    @Value("${application.hello:Hello Angel}")
    private String hello;

    @RequestMapping(value = "hello", method = RequestMethod.GET)
    public String say() {
        return "Hello Word !";
    }

    /**
     * 视图绑定
     * @return
     */
    @RequestMapping(value = "/helloJsp")
    public ModelAndView index(){
        ModelAndView index = new ModelAndView("index");
        index.addObject("hello", hello);
        return index;
    }

    @RequestMapping("/home")
    public ModelAndView home() {
        ModelAndView home = new ModelAndView("home");
        return home;
    }

    @RequestMapping(value = "/test",method = RequestMethod.GET)
    public String listAllUser() {
        //List<userModel> list = jdbcTemplate.query("select * from users", new Object[]{}, new BeanPropertyRowMapper(userModel.class));
        return "";
    }
}
