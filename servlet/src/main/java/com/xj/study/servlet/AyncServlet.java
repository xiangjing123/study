package com.xj.study.servlet;

import com.xj.study.listener.AsyncLintener;

import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.ServletResponse;
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
@WebServlet(urlPatterns = {"/asyncLogin"}, asyncSupported = true)
public class AyncServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("servlert init");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println(Thread.currentThread().getName() + " 调用异步处理");
        AsyncContext context = req.startAsync();

        context.setTimeout(20000);
        context.addListener(new AsyncLintener());
        context.start(() -> {
            try {
                HttpServletRequest request = (HttpServletRequest)context.getRequest();
                String userName = request.getParameter("username");
                String passwd = request.getParameter("passwd");
                String msg = "";
                if (null != userName && userName.trim().length() != 0) {
                    if (!"张三".equalsIgnoreCase(userName)) {
                        msg = "用户名错误";
                    }
                    if (null != passwd && passwd.trim().length() != 0) {
                        if (!"xj123$%^".equalsIgnoreCase(passwd)) {
                            msg = "密码错误!";
                        }
                    } else {
                        msg = " 密码不能为空！";
                    }
                } else {
                    msg = " 用户名不能为空！";
                }
                if (msg.trim().length() == 0) {
                    msg = "登录成功!";
                }

                HttpServletResponse response = (HttpServletResponse)context.getResponse();
                response.setHeader("Content-type", "text/html;charset=UTF-8");
                response.getWriter().print(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
            context.complete();
            System.out.println("子线程结束..... "+Thread.currentThread()+" end "+ System.currentTimeMillis());
        });
        System.out.println("主线程结束..... "+Thread.currentThread()+" end "+ System.currentTimeMillis());

    }

    @Override
    public void destroy() {
        System.out.println("servlet destroy");
    }
}
