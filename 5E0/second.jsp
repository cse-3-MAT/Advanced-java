<html>
<head><title>Second JSP</title></head>
<body>
    <%
        double num=Math.random();
        if(num>0.50)
        {
    %>

    <h2>You'll have a lucky day!</h2><p>{<%= num%>}</p>
    <%
    }

    else{
    %>
    <h2>Well,life goes on ...</h2><p><%= num%>}</p>
    <%
    }

    %>
    <a href="<%= request.getRequestURI() %>"><h3>Try again</h3></a>
</body>
</html>