package com.codegym.controll;

import com.codegym.service.Nhanvienservice;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/findnhanvien")
public class FindNhanvien extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String search = req.getParameter("search");

        req.setAttribute("listnhanvien", Nhanvienservice.findbyname(search));
        RequestDispatcher dispatcher = req.getRequestDispatcher("nhanvien/shownhanvien.jsp");
        dispatcher.forward(req,resp);
    }


}
