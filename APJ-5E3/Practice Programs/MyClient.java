import java.io.*;
import java.net.*;
import java.util.*;
public class MyClient
{
	public static void main(String a[])
	{
		try
		{
			Socket s=new Socket("D33.cse.com",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the messsage you want to display");
			String msg=sc.nextLine();
			dout.writeUTF(msg);
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}