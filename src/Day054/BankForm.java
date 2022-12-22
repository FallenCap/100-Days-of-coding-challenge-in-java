/*Design a simple bank form using java swing component*/

package Day054;


import javax.swing.*;
import java.awt.*;

public class BankForm {
	JFrame frame;
	JLabel l1;
	JTextField t1, t2, t3, t4, t5;
	JButton b1;
	JCheckBox checkBox;
	
    BankForm() {  
    	
    	//Creating the frame
    	frame = new JFrame();
    	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Bank Account from");
		frame.setLayout(null);
		frame.setSize(1000, 1000);
		frame.setBackground(Color.blue);
		frame.setResizable(true);
		
		l1 = new JLabel();
		l1.setText("Bank Account form: ");
		l1.setBounds(130, 0, 500, 100);
		l1.setForeground(new Color(57, 68, 247));
		l1.setFont(new Font("MV BOLI", Font.PLAIN, 32));
		frame.add(l1);
		
		
		t1 = new JTextField("Enter your Name:");
		t1.setBounds(130,100, 200,40); 
		t1.setFont(new Font("Consolas", Font.PLAIN, 14));
		t1.setForeground(Color.green);
		t1.setBackground(Color.black);
		frame.add(t1);
		
		t2 = new JTextField("Enter your Father Name: ");
		t2.setBounds(130,150, 200,40); 
		t2.setFont(new Font("Consolas", Font.PLAIN, 14));
		t2.setForeground(Color.green);
		t2.setBackground(Color.black);
		frame.add(t2);
		
		t3 = new JTextField("Enter your Birth date: ");
		t3.setBounds(130,200, 200,40); 
		t3.setFont(new Font("Consolas", Font.PLAIN, 14));
		t3.setForeground(Color.green);
		t3.setBackground(Color.black);
		frame.add(t3);
		
		t4 = new JTextField("Enter your Aadhar Number:");
		t4.setBounds(130,250, 300,40); 
		t4.setFont(new Font("Consolas", Font.PLAIN, 14));
		t4.setForeground(Color.green);
		t4.setBackground(Color.black);
		frame.add(t4);
		
		t5 = new JTextField("Enter your PAN Number:");
		t5.setBounds(130,250, 300,40); 
		t5.setFont(new Font("Consolas", Font.PLAIN, 14));
		t5.setForeground(Color.green);
		t5.setBackground(Color.black);
		frame.add(t5);
		
		t4 = new JTextField("Enter your Aadhar Number:");
		t4.setBounds(130,300, 300,40); 
		t4.setFont(new Font("Consolas", Font.PLAIN, 14));
		t4.setForeground(Color.green);
		t4.setBackground(Color.black);
		frame.add(t4);
		
		t5 = new JTextField("Enter your Address:");
		t5.setBounds(130,350, 300,100); 
		t5.setFont(new Font("Consolas", Font.PLAIN, 14));
		t5.setForeground(Color.green);
		t5.setBackground(Color.black);
		frame.add(t5);
		
		checkBox = new JCheckBox();
		checkBox.setBounds(130, 500, 500, 50);
		frame.add(checkBox);
		checkBox.setText("please check this box to agree our agreements.");
		
		b1 = new JButton();
		b1.setText("Click here");
		b1.setFont(new Font("Consolas", Font.PLAIN, 14));
		b1.setBounds(130,550,100, 40);
		b1.setForeground(Color.green);
		b1.setBackground(Color.black);
		frame.add(b1);	
		
		
		frame.setVisible(true);
		
		
    }
}
