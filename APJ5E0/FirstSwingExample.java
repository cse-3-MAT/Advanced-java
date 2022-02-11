import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class FirstSwingExample implements ActionListener
{
	JPanel p;
	JFrame f;
	JRadioButton jrb1,jrb2;
	JLabel l;
	JTextField jt;
	JComboBox jcb;
	JButton jb;
	ButtonGroup group;
	int count = 0;
	public FirstSwingExample()
	{
		//create it
		f = new JFrame("Counter");
		p = new JPanel();
		jb = new JButton("Create");
		jrb1 = new JRadioButton("up");
		jrb2 = new JRadioButton("Down");
		group = new ButtonGroup();
		jt = new JTextField("Value is:0");
		l = new JLabel("Count");
		String values[] = {"1","2","3","4","5"};
		jcb = new JComboBox(values);
		
		
		//config it
		p.setBackground(Color.yellow);
		p.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setSize(500,500);
		f.setTitle("My First window");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		//Add it
		group.add(jrb1);
		group.add(jrb2);
		p.add(l);
		p.add(jt);
		p.add(jrb1);
		p.add(jrb2);
		p.add(jcb);
		p.add(jb);
		f.add(p);
		jb.addActionListener(this);
		
		}
	public static void main(String args[]) {
		FirstSwingExample mywindow = new FirstSwingExample();
	}
	
	public void actionPerformed(ActionEvent e) {
		if(jrb1.isSelected()) {
			int value= Integer.parseInt(jcb.getSelectedItem().toString());
			count += value;
			jt.setText("Value is:"+count);
		}

		
		if(jrb2.isSelected()) {
			int value = Integer.parseInt(jcb.getSelectedItem().toString());
			count -= value;
			jt.setText("Value is:"+count);
		}
	}
	
}	
