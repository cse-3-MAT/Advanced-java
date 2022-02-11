
import java.io.*;
import java.net.*;
public class SSreverse
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss=new ServerSocket(6666);
			Socket s =ss.accept(); //establish connection
			DataInputStream dis=new DataInputStream(s.getInputStream());
			String str=(String)dis.readUTF();
			String nstr="";
			char ch;
			for (int i=0; i<str.length(); i++)
		      {
		        ch= str.charAt(i); //extracts each character
		        nstr= ch+nstr; //adds each character in front of the existing string
		      }
		      System.out.println("String after reversing: "+ nstr);
			ss.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

