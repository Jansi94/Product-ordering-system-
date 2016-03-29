<%-- 
    Document   : loginpage
    Created on : 12-Apr-2015, 15:34:50
    Author     : ADMIN
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Login Form</title>
    </head>
    <body>
    <center>
        <form action="/ProductOrder/ValidateServlet" method="POST">
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
                    <td>Click To Login</td>
                    <td><input type="submit" value="Login"></td>
                </tr>
                <tr><td><center><a href="newuser.jsp">New user register here</a></center></tr>
            </table>
            
        </form>
    </center>
</body>
    
</html>

