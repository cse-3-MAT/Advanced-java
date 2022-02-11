import java.net.*;
import java.util.*;
import java.io.*;

public class Cascen{
	public static void main(String args[]) {
		int arr[]=new int[10];
		Scanner inFromUser= new Scanner(System.in);
		try {
				Socket clientSocket = new Socket("localhost",6786);
			    DataOutputStream outToServer = new DataOutputStream(clientSocket.getOutputStream());
			    System.out.println("Enter the array elements");
			    for(int i=0;i<10;i++)
			        arr[i]=inFromUser.nextInt();
			    
			    for(int i=0;i<10;i++)
			        outToServer.writeInt(arr[i]);
			    
			    outToServer.flush();
				outToServer.close();
				clientSocket.close();

			   
				}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
	}
}

				
		
		
		
		
		
