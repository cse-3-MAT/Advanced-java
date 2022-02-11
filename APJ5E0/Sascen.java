import java.net.*;
import java.io.*;
import java.util.*;
public class Sascen{
	public static void main(String args[]) {
		try {
				int arrFromClient[]=new int[10];
				ServerSocket welcomeSocket = new ServerSocket(6786);
			    Socket connectionSocket = welcomeSocket.accept();
			    DataInputStream inFromClient = new DataInputStream(connectionSocket.getInputStream());
			    for(int i=0;i<10;i++) {
			        arrFromClient[i] = inFromClient.readInt();
			    }
			    Arrays.sort(arrFromClient);
			    for (int i = 0; i < arrFromClient.length; i++) {
			        System.out.println(arrFromClient[i]);
			    }
			    
			    welcomeSocket.close();
			
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}
}


