package com.codegym.service;

import com.codegym.model.Department;

import java.util.List;

public class Departmentservice {
    public List<Department> getAll(){
        return com.codegym.dao.Department.getAll();
    }
}
