package com.xj.study.servlet;

import javax.servlet.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.*;
import java.util.List;

/**
 *
 *
 * @auther: xiangjing
 * @version: 1.0
 * @since: 1.0
 * @createTime: 2018-10-22 10:31
 */
@WebServlet(urlPatterns = "/upload")
@MultipartConfig
public class AyncUploadServlet extends HttpServlet {


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {


        Part part = req.getPart("file");
        System.out.println(part.getName());
        File file = new File("D:/upload/" + getFileName(part));
        if(!file.exists()){
            file.createNewFile();
        }
        part.write("D:/upload/" + getFileName(part));
        resp.setHeader("Content-type","application/json;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        out.println("上传成功");
        out.flush();
        out.close();


    }

    private String getFileName(Part request) {
        String desc = request.getHeader("Content-Disposition");
        return desc.split(";")[2].split("=")[1].replaceAll("\"","");
    }
}
