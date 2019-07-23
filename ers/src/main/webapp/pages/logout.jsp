<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
    <!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
    <html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
        <meta http-equiv="Refresh" content="3;url=login.jsp">
        <title>Welcome</title>
    </head>
    <body>
        <table>
            <tr>
                <td>You have been successfully logged out. You will be redirected to login page in 3 seconds.</td>
            </tr>

        </table>
    </body>
    </html>
    
<script>
$(document).ready(function () {
    // Handler for .ready() called.
    window.setTimeout(function () {
        location.href = "https://www.google.com";
    }, 5000);
});
</script>