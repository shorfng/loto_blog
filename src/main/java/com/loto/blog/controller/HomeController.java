package com.loto.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Author：蓝田_Loto
 * Date：2019-12-18 23:46
 * PageName：HomeController.java
 * Function：启动页
 */

@Controller
@RequestMapping("/")
public class HomeController {
    /**
     * 第一个接口
     * @return 返回字符串
     */
    @RequestMapping("/home")
    public String home() {
        return "success";
    }

    /**
     * 访问第一个html页面
     * @return 返回字符串
     */
    @RequestMapping("/index")
    public String index() {
        return "/index";
    }
}
