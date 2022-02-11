import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.util.*;
import java.sql.*;

//define the servlet class by extending httpservlet abstract
public class OrderServlet extends HttpServlet{
    public void doPost(HttpServletRequest req,HttpServletResponse res)throws IOException,ServletException{
        res.setContentType("text/html;charset=UTF-8");
        PrintWriter out = res.getWriter();

        String cid = req.getParameter("custid");
        String oid = req.getParameter("orderid");
        String qua = req.getParameter("quantity");
        String mod = req.getParameter("model"); 

        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","system","admin");
            PreparedStatement ps = con.prepareStatement("insert into Order_man values(?,?,?,?)");
            ps.setString(1,cid);
            ps.setString(2,oid);
            ps.setString(3,qua);
            ps.setString(4,mod);

            int i=ps.executeUpdate();
            if(i>0){
                out.print("<font color=\"green\" size=\"20\">Welcome user...</font>");   
            }

            
           
            

        }
        catch(Exception ee){
            out.println(ee.getMessage());
            ee.printStackTrace();
        }



    }
}


