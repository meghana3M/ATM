package Atmapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
@SuppressWarnings("serial")
public class Withdrawl extends JFrame implements ActionListener{
	
	JTextField amount;
	JButton withdraw,back;
	String pinnumber;
	
	Withdrawl(String pinnumber){
		this.pinnumber=pinnumber;
		setLayout(null);
		
		ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons1/atm.jpg"));
		Image i2=i1.getImage().getScaledInstance(900,900,Image.SCALE_DEFAULT);
		ImageIcon i3=new ImageIcon(i2);
		JLabel image =new JLabel(i3);
		image.setBounds(0,0,900,900);
		add(image);
		
		JLabel text=new JLabel("enter the amount you want to withdraw");
		text.setBounds(170,300,400,20);
		text.setForeground(Color.WHITE);
		text.setFont(new Font("System",Font.BOLD,16));
		image.add(text);
		
		amount=new JTextField();
		amount.setFont(new Font("Raleway",Font.BOLD,16));
		amount.setBounds(170,350,320,25);
		image.add(amount);
		
		
		
		
        
		withdraw=new JButton("withdrawl");
		withdraw.setBounds(355,485,150,30);
		withdraw.addActionListener(this);
		image.add(withdraw);
		

		back=new JButton("Back");
		back.setBounds(355,520,150,30);
		back.addActionListener(this);
		image.add(back);
		
		
		setSize(900,900);
		setLocation(300,0);
		setUndecorated(true);
		setVisible(true);
	}
	
	public void actionPerformed(ActionEvent ae) {
		try {
		    String number=amount.getText();
		  

			Date date= new Date();
			if(ae.getSource()== withdraw) {
			   if(number.equals("")) {
				JOptionPane.showMessageDialog(null,"please enter the amount you want to withdraw");
			}else {
				Conn conn=new Conn();
				String withdrawType = " ";
				String query="insert into bank values('"+pinnumber+"','"+date+"','"+withdrawType+"','"+number+"')";
				conn.s.executeUpdate(query);
				JOptionPane.showMessageDialog(null,"Rs "+number+" withdraw Successfully" );
				setVisible(false);
				new Transcation(pinnumber).setVisible(true);
			}
			
			
			
		}else if(ae.getSource()==back) {
			setVisible(false);
			new Transcation(pinnumber).setVisible(true);
		}
	}catch(Exception e) {
		System.out.println(e);
	}
	
	}
    public static void main(String args[]) {
    	new Withdrawl("");
    }
}
	

