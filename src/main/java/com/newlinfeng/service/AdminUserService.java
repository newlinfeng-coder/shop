package com.newlinfeng.service;

import com.newlinfeng.entity.AdminUser;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @Time : 2018/7/25 11
 * @Author : NewLinfeng
 * @Site :
 * @Software : IntellJ IDEA 2016.2.1
 */
public interface AdminUserService {

    List<AdminUser> selectAll();

    /**
     * 登陆验证方法
     * @param username
     * @param password
     * @param code
     * @param session
     * @return
     */
    int selectLoginUser(String username, String password, String code, HttpSession session);
}
