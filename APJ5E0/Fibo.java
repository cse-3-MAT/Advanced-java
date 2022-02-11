import java.io.*;
import java.net.*;
public class Fibo
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(5555);
			Socket s =ss.accept(); //establish connection
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			int n=Integer.parseInt(str);
			int firstTerm = 0, secondTerm = 1;
		    System.out.println("Fibonacci Series till " + n + " terms:");

		    for (int i = 1; i <= n; ++i) {
		      System.out.print(firstTerm + "\n");

		      // compute the next term
		      int nextTerm = firstTerm + secondTerm;
		      firstTerm = secondTerm;
		      secondTerm = nextTerm;
			
		    }
		    ss.close();
		}
		
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}
}