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

@WebServlet(urlPatterns = "/createnhanvien")
public class CreateNhanvien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listhocvien", Nhanvienservice.showallNhanvien());
        RequestDispatcher dispatcher = req.getRequestDispatcher("/nhanvien/createnhanvien.jsp");
        dispatcher.forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String address = req.getParameter("address");
        String phonenumber = req.getParameter("phonenumber");
        double salary = Double.parseDouble(req.getParameter("salary"));
        int iddepartment = Integer.parseInt(req.getParameter("iddepartment"));

        Nhanvienservice.savenhanvien(new Nhanvien(name, email, address, phonenumber, salary, iddepartment));
        resp.sendRedirect("/showallnhanvien");
    }
}
