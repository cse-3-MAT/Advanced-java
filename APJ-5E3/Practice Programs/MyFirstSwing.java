// Myfirst GUI program.
import java.lang.*;
import java.util.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class MyFirstSwing implements ActionListener
{
	JPanel p;
	public MyFirstSwing()
	{
		// Create it
		JFrame f=new JFrame();
		p=new JPanel();
		JButton b=new JButton("Click me");
		
		// configure it
		p.setBounds(10,0,300,300);
		p.setBackground(Color.yellow);
		p.setLayout(null);
		b.setBounds(40,30,100,50);
		f.setVisible(true);
		f.setTitle("GUI");
		f.setSize(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);	
		
		// add it
		f.add(b);
		f.add(p);
		b.addActionListener(this);
		
	}
	public static void main(String a[])
	{
		MyFirstSwing mywindow=new MyFirstSwing();
	}
		// listen it
		public void actionPerformed(ActionEvent e)
		{
			int min=0;
			int max=255;
			int r=(int)(Math.random()*(max-min+1)+min);
			int b=(int)(Math.random()*(max-min+1)+min);
			int g=(int)(Math.random()*(max-min+1)+min);
			Color c = new Color(r,b,g);
			p.setBackground(c);
		}
		
	
}