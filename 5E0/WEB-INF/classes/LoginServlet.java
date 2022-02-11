import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

//define the servlet class by extending httpservlet abstract
public class LoginServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();

        String name = req.getParameter("uname");
        String pass = req.getParameter("psw");

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
            Statement ps = con.createStatement();
            ResultSet rs = ps.executeQuery("select name from Registration where uname='"+name+"' and password='"+pass+"'");
            if(rs.next()){
                out.println("<body bgcolor=\"lightblue\">");
                out.println("<font color=\"green\" size=\"20\">Welcome\t"+rs.getString(1)+"\t");
            }
            else{
                out.println("<br><center><font color=\"red\">Invalid user</font>");
                req.getRequestDispatcher("Login.html").include(req,res);


            }


        }
        catch(Exception ee){
            out.println(ee.getMessage());
            ee.printStackTrace();
        }



    }
}


