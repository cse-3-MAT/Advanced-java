import java.rmi.*;
import java.rmi.registry.*;
public class ServerRMI {
	public static void main(String a[]) {
		try {
			stringOperationsRemote stub=new stringOperationsRemote();
			Naming.rebind("rmi://localhost:5557/greeshmanth",stub);
			System.out.println("Server is ready");
			System.out.println("Object is ready");
		} catch(Exception e){
			System.out.println(e);
		}
	}
}