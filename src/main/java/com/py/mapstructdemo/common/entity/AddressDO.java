package com.py.mapstructdemo.common.entity;

import lombok.Data;

import java.io.Serializable;

/**
 * @author pengyou@xiaomi.com
 * @date 2020/5/6
 */
@Data
public class AddressDO implements Serializable {

    private static final long serialVersionUID = 3119022747763731665L;

    private String address;

    private String postcode;

}
