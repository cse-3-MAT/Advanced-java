import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Employee extends JFrame implements ActionListener {
	JPanel p;
	JTextField jtf1;
	JTextField jtf2;
	JTextField jtf3;
	JTextField jtf4;
	JTextField jtf5;
	JLabel l1;
	JLabel l2;
	JLabel l3;
	JLabel l4;
	JLabel l5;
	JLabel l6;
	JButton jb;
	JComboBox jcb;
	
	public Employee() {
		p = new JPanel();
		jtf1 = new JTextField();
		jtf2 = new JTextField();
		jtf3 = new JTextField();
		jtf4 = new JTextField();
		jtf5 = new JTextField();
		l1 = new JLabel("Employee name");
		l2 = new JLabel("Employee id");
		l3 = new JLabel("Address");
		l4 = new JLabel("Phone:");
		l5 = new JLabel("Joining details:");
		l6 = new JLabel("Blood group");
		String values[]= {"O+","O","A+","A-","AB-","AB+"};
		jcb = new JComboBox(values);
		jb = new JButton("Submit");
		
		
		
		p.setBounds(0,0,500,300);
		
		
		l1.setBounds(60,100,100,30);
		jtf1.setBounds(200,100,150,30);
		
		l2.setBounds(60,150,100,30);
		jtf2.setBounds(200,150,150,30);
		
		l3.setBounds(60,200,100,30);
		jtf3.setBounds(200,200,150,30);
		
		l4.setBounds(60,250,100,30);
		jtf4.setBounds(200,250,150,30);
		
		l5.setBounds(60,300,100,30);
		jtf5.setBounds(200,300,150,30);
		
		l6.setBounds(60,350,100,30);
		jcb.setBounds(200,350,150,30);
		
		
		
		jb.setBounds(60,400,150,30);
	
		
		p.setLayout(null);
		
		
		p.add(l1);
		p.add(l2);
		p.add(l3);
		p.add(l4);
		p.add(l5);
		p.add(jtf1);
		p.add(jtf2);
		p.add(jtf3);
		p.add(jtf4);
		p.add(jtf5);
		p.add(jcb);
		p.add(jb);
		add(p);
		setVisible(true);
		setSize(500,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jb.addActionListener(this);
		
		
		
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		String name=jtf1.getText();
		String id=jtf2.getText();
		String addr=jtf3.getText();
		String details=jtf4.getText();
		String phone=jtf5.getText();
		String bg=jcb.getSelectedItem().toString();
		Empdis em =new Empdis(name,id,addr,details,phone,bg);
		
	}
	public static void main(String args[]) {
		Employee e = new Employee();
	}
	
	
	

}
