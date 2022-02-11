import java.net.*;
import javax.swing.*;
import java.util.*;
import java.awt.event.*;

public class GUI3 extends JFrame implements ActionListener{
	JPanel p;
	JButton b;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JTextField jtf;
	
	GUI3(){
		//create it
		p = new JPanel();
		b = new JButton("Find my IP:");
		l1 = new JLabel("URL:");
		l2 = new JLabel("IP address:");
		l3 = new JLabel("Please click on button:");
		jtf = new JTextField();
		
		
		//configure it
		setLayout(null);
		p.setLayout(null);
		p.setBounds(0,0,300,300);
		l1.setBounds(20,0,100,30);
		jtf.setBounds(150,0,150,30);
		l2.setBounds(20,60,100,30);
		l3.setBounds(150,60,150,30);
		b.setBounds(150,100,150,30);
		b.addActionListener(this);
		
		
		//add it
		add(p);
		p.add(l1);
		p.add(jtf);
		p.add(l2);
		p.add(l3);
		p.add(b);
		
		
		//Frame settings
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//listen it
	public void actionPerformed(ActionEvent ex){
		String url = jtf.getText();
		try{
			InetAddress ia = InetAddress.getByName(url);
			String ip = ia.getHostAddress();
			l3.setText(ip);
		}
		catch(Exception e){
			System.out.println("invalid url");
		}
	}
	public static void main(String args[]){
		GUI3 g = new GUI3();
	}
	
}

		
	