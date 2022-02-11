import javax.swing.*;
import java.util.*;
import java.awt.*;


public class LayoutExercise extends JFrame{
	JPanel p;
	JButton b;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JTextField jtf1;
	JTextField jtf2;
	JCheckBox jc;
	JRadioButton jrb1,jrb2;
	JComboBox jcb;
	ButtonGroup group;
	
	public LayoutExercise(){
		//create it
		
		p = new JPanel();
		b = new JButton("Submit");
		l1 = new JLabel("Enter your details:");
		l2 = new JLabel("Name:");
		l3 = new JLabel("Gender:");
		l4 = new JLabel("Phone:");		
		l5 = new JLabel("Marital Status:");
		group = new ButtonGroup();
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jrb1 = new JRadioButton("Male");
		jrb2 = new JRadioButton("Female");
		String values[] = {"Single","Double","Other"};
		jcb = new JComboBox(values);
		jc = new JCheckBox("Do you have a full driving license");
		
		//configure it
		p.setBounds(0,0,500,300);
		p.setLayout(null);
		
		l1.setBounds(0,100,200,30);
		
		l2.setBounds(60,150,100,30);
		jtf1.setBounds(200,150,150,30);
		
		l3.setBounds(60,200,100,30);
		jrb1.setBounds(120,200,100,30);
		jrb2.setBounds(200,200,100,30);
		
		
		l4.setBounds(60,250,100,30);
		jtf2.setBounds(200,250,150,30);
		
		l5.setBounds(60,300,100,30);
		jcb.setBounds(200,300,150,30);
		
		jc.setBounds(60,350,400,30);
		
		
		
		b.setBounds(60,400,150,30);
	
		
		
		//add it
		group.add(jrb1);
		group.add(jrb2);
		p.add(l1);
		p.add(l2);
		p.add(jtf1);
		p.add(l3);
		p.add(jrb1);
		p.add(jrb2);
		p.add(l4);
		p.add(jtf2);
		p.add(l5);
		p.add(jcb);
		p.add(jc);
		p.add(b);
		add(p);
		
		
		
		//Frame settings
		setSize(500,300);
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String args[]){
		LayoutExercise g = new LayoutExercise();
		g.setTitle("Applet");
		
	}
	
}