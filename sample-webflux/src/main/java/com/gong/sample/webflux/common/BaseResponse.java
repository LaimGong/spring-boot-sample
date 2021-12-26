package com.gong.sample.webflux.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseResponse implements Response {

    private int code;

    private String msg;

    public static BaseResponse success() {
        return newResponse(SUCCESS, "Success");
    }

    public static BaseResponse ofErrMsg(String errMsg) {
        return newResponse(EXCEPTION, errMsg);
    }

    private static BaseResponse newResponse(int code, String msg) {
        BaseResponse response = new BaseResponse();
        response.setMsg(msg);
        response.setCode(code);
        return response;
    }

}
