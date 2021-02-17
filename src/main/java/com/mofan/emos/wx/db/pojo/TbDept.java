package com.mofan.emos.wx.db.pojo;

import lombok.Data;

import java.io.Serializable;

/**
 *
 * @author mofan
 * @date 2021/2/18 5:20
 */
@Data
public class TbDept implements Serializable {
    /**
     * 主键
     */
    private Integer id;

    /**
     * 参数名
     */
    private String paramKey;

    /**
     * 参数值
     */
    private String paramValue;

    /**
     * 状态
     */
    private Byte status;

    /**
     * 备注
     */
    private String remark;

    private static final long serialVersionUID = 1L;
}