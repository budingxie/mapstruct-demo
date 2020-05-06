package com.py.mapstructdemo.common;

import lombok.Data;

import java.io.Serializable;

/**
 * @author pengyou@xiaomi.com
 * @date 2020/5/6
 * 接口返回到页面的 Model， PersonModel.java
 */
@Data
public class PersonAddrDTO implements Serializable {

    private static final long serialVersionUID = -7833986883909748561L;

    private String personName;

    private String phone;

    private String addr;

}
