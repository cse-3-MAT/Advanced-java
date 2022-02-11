import java.rmi.*;
import java.io.*;
public class RmiServer{
	public static void main(String a[]){
		try{
			Adder stub1 = new AdderRemote();
			Naming.rebind("rmi://localhost:5001/abc",stub1);
			System.out.println("Server is ready");
			System.out.println("Remote obj is ready");
		}
		catch (Exception e){
			System.out.println(e);
		}
	}
}