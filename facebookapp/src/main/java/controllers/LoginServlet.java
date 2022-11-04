package controllers;

import  jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;
import models.User;
import serviceImpl.DbConnectionImpl;
import serviceImpl.UserDaoImpl;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import java.util.Arrays;
import java.util.List;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            PrintWriter out = response.getWriter();

            DbConnectionImpl dbconnect = new DbConnectionImpl();
            Connection con = dbconnect.connect();

            String username = request.getParameter("user-login-name");
            String password = request.getParameter("user-login-password");
//            User user = new User();
//            user.setUserName(username);
//            user.setPassword(password);

            UserDaoImpl userdao = new UserDaoImpl();
            User user = userdao.loginUser(username,password);

            if (user != null){
                HttpSession se = request.getSession();
                se.setAttribute("userLoggedInDetails", user);
                RequestDispatcher rd = request.getRequestDispatcher("news-feed.jsp");
                rd.forward(request, response);
            }
            else {

                out.println("<style=\"font-style: inherit\" size = 12>");
                 out.println("Login Failed!!<br>Please <a href = login.jsp>login</a> with the correct username or password.");



            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }


    }
}
