import java.rmi.*;
public interface Adder extends Remote{
	public int cal(int x,int y,int z) throws RemoteException;
}
