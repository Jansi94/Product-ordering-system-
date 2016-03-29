<%-- 
    Document   : ProductDetails
    
    Author     : ADMIN
--%>

<%@page import="java.util.ListIterator"%>
<%@page import="java.util.List"%>
<%@page import="com.fiber.ProductDetails"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! List list;
    ListIterator it;
    ProductDetails b;
    int pcode,price;
    String pname;%>
<% list=(List)session.getAttribute("list");%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Product Details</title>
    </head>
    <body>
        <h1>Available Products</h1>
        <table >
            <tr>
                <td> Product code </td>
                <td>Product Name </td>
                <td> Price </td>
               
            </tr><br/><br/>
        <%
            it=list.listIterator();
            while(it.hasNext())
            {
                b=(ProductDetails)it.next();
                pcode=b.getPcode();
                pname=b.getPname();
                
                price=b.getPrice();
                
              
                %>
                <tr>
                    <td><%=pcode%></td>
                    <td><%=pname%></td>
                    
                    <td><%=price%></td>
                    
                    
                </tr>
        <%
            }
        %></table>
    </body>
</html>
