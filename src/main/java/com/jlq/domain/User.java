package com.jlq.domain;

import java.io.Serializable;

/**
 * @author ：jlq
 * @date ：Created in 2020/10/20 16:57
 */

public class User implements Serializable {

    private String username;
    private String password;
    private Integer age;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}


