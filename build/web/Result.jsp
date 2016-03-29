<%-- 
    Document   : Result
    
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Success Page</title>
    </head>
    <body>
        <%! String uname; %>
        <% uname=(String)session.getAttribute("uname");%>
         <%! int orderPcode; %>
        <% orderPcode=Integer.parseInt(session.getAttribute("orderPcode").toString());%>
         <%! int orderQty; %>
        <% orderQty=Integer.parseInt(session.getAttribute("orderQty").toString());%>
        Thank you <%=uname%> You have order the product <%=orderPcode%> with <%=orderQty%> quantity.
    </body>
</html>
