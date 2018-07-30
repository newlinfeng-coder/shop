package com.newlinfeng.controller.admin;

import com.newlinfeng.entity.AdminUser;
import com.newlinfeng.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * @Time : 2018/7/25 11
 * @Author : NewLinfeng
 * @Site :
 * @Software : IntellJ IDEA 2016.2.1
 */

@Controller
@RequestMapping("/admin/adminUser")
public class AdminUserController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping("/index")
    public String index(ModelMap map){
        List<AdminUser> list = adminUserService.selectAll();
        map.put("list", list);
        return "/admin/adminUser/index";
    }
}
