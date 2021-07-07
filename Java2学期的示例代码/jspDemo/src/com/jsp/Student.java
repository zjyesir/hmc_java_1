/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jsp;

import java.io.Serializable;

/**
 *
 * @author hyl
 */
public class Student implements Serializable{
    private long classno;
    private String name="unknown";
    private int age;
    private boolean sex;
    private String major;
    public Student() {
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
    public boolean isSex() {
        return sex;
    }
    public void setSex(boolean sex) {
        this.sex = sex;
    }
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }
    public long getClassno() {
        return classno;
    }
    public void setClassno(long classno) {
        this.classno = classno;
    }
    

}
