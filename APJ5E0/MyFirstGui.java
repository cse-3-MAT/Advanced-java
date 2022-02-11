import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class MyFirstGui implements ActionListener {
	JPanel p;
	JFrame f;
	JButton jb;
	
	public MyFirstGui()
	{
		//create it
		f = new JFrame("My First window");
		p = new JPanel();
		jb = new JButton("click me");
		
		
		//config it
		p.setBackground(Color.yellow);
		p.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(300,300);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//add it
		p.add(jb);
		jb.addActionListener(this);
		f.add(p);
		
		
	}
	public static void main(String args[]) {
		MyFirstGui mywindow = new MyFirstGui();
	}
	
	public void actionPerformed(ActionEvent e)
	{
		
		int min=0;
		int max=255;
		int red = (int)(Math.random()*(max-min+1)+min);
		int blue = (int)(Math.random()*(max-min+1)+min);
		int green = (int)(Math.random()*(max-min+1)+min);
		Color c= new Color(red,blue,green);
		p.setBackground(c);
		
	
		
	}

}
