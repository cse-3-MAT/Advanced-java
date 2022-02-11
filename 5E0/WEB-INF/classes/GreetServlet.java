import java.io.*;
import javax.servlet.*;
import java.util.*;
public class GreetServlet implements Servlet
{
	ServletConfig config = null;
	public void init(ServletConfig config)
	{
		this.config=config;
		System.out.println("Initialization complete");
	}
	public void service(ServletRequest req,ServletResponse res) throws IOException,ServletException
	{
		res.setContentType("text/html");
		PrintWriter pwriter=res.getWriter();
		Date dt = new Date();
        int hours = dt.getHours();
		String greeting = null;
		if(hours>=1 && hours<=11){
    		greeting = "Good Morning";
		} else if(hours<=15){
    		greeting = "Good Afternoon";
		} else if(hours<=20){
    		greeting = "Good Evening";
		} else if(hours<=24){
    		greeting = "Good Night";
		}
		pwriter.print("<html>");
		pwriter.print("<body>");
		pwriter.print("<h2><font color=\"green\">Hello!!"+greeting+"</font></h2>");
		pwriter.print("</body>");
		pwriter.print("</html>");
	}
	public void destroy()
	{
		System.out.println("servlet life cycle finished");
	}
	public ServletConfig getServletConfig()
	{
		return config;
	}
	public String getServletInfo()
	{
		return "A greet program";
	}}
