import java.io.*;
import javax.servlet.*;
import java.awt.*;
import java.util.Random;
import javax.servlet.http.*;
public class RandomServlet extends HttpServlet{



    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException,ServletException{
        PrintWriter out = res.getWriter();
        try{
               
        String n1=req.getParameter("r1");
        String n2=req.getParameter("r2");
        int s1 = Integer.parseInt(n1);
        int s2 = Integer.parseInt(n2);
        if(s1>s2){
            out.print("<html>");
            out.print("<body>");
            out.print("<h2><font color=\"green \">Maximum of two numbers is: +"+s1+"</font></h2>");
            out.print("</body>");
            out.print("</html>");

        
        }
        else{
            out.print("<html>");
            out.print("<body>");
            out.print("<h2><font color=\"green \">Maximum of two numbers is: +"+s2+"</font></h2>");
            out.print("</body>");
            out.print("</html>");
        }

    

        }
        catch(Exception e){
            out.println(e.getMessage());
            e.printStackTrace();
        }
     
    


       
    

    }
}