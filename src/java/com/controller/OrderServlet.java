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
public class OrderServlet extends HttpServlet {
    
    
  

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
   
 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try
        {
        int orderPcode=Integer.parseInt(request.getParameter("orderPcode"));
        int orderQty=Integer.parseInt(request.getParameter("orderQty"));
        String uname=request.getParameter("uname");
        request.getSession().setAttribute("orderPcode",""+orderPcode);
        request.getSession().setAttribute("orderQty",""+orderQty);
        LoginManager lm=new LoginManager();
            lm.saveOrder(uname,orderPcode,orderQty);
            out.println("Ordered Sucessfully");
            response.setHeader("Refresh", "2; URL=http://localhost:8082/ProductOrder/Result.jsp");
            //response.sendRedirect("/Product/Result.jsp");
        }
        catch(Exception e)
        {
            
        }
    }

    

}
