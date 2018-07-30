package com.newlinfeng.controller.common;

import com.newlinfeng.service.AdminUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.Random;

/**
 * @Time : 2018/7/27 09
 * @Author : NewLinfeng
 * @Site :
 * @Software : IntellJ IDEA 2016.2.1
 */

@Controller
@RequestMapping("/common/public")
public class PublicController {

    @Autowired
    private AdminUserService adminUserService;

    @RequestMapping("/index")
    public String index(){
        return "/common/public/index";
    }

    /**
     * 验证码的方法
     * @Author llf
     */
    @RequestMapping("/random")
    public void random(HttpServletResponse response, HttpSession session){

        BufferedImage bufferedImage = new BufferedImage(140, 40, BufferedImage.TYPE_INT_ARGB);
        Graphics graphics = bufferedImage.createGraphics();
        graphics.setColor(Color.black);
        graphics.setFont(new Font("黑体", Font.BOLD, 30));

        String[] allString = new String[]{"1", "2", "3", "4", "5", "6", "7", "8", "9", "A", "B", "C", "D", "E", "F", "G"};
        Random random = new Random();
        String tempStr = "";
        for (int i = 0; i < 5; i++) {
            tempStr += allString[random.nextInt(allString.length)];
        }

        //将验证码的内容存到session中，只要浏览器不关闭的话，在任何地方都可以取到这个值
        session.setAttribute("code", tempStr);

        graphics.drawString(tempStr, 10, 30);
        try {
            ImageIO.write(bufferedImage, "png", response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @RequestMapping("/submitLogin")
    public void submitLogin(String username, String password, String code, HttpSession session, HttpServletResponse response)
            throws IOException {
        int flag = adminUserService.selectLoginUser(username, password, code, session);

        response.setContentType("text/html;charset=UTF-8");
        if(flag == 0){
            //验证码错误
            response.getWriter().print("<script type='text/javascript'>alert('验证码错误');window.location.go(-1);</script>");
        }else if(flag == 1) {
            //账号或者密码错误
            response.getWriter().print("<script type='text/javascript'>alert('账号或者密码错误');window.location.go(-1);</script>");
        }else if(flag == 2) {
            //登陆成功
            response.getWriter().print("<script type='text/javascript'>alert('登陆成功！');window.location.href=\"/admin/index/index\"</script>");
        }
    }
}
