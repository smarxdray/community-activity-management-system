package com.cams.utils;

import lombok.Data;

/**
 *
 * @Title: Response.java
 * @Description: 自定义响应数据结构
 * 				这个类是提供给门户，ios，安卓，微信商城用的
 * 				门户接受此类数据后需要使用本类的方法转换成对于的数据类型格式（类，或者list）
 * 				其他自行处理
 * 				200：表示成功
 * 				500：表示错误，错误信息在msg字段中
 * 				501：bean验证错误，不管多少个错误都以map形式返回
 * 				502：拦截器拦截到用户token出错
 */
@Data
public class Response {

    // 响应业务状态
    private Integer code;

    // 响应消息
    private String msg;

    // 响应中的数据
    private Object data;

    public static Response build(Integer status, String msg, Object data) {
        return new Response(status, msg, data);
    }

    public static Response ok(Object data) {
        return new Response(data);
    }

    public static Response ok() {
        return new Response(null);
    }

    public static Response errorMsg(String msg) {
        return new Response(500, msg, null);
    }

    public static Response errorMap(Object data) {
        return new Response(501, "error", data);
    }

    public static Response errorTokenMsg(String msg) {
        return new Response(502, msg, null);
    }

    public static Response errorException(String msg) {
        return new Response(555, msg, null);
    }

    public Response() {

    }

    public Response(Integer code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public Response(Object data) {
        this.code = 200;
        this.msg = "OK";
        this.data = data;
    }
}
