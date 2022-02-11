import java.rmi.*;
import java.util.*;
import java.rmi.server.UnicastRemoteObject;
public class AdderRemote extends UnicastRemoteObject implements Adder{
	AdderRemote() throws RemoteException{
	super();
	}
	public int cal(int x,int y,int z){
		int bill;
		Map<String,Integer> m = new Hashmap<>();
		m.put("Potatoes",10);
		m.put("Tomatoes",5);
		m.put("Carrot",15);
		
		bill = x*m.get("Potatoes")+y*m.get("Tomatoes")+m.get("Carrot");
		return bill;
		
		
	}
}

	