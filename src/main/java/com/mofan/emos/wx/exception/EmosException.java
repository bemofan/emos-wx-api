package com.mofan.emos.wx.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author mofan
 * @date 2021/2/18 5:47
 */
@EqualsAndHashCode(callSuper = true)
@Data
public class EmosException extends RuntimeException{
    private String msg;
    private int code = 500;

    public EmosException(String msg) {
        super(msg);
        this.msg = msg;
    }

    public EmosException(String msg, Throwable e) {
        super(msg, e);
        this.msg = msg;
    }

    public EmosException(String msg, int code) {
        super(msg);
        this.msg = msg;
        this.code = code;
    }

    public EmosException(String msg, int code, Throwable e) {
        super(msg, e);
        this.msg = msg;
        this.code = code;
    }
}
