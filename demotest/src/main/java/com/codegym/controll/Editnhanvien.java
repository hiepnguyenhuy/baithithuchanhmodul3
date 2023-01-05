package com.codegym.controll;

import com.codegym.model.Nhanvien;
import com.codegym.service.Nhanvienservice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/editnhanvien")
public class Editnhanvien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idnhanvien"));
        System.out.println(id);
        Nhanvien nhanvien = Nhanvienservice.findbyID(id);
        req.setAttribute("nv", nhanvien);
        RequestDispatcher dispatcher = req.getRequestDispatcher("nhanvien/editnhanvien.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idnhanvien"));
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String phone = req.getParameter("phonenumber");
        double salary = Double.parseDouble(req.getParameter("salary"));
        int iddeparment = Integer.parseInt(req.getParameter("iddepartment"));
        Nhanvienservice.editnhanvien(new Nhanvien(id,name,email,address,phone,salary,iddeparment));
        resp.sendRedirect("/showallnhanvien");
    }
}
