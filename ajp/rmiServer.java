import java.rmi.*;
import java.rmi.registry.*;
public class rmiServer {
	public static void main(String a[]) {
		try {
			totalBill stub=new totalBillRemote();
			Naming.rebind("rmi://localhost:5558/greeshmanth",stub);
			System.out.println("Server is ready");
			System.out.println("Object is ready");
		} catch(Exception e) {
			System.out.println(e);
		}
	}
}