package controllers;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import lombok.SneakyThrows;
import models.User;
import serviceImpl.DbConnectionImpl;
import serviceImpl.UserDaoImpl;

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

        DbConnectionImpl con = new DbConnectionImpl();
        con.connect();
        UserDaoImpl userdao = new UserDaoImpl();
        User user = new User();


        String firstname = request.getParameter("first-name");
        String lastname = request.getParameter("last-name");
        String username = request.getParameter("username");
        String email = request.getParameter("user-email");
        String password = request.getParameter("user-password");

        user.setFirstName(firstname);
        user.setLastName(lastname);
        user.setUserName(username);
        user.setEmail(email);
        user.setPassword(password);

        userdao.registerUser(user);

        out.println("<font color= black>Hello " + user.getUserName() + " you have successfully registered!!</font><br>");
        out.println("<a href = login.jsp> click here to continue</a>");

    }
}
