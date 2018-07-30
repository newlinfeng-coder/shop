package com.newlinfeng.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Time : 2018/7/27 10
 * @Author : NewLinfeng
 * @Site :
 * @Software : IntellJ IDEA 2016.2.1
 */

@Controller
@RequestMapping("/admin/index")
public class IndexController {

    @RequestMapping("/index")
    public String index(){
        return "/admin/index/index";
    }
}
