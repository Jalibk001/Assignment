/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.assignment3.jalib.assignment;

/**
 *
 * @author Jalib
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class User extends HttpServlet {
    public void doGet(HttpServletRequest request,HttpServletResponse response)
 throws ServletException,IOException
 {
     String a;
        a = request.getParameter("name");
        String pass=request.getParameter("pass");
        EnterUser user=new EnterUser();
        if (user.check(a, pass))
        {}
        else
        {
            EnterUser adduser=new EnterUser(a, pass);
        }
 }
}