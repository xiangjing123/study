package com.xj.study.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/10 0010 11:33
 * @Description:
 */
@WebServlet(urlPatterns = {"/login"})
public class SyncServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("调用同步处理");
        String userName = req.getParameter("username");
        String passwd = req.getParameter("passwd");
        String msg = "";
        if (null != userName && userName.trim().length() != 0) {
            if (!"张三".equalsIgnoreCase(userName)) {
                msg = "用户名错误";
            }
            if (null != passwd && passwd.trim().length() != 0) {
                if (!"xj123$%^".equalsIgnoreCase(passwd)) {
                    msg = "密码错误!";
                }
            }else{
                msg = " 密码不能为空！";
            }
        } else {
            msg = " 用户名不能为空！";
        }
        if (msg.trim().length() == 0) {
            msg = "登录成功!";
        }

        req.setAttribute("msg", msg);
        req.getRequestDispatcher("/view/success.jsp").forward(req, resp);
    }
}
