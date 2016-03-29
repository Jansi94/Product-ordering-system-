/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.controller;

import com.fiber.LoginManager;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class ValidateServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException 
    {
        try
        {
     String uname,password;
     uname=request.getParameter("uname");
     password=request.getParameter("pwd");
     PrintWriter out=response.getWriter();
     
     LoginManager loginman = new LoginManager();
     if(loginman.checkUser(uname,password)==true)
        {
           // out.println("Login Successfully");
           request.getSession().setAttribute("uname",uname);
             response.sendRedirect("/ProductOrder/order.jsp");
         }
         else
        {
             out.println("Seems to be a wrong Entry");
                
        }
        }
        
     catch(Exception e)
             {
             e.printStackTrace();
             }
    }
   

   }
