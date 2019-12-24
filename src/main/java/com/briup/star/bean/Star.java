package com.briup.star.bean;

import io.swagger.annotations.ApiModelProperty;

public class Star {
    @ApiModelProperty(value="序号")
    private int id;
    @ApiModelProperty(value="性别")
    private String sex;
    @ApiModelProperty(value="年龄")
    private int age;
    @ApiModelProperty(value ="地址")
    private String address;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }



}
