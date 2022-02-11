import java.io.*;
import javax.servlet.*;
import java.awt.*;


public class ColorServlet extends GenericServlet{
	String r="red";
	String g="green";
	String b="blue";
	
	public void service(ServletRequest req, ServletResponse res) throws IOException,ServletException
	{
		String name=req.getParameter("color");
		res.setContentType("text/html");
		PrintWriter pwriter=res.getWriter();
		pwriter.print("<html>");
		if(name.equals("red"))
		{
			pwriter.print("<body bgcolor=\""+r+"\">");
		}
		else if(name.equals("green")){
			pwriter.print("<body bgcolor=\""+g+"\">");
		}
		else{
			pwriter.print("<body bgcolor=\""+b+"\">");
		}
		pwriter.print("<h2><font color=\"green \">Hello world! welcome to servlet programming</font></h2>");
		pwriter.print("</body>");
		pwriter.print("</html>");
	}
	
}