package com.codegym.model;

import java.time.LocalDate;
import java.util.Date;

public class Nhanvien {
    private int id;
    private String name;
    private String email;
    private String address;
    private String phonenumber;
    private double salary;
    private String departmentname;
    private int iddepartment;

    public Nhanvien() {
    }

    public Nhanvien(int id, String name, String email, String address, String phonenumber, double salary, String departmentname, int iddepartment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.departmentname = departmentname;
        this.iddepartment = iddepartment;
    }

    public Nhanvien(int id, String name, String email, String address, String phonenumber, double salary, String departmentname) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.departmentname = departmentname;
    }

    public Nhanvien(String name, String email, String address, String phonenumber, double salary, int iddepartment) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.iddepartment = iddepartment;
    }

    public Nhanvien(int id, String name, String email, String address, String phonenumber, double salary, int iddepartment) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phonenumber = phonenumber;
        this.salary = salary;
        this.iddepartment = iddepartment;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartmentname() {
        return departmentname;
    }

    public void setDepartmentname(String departmentname) {
        this.departmentname = departmentname;
    }

    public int getIddepartment() {
        return iddepartment;
    }

    public void setIddepartment(int iddepartment) {
        this.iddepartment = iddepartment;
    }
}
