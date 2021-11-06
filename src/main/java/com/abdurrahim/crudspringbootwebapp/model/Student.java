package com.abdurrahim.crudspringbootwebapp.model;

import javax.persistence.*;

@Entity
public class Student {

    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    //    @Column(name = "Student's_name")
    private String name;
    private String email;
    private String no;


    public Student(){

    }

    public Student(int id, String name, String email, String no) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.no = no;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", no='" + no + '\'' +
                '}';
    }
}

