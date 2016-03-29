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
import static java.lang.Thread.sleep;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ADMIN
 */
public class NewUserValidateServlet extends HttpServlet {

  @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String uname;
        String pwd,address;
        
        uname=request.getParameter("uname");
        pwd=request.getParameter("pwd");
        address=request.getParameter("address");
        LoginManager sm=new LoginManager();
        PrintWriter out=response.getWriter();
       if(sm.isExist(uname,pwd))
       {
           out.println("The user name is already used please give an another user name");
           try{
           //sleep(5000000);
           //response.sendRedirect("/Product/newuser.jsp");
              response.setHeader("Refresh", "5; URL=http://localhost:8082/ProductOrder/newuser.jsp");
           }
           catch(Exception e){
               
           }
       }        
       else
       {
           LoginManager lm=new LoginManager();
            lm.addLogin(uname,pwd,address);
            out.println("Registered Sucessfully");
            
            out.println("Please Login to continue");
            response.setHeader("Refresh", "5; URL=http://localhost:8082/ProductOrder/loginpage.jsp");

            
       }
       
        
    }


}
