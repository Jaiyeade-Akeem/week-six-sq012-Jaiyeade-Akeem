package com.example.facebookapp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import lombok.SneakyThrows;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

@WebServlet(name = "ProfileServlet", value = "/ProfileServlet")
public class ProfileServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;


    @SneakyThrows
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Facebook_mini_app","root","Password123#@!");

        String firstname = request.getParameter("first-name");
        String lastname = request.getParameter("last-name");
        String username = request.getParameter("username");
        String email = request.getParameter("user-email");
        String password = request.getParameter("user-password");


        PreparedStatement ps = con.prepareStatement("INSERT INTO users (firstname, lastname, username, uemail, upswd) VALUES (?,?,?,?,?)");

        ps.setString(1, firstname);
        ps.setString(2,lastname);
        ps.setString(3,username);
        ps.setString(4,email);
        ps.setString(5,password);
        ps.executeUpdate();
        out.println("<font color= black>You have successfully registered!!</font><br>");
        out.println("<a href = login.jsp> click here to continue</a>");

    }
}
