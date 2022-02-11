import java.io.*;
import java.net.*;
import java.util.*;
public class Fib{
	public static void main(String args[]){
		try{
			Socket s=new Socket("localhost",5555);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number of terms to be printed:");
			String msg =sc.nextLine();
			dout.writeUTF(msg);
			dout.flush();
			dout.close();
			s.close();
		}
		catch(Exception e){
			System.out.println(e);
		
		}
		
		
			
	}
}