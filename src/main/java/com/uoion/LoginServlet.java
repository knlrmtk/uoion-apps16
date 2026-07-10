package com.uoion;

import java.io.IOException;
import java.net.InetAddress;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
            throws ServletException, IOException {

        String username = request.getParameter("username");
        String password = request.getParameter("password");

        if ("admin".equals(username) && "admin123".equals(password)) {

            String hostname = InetAddress.getLocalHost().getHostName();

            request.setAttribute("username", username);
            request.setAttribute("hostname", hostname);

            request.getRequestDispatcher("/welcome.jsp")
                    .forward(request, response);

        } else {

            request.setAttribute("error", "Invalid Username or Password");

            request.getRequestDispatcher("/index.jsp")
                    .forward(request, response);
        }

    }

}
