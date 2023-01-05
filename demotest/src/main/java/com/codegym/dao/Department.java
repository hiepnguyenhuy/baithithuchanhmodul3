package com.codegym.dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class Department {

        static Connection connection = ConnectionMySQL.getConnection();

        public static List<com.codegym.model.Department> getAll() {
            String selectAll = "select * from classroom";

            try {
                Statement statement = connection.createStatement();
                ResultSet resultSet = statement.executeQuery(selectAll);
                List<com.codegym.model.Department> list = new ArrayList<>();

                while (resultSet.next()) {
                    int id = resultSet.getInt("id");
                    String name = resultSet.getString("name");
                    list.add(new com.codegym.model.Department(id, name));
                }
                return list;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return null;

        }


    }
