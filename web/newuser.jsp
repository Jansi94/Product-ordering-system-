<%-- 
    Document   : newuser
    Created on : 12-Apr-2015, 15:35:43
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<html>
    <head>
        <title>Login Form</title>
    </head>
    <body>
    <center>
        <form action="/ProductOrder/NewUserValidateServlet" method="POST">
            <table>
                <tr>
                    <td>User Name</td>
                    <td><input type="text" name="uname"></td>
                </tr>
                <tr>
                    <td>Password</td>
                    <td><input type="password" name="pwd"></td>
                </tr>
                 <tr>
                    <td>Address</td>
                    <td><input type="text" name="address"></td>
                </tr>
                <tr>
                    <td>Click To Submit</td>
                    <td><input type="submit" value="Submit"></td>
                </tr>
            </table>
            
        </form>
    </center>
</body>
    
</html>


