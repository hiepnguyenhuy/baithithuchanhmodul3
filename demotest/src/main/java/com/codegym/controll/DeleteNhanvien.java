package com.codegym.controll;

import com.codegym.service.Nhanvienservice;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/deletenhanvien")
public class DeleteNhanvien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int id = Integer.parseInt(req.getParameter("idnhanvien"));
        Nhanvienservice.deletenhanvien(id);
        resp.sendRedirect("/showallnhanvien");
    }
}
