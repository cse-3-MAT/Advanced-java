import java.io.*;
import java.net.*;
import java.util.*;
public class Cnumber{
	public static void main(String args[]){
		try{
			Socket s=new Socket("localhost",6666);
			DataOutputStream dout=new DataOutputStream(s.getOutputStream());
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter the number you want to be send :");
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