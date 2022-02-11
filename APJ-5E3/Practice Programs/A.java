import java.lang.*;
import java.util.*;
public class A{
	public void add(int a,int b ,String c){
		System.out.println(String(a+b)+" gjmd"+c);
		System.out.println(c);
		
	}
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	
	int a=s.nextInt();
	int b=s.nextInt();
	System.out.println();
	String c=s.nextLine();
	
System.out.println("Hello world ,welcome to swing programming");
A aa=new A();
aa.add(a,b,c);
}
}