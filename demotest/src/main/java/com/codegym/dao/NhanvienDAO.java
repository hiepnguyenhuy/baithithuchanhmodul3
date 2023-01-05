package com.codegym.dao;

import com.codegym.model.Nhanvien;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class NhanvienDAO {
    static Connection connection = ConnectionMySQL.getConnection();

    public static List<Nhanvien> showallNhanvien() {
        String sql = "select nhanvien.*, department.namedepartment from nhanvien JOIN department using(iddepartment);";
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(sql);
            List<Nhanvien> nhanviens = new ArrayList<>();

            while (rs.next()) {
                int id = rs.getInt("idnhanvien");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String address = rs.getString("address");
                String phone = rs.getString("phonenumber");
                double salary = rs.getDouble("salary");
                String namedepartment = rs.getString("namedepartment");

                nhanviens.add(new Nhanvien(id, name, email, address, phone, salary, namedepartment));
            }
            return nhanviens;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;

    }

    public static boolean savenhanvien(Nhanvien nhanvien) {
        String insert = "INSERT INTO nhanvien (`name`, `email`, `address`, `phonenumber`, `salary`, `iddepartment`) VALUES (?,?,?,?,?,?);";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(insert);
            preparedStatement.setString(1, nhanvien.getName());
            preparedStatement.setString(2, nhanvien.getEmail());
            preparedStatement.setString(3, nhanvien.getAddress());
            preparedStatement.setString(4, nhanvien.getPhonenumber());
            preparedStatement.setDouble(5, nhanvien.getSalary());

            preparedStatement.setInt(6, nhanvien.getIddepartment());

           return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public static void delete(int id){
        String delete ="delete FROM nhanvien where idnhanvien = "+id;
        try {
            Statement statement = connection.createStatement();
            statement.execute(delete);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean editnhanvien(Nhanvien nhanvien) {
        String edit = "UPDATE `quanlyphongban`.`nhanvien` SET `name` = ?, `email` = ?, `address` = ?, `phonenumber` = ?, `salary` = ?, `iddepartment` = ? WHERE `idnhanvien` =?; ";
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(edit);
            preparedStatement.setInt(7, nhanvien.getId());
            preparedStatement.setString(1, nhanvien.getName());
            preparedStatement.setString(2, nhanvien.getEmail());
            preparedStatement.setString(3, nhanvien.getAddress());
            preparedStatement.setString(4, nhanvien.getPhonenumber());
            preparedStatement.setDouble(5, nhanvien.getSalary());
            preparedStatement.setInt(6, nhanvien.getIddepartment());
            return preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }

    }

    public static Nhanvien findById(int id){
        String find = "select * from nhanvien where idnhanvien = "+ id;
        try {
            Statement statement = connection.createStatement();
            ResultSet rs = statement.executeQuery(find);
            rs.next();


            String name = rs.getString("name");
            String email = rs.getString("email");
            String address = rs.getString("address");
            String phone = rs.getString("phonenumber");
            double salary = rs.getDouble("salary");
            int iddeparment = rs.getInt("iddepartment");

            return new Nhanvien(id, name,email, address, phone,salary,iddeparment);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public static List<Nhanvien> findbyname(String searchName){
        String sql = "SELECT * FROM  casemodul3.accounts WHERE username LIKE  '%" + searchName + "%'";
        List<Nhanvien> nhanviens = new ArrayList<>();
        try (PreparedStatement preparedStatement = connection.prepareStatement(sql);) {

            preparedStatement.setString(1, searchName);
            ResultSet resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                int id = resultSet.getInt("idnhanvien");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
               String address = resultSet.getString("address");
               String phone = resultSet.getString("phonenumber");
               double salary = resultSet.getDouble("salary");
               int iddepartment = resultSet.getInt("iddepartment");



                nhanviens.add(new Nhanvien(id, name, email, address,  phone,salary, iddepartment));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return nhanviens;
    }


}
