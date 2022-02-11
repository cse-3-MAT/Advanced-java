import javax.swing.*;
import java.awt.*;
public class Empdis extends JFrame
{
public Empdis(String name,String id,String addr , String details,String phone,String bg) {
setVisible(true);
setSize(250,220);
setTitle("Emplyee Details");


JLabel jLabel1 = new JLabel("Employee Details");

JLabel jLabel2 = new JLabel(" Name :- ");
JTextField jTextField1 = new JTextField(10);

JLabel jLabel3 = new JLabel("ID :- ");
JTextField jTextField2 = new JTextField(10);

JLabel jLabel4 = new JLabel(" Address :- ");
JTextField jTextField3 = new JTextField(10);

JLabel jLabel5 = new JLabel(" phone :- " );
JTextField jTextField4 = new JTextField(10);

JLabel jLabel6 = new JLabel("Joining Details :- ");
JTextField jTextField5 = new JTextField(10);

JLabel jLabel7 = new JLabel("Blood group :- ");
JTextField jTextField6 = new JTextField(10);



setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

jLabel1.setForeground(new java.awt.Color(255, 51, 255));
jTextField1.setEditable(false);
jTextField2.setEditable(false);
jTextField3.setEditable(false);
jTextField4.setEditable(false);
jTextField5.setEditable(false);

JPanel p=new JPanel();
p.add(jLabel1);
p.add(jLabel2);
p.add(jTextField1);
p.add(jLabel3);
p.add(jTextField2);
p.add(jLabel4);
p.add(jTextField3);
p.add(jLabel5);
p.add(jTextField4);
p.add(jLabel6);
p.add(jTextField5);
add(p);
jTextField1.setText(name);
jTextField2.setText(id);
jTextField3.setText(addr);
jTextField4.setText(details);
jTextField5.setText(phone);
jTextField6.setText(bg);

}
}