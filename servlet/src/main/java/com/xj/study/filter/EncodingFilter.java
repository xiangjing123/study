package com.xj.study.filter;


import lombok.extern.slf4j.Slf4j;
import java.io.IOException;
import java.util.Map;
import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: xiangjing
 * @Date: 2018/10/10 0010 10:17
 * @Description:
 */
@Slf4j
@WebFilter(urlPatterns={"/*"},asyncSupported=true,initParams={@WebInitParam(name="encoding",value="UTF-8")})
public class EncodingFilter implements Filter {

    /**
     * 默认编码
     */
    private final String default_encode = "UTF-8";
    /**
     * 编码
     */
    private String encode;

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

        String encodingParam = filterConfig.getInitParameter("encoding");
        System.out.println("filter init "+encodingParam);
        if (null != encodingParam && encodingParam.length() != 0) {
            this.encode = encodingParam;
        } else {
            this.encode = default_encode;
        }

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        String method = request.getMethod();
        if ("post".equalsIgnoreCase(method)) {
            request.setCharacterEncoding(this.encode);
        } else if ("get".equalsIgnoreCase(method)) {
                Map<String,String[]> params =request.getParameterMap();
                for(Map.Entry<String,String[]> entry:params.entrySet()){
                    String[] values = entry.getValue();
                    for(String value:values){
                        value = new String(value.getBytes("ISO-8859-1"),this.encode);
                    }
                }
        }
        filterChain.doFilter(request,servletResponse);

    }

    @Override
    public void destroy() {
        log.info(this.getClass().getName() + " is destroy");
    }
}
