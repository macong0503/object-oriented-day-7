package com.hqyj.mc.Test.Object;

import java.io.Serializable;
/**
 * 不添加序列化版本号，会报以下异常：
 * 表明Person类在改动前后生成了两个序列化版本号，不一致导致无法反序列化
 *  java.io.InvalidClassException:
 *  com.hqyj.demo09.Person; local class incompatible:
 *  stream classdesc serialVersionUID = 842344862260111050,
 *  local class serialVersionUID = -4421721788509217275
 *
 * 不被序列化的两个关键字：
 *transient static
 */
public class Person implements Serializable {
    private static final long serialVersionUID = -4470581843889216077L;
    private String name;
    private int age;
    private String hobby;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
