package com.newlinfeng.service.impl;

import com.newlinfeng.entity.AdminUser;
import com.newlinfeng.entity.AdminUserExample;
import com.newlinfeng.mapper.AdminUserMapper;
import com.newlinfeng.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Time : 2018/7/25 11
 * @Author : NewLinfeng
 * @Site :
 * @Software : IntellJ IDEA 2016.2.1
 */

@Service
public class AdminUserServiceImpl implements AdminUserService{

    @Autowired
    private AdminUserMapper adminUserMapper;

    @Override
    public List<AdminUser> selectAll() {
        return adminUserMapper.selectByExample(new AdminUserExample());
    }

    @Override
    public int selectLoginUser(String username, String password, String code, HttpSession session) {
        String servercode = (String) session.getAttribute("code");
        if(servercode!=null && servercode.equals(code)){
            //验证码填写成功

            AdminUserExample adminUserExample = new AdminUserExample();
            adminUserExample.createCriteria().andUsernameEqualTo(username).andPasswordEqualTo(password);
            List<AdminUser> adminUsers = adminUserMapper.selectByExample(adminUserExample);
            if(adminUsers!=null && adminUsers.size()>0){
                AdminUser adminUser = adminUsers.get(0);

                //将当前用户信息保存到session中去
                session.setAttribute("adminUser", adminUser);

                //表示登陆成功
                return 2;
            }else {

                //账号和密码错误
                return 1;

            }

        }else {

        }

        //验证码错误
        return 0;
    }
}
