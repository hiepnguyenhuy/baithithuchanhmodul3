package com.codegym.controll;

import com.codegym.service.Nhanvienservice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/showallnhanvien")
public class ShowallNhanvien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("listnhanvien", Nhanvienservice.showallNhanvien());
        RequestDispatcher dispatcher = req.getRequestDispatcher("nhanvien/shownhanvien.jsp");
        dispatcher.forward(req,resp);
    }
}
