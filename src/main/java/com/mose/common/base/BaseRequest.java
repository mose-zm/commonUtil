package com.mose.common.base;

import javax.servlet.http.HttpServletRequest;

public class BaseRequest {

    public static String getHeaderParam(HttpServletRequest request,String key) {
        return request.getHeader(key);
    }

    public static String getQueryParam(HttpServletRequest request,String key) {
        return request.getParameter(key);
    }

}
