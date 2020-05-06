package com.py.mapstructdemo.common.entity;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author pengyou@xiaomi.com
 * @date 2020/5/6
 */
@Data
public class PersonDO implements Serializable {

    private static final long serialVersionUID = 3737812848430885920L;

    private String name;

    private Integer age;

    private String phone;

    private Date date;

}
