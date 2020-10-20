package com.zjh.web.entity;

public class TestVo {



    private String id;

    private String name;

    private String sex;

    private String create_time;


    public TestVo(String id, String name, String sex, String create_time) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.create_time = create_time;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getCreate_time() {
        return create_time;
    }

    public void setCreate_time(String create_time) {
        this.create_time = create_time;
    }
}
