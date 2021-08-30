package com.beichen.wiki.domain;

/**
 * domain里面是实体类，这些类要和数据库中的表一一对应，例如这个类就对应数据库中的test表
 */
public class Test {

    private Integer id;
    private String name;
    private String password;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
