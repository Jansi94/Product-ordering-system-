<%-- 
    Document   : order
    Created on : 12-Apr-2015, 21:05:04
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Order Page</title>
    </head>
    <body>
    <center>
        <form action="/ProductOrder/OrderServlet" method="POST">
            <table>
                <tr>
                    <td>Enter Product Code</td>
                    <td><input type="text" name="orderPcode"></td>
                </tr>
                <tr>
                    <td>QTY</td>
                    <td><input type="text" name="orderQty"></td>
                </tr>
                <tr>
                    <td>
                    <input type="hidden" name="uname" value=<%=session.getAttribute("uname").toString()%> />
                    </td>
                </tr>
                <tr>
                    <td>Click to Order</td>
                    <td><input type="submit" value="Order"></td>
                </tr>
            </table>
        </form>
    </center>
</body>
    
</html>


