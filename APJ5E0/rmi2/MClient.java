//client program
import java.rmi.*;
import java.io.*;
public class MyClient{
	public static void main(String args[]){
		try{
			int potato = 0;
			int tomato = 0;
			int carrot = 0;
			Adder stub = (Adder)Naming.lookup("rmi://localhost:6666/pratap");
			DataInputStream in = new DataInputStream(System.in);
			System.out.println("Enter no. of kgs potatoes");
			potato = Integer.parseInt(in.readLine());
			System.out.println("Enter no. of kgs tomatos");
			tomato = Integer.parseInt(in.readLine());
			System.out.println("Enter no. of kgs carrots");
			carrot = Integer.parseInt(in.readLine());
			System.out.println(stub.add(potato,tomato,carrot));
		}
		catch(Exception e){
			System.out.println(e);
		}
	
	}
}

			