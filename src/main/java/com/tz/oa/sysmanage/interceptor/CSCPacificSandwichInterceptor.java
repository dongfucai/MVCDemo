package com.tz.oa.sysmanage.interceptor;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @Package Name : ${PACKAG_NAME}
 * @Author : dongfucai@meituan.com
 * @Creation Date : 2018年05月28日下午3:35
 * @Function : todo
 */
public class CSCPacificSandwichInterceptor extends HandlerInterceptorAdapter {


    private ThreadLocal<Long> longThreadLocal =  new ThreadLocal<>();

    public CSCPacificSandwichInterceptor(){super();}

    /**
     *  在请求出来之前，该方法用于准备资源数据的
     * @param request
     *
     */

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (checkPrintLog(request)) {
            return super.preHandle(request, response, handler);
        }
        longThreadLocal.set(System.currentTimeMillis());


        String authorization = request.getHeader("Authorization");
        System.out.println("authorization::      " + authorization);


        String date = request.getHeader("Date");
        System.out.println("date:   "+ date);

        String url = request.getRequestURI();
        System.out.println("url:   "+ url);

        String uri = request.getRequestURI();
        System.out.println("uri:   "+ uri);



        return super.preHandle(request, response, handler);
    }

    /**
     * 该方法将在整个请求完成之后，也就是说在视图渲染之后进行调用，主要用于进行一些资源的释放
     *
     * 该方法在这个请求 完成之后 ，进行视图渲染，然后进行一些资源的释放。
     *
     * @param request
     * @param response
     * @param handler
     * @param ex
     */
    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        if (checkPrintLog(request)) {
            super.afterCompletion(request, response, handler, ex);
        } else {
            Long startTime = longThreadLocal.get();
            if (startTime == null) {
                startTime = System.currentTimeMillis();
            }
            long costTime = System.currentTimeMillis() - startTime;
            super.afterCompletion(request, response, handler, ex);

            System.out.println("costTime::   "+costTime);



        }

    }


    /**
     * 判定是否需要输出日志
     *
     * @param request
     * @return
     */
    private boolean checkPrintLog(HttpServletRequest request) {
        if (request != null && request.getRequestURI() != null && request.getRequestURI().indexOf("heartbeat") < 0) {
            return false;
        }
        return true;
    }



}
