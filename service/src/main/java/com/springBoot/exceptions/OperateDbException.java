package com.springBoot.exceptions;

/**
 * @description:
 * @author: 1063:马冬冬
 * @date: 2017/08/04.
 */
public class OperateDbException extends Exception {

    private String errCode;

    private String errMsg;

    public OperateDbException(String errCode, String errMsg){
        this.errCode = errCode;
        this.errMsg = errMsg;

    }

    public String getErrCode() {
        return errCode;
    }

    public String getErrMsg() {
        return errMsg;
    }
}
