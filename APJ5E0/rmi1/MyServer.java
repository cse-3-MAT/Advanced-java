import java.rmi.*;
import java.rmi.registry.*;
public class MyServer{
	public static void main(String args[]){
	try{
		Adder stub = new AdderRemote();
		Naming.rebind("rmi://localhost:6666/pratap",stub);
		System.out.println("server is ready");
		System.out.println("remote object is ready");
	}
	catch(Exception e){
		System.out.println(e);
	}
	}
}
