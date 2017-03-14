package com.cxx.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by chenxiangxiang on 2017/3/14.
 */
@Component
@ConfigurationProperties(prefix = "girl")
public class Girlproperties {
    private String cap;
    private int age;

    public String getCap() {
        return cap;
    }

    public void setCap(String cap) {
        this.cap = cap;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Girlproperties() {
    }
}
