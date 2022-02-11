import java.net.*;
import java.util.*;
public class URLDemo{
	public static void main(String args[]){
		try{
			System.out.println("Enter the URL below:");
			Scanner sc= new Scanner(System.in);
			String input = sc.nextLine();
			URL url = new URL(input);
			System.out.println("THe information is given RUL is"+url);
			System.out.println("Protocol is:"+url.getProtocol());
			System.out.println("Host name:"+url.getHost());
			System.out.println("Authority of URl"+url.getAuthority());
			System.out.println("Port number:"+url.getPort());
			System.out.println("Path is"+url.getPath());
			System.out.println("File name is"+url.getFile());
			System.out.println("Reference is"+url.getRef());
			System.out.println("Query id is"+url.getQuery());
		}
		catch(Exception e){
			System.out.println("invalid url");
		}
	}
}