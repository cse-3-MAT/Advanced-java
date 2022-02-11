import java.rmi.*;
import java.io.*;
public class RmiReceiver{
	public static void main(String a[]){
		try{
			int n1,n2;
			Adder stub=(Adder)Naming.lookup("rmi://localhost:5001/abc");
			DataInputStream in = new DataInputStream(System.in);
			System.out.println("Enter number 1: ");
			n1=Integer.parseInt(in.readLine());
			System.out.println("Enter number 2: ");
			n2=Integer.parseInt(in.readLine());
			System.out.println(stub.add(n1,n2));
		}
		catch(Exception e){
			System.out.println(e);
		}
	}
}