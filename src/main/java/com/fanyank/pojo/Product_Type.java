package com.fanyank.pojo;

/**
 * Created by yanfeng-mac on 2017/4/19.
 */
public class Product_Type {
    private Integer id;
    private String name;

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

    @Override
    public String toString() {
        return "Product_Type{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
