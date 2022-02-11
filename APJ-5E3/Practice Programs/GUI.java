import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
public class GUI extends JFrame implements ActionListener{
	JPanel p;
	JFrame f;
	JButton b;
	JLabel l1,l2,l3;
	JTextField jt1,jt2;
	public GUI(){
		f=new JFrame("GET IP");
		p=new JPanel();
		b=new JButton("Click me");
		l1=new JLabel("URL");
		l2=new JLabel("IP Address");
		jt1 = new JTextField();
		jt2=new JTextField();
		
		jt1.setBounds(30,60, 100,20);  
		jt2.setBounds(30,120,100,20);
		p.setBounds(0,0,300,300);
		l1.setBounds(10,60,100,100);
		l2.setBounds(10,120,100,100);
		p.setBackground(Color.yellow);
		p.setLayout(null);
		b.setBounds(40,150,150,60);
		
		
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.add(l1);
		f.add(l2);
		f.add(jt1);
		f.add(jt2);
		f.add(b);
		f.add(p);
		f.setSize(300,300);
		f.setLayout(null);
		f.setVisible(true);
		b.addActionListener(this);	
	}
	public static void main(String a[])
	{
		GUI mywindow=new GUI();
	}
	public void actionPerformed(ActionEvent e)
	{
		try{
		String st=jt1.getText();
		InetAddress ia = InetAddress.getByName(st);
		String ip=ia.getHostAddress();  

		jt2.setText(ip);
	}
	catch(Exception et){
		jt2.setText("NO");
	}
}
	
}