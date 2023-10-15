package Atmapplication;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
@SuppressWarnings("serial")
public class Signup3 extends JFrame implements ActionListener{
	
	
	JCheckBox c1,c2,c3,c4,c5,c6,c7;
	JRadioButton r1,r2,r3,r4;
	JButton submit,cancel;
	String formno;
	
	Signup3(String formno){
		this.formno=formno;
		setLayout(null);
		
		JLabel l1=new JLabel("Page 3:Account Details");
		l1.setFont(new Font("Raleway",Font.BOLD,22));
		l1.setBounds(200,40,400,40);
		add(l1);
		
		JLabel type=new JLabel("Account Type");
		type.setFont(new Font("Raleway",Font.BOLD,22));
		type.setBounds(100,80,400,40);
		add(type);
		
		r1=new JRadioButton("Savings Account");
		r1.setFont(new Font("Raleway",Font.BOLD,16));
		r1.setBackground(Color.WHITE);
		r1.setBounds(100,180,200,40);
		add(r1);
		
		r2=new JRadioButton("Deposit Account");
		r2.setFont(new Font("Raleway",Font.BOLD,16));
		r2.setBackground(Color.WHITE);
		r2.setBounds(350,180,250,20);
		add(r2);
		
		r3=new JRadioButton("Current Account");
		r3.setFont(new Font("Raleway",Font.BOLD,16));
		r3.setBackground(Color.WHITE);
		r3.setBounds(100,220,250,20);
		add(r3);
		
		r4=new JRadioButton("Recurring Deposite Account");
		r4.setFont(new Font("Raleway",Font.BOLD,16));
		r4.setBackground(Color.WHITE);
		r4.setBounds(350,220,250,20);
		add(r4);
		
		ButtonGroup groupaccount=new ButtonGroup();
		groupaccount.add(r1);
		groupaccount.add(r2);
		groupaccount.add(r3);
		groupaccount.add(r4);
		
		JLabel card=new JLabel("Card Number");
		card.setFont(new Font("Raleway",Font.BOLD,22));
		card.setBounds(100,300,200,40);
		add(card);
		
		JLabel number=new JLabel("XXXX-XXXX-XXXX-4184");
		number.setFont(new Font("Raleway",Font.BOLD,22));
		number.setBounds(330,300,300,40);
		add(number);
		
		JLabel carddetails=new JLabel("Your 16 digit card number");
		carddetails.setFont(new Font("Raleway",Font.BOLD,12));
		carddetails.setBounds(100,330,300,20);
		add(carddetails);
		
		JLabel pin=new JLabel("PIN:");
		pin.setFont(new Font("Raleway",Font.BOLD,22));
		pin.setBounds(100,370,300,40);
		add(pin);
		
		
		JLabel pnumber=new JLabel("XXXX");
		pnumber.setFont(new Font("Raleway",Font.BOLD,22));
		pnumber.setBounds(330,370,300,40);
		add(pnumber);
		
		JLabel pindetails=new JLabel("Your 4 digit pin number");
		pindetails.setFont(new Font("Raleway",Font.BOLD,12));
		pindetails.setBounds(100,400,300,20);
		add(pindetails);
		
		
		JLabel services=new JLabel("Services Required");
		services.setFont(new Font("Raleway",Font.BOLD,12));
		services.setBounds(100,450,200,30);
		add(services);
		
		c1=new JCheckBox("ATM card");
		c1.setBackground(Color.WHITE);
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);
        
        c2=new JCheckBox("Internet banking");
		c2.setBackground(Color.WHITE);
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);
        
        c3=new JCheckBox("Mobile banking");
		c3.setBackground(Color.WHITE);
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);
        
        c4=new JCheckBox("Emaail & sms alerts");
		c4.setBackground(Color.WHITE);
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);
        
        c5=new JCheckBox("cheque book");
		c5.setBackground(Color.WHITE);
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);
        
        c6=new JCheckBox("E-statement");
		c6.setBackground(Color.WHITE);
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);
        
        c7=new JCheckBox("The above entered details are true to my best of by knowledge");
		c7.setBackground(Color.WHITE);
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,680,600,30);
        add(c7);
		
        
        submit =new JButton("Submit");
        submit.setBackground(Color.BLACK);
        submit.setForeground(Color.WHITE);
        submit.setFont(new Font("Raleway",Font.BOLD,14));
        submit.setBounds(250,720,100,30);
        submit.addActionListener(this);
        add(submit);
        
        
        cancel =new JButton("Cancel");
        cancel.setBackground(Color.BLACK);
        cancel.setForeground(Color.WHITE);
        cancel.setFont(new Font("Raleway",Font.BOLD,14));
        cancel.setBounds(420,720,100,30);
        cancel.addActionListener(this);
        add(cancel);
		
		getContentPane().setBackground(Color.WHITE);
        
		setSize(850,820);
		setLocation(350,0);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae) {
		if(ae.getSource()==submit) {
			String accountType=null;
			if(r1.isSelected()) {
				accountType="Savings account";
			}else if(r2.isSelected()) {
				accountType="Fixed account";
			}
			else if(r3.isSelected()) {
				accountType="current account";
			}
			else if(r4.isSelected()) {
				accountType="recurring deposit account";
			}
			Random random=new Random();
			String cardnumber = "" + Math.abs((random.nextLong() % 90000000L)+5040936000000000L);
			String pinnumber ="" +  Math.abs((random.nextLong() % 90000L)+1000L);
			
			String facility="";
			if(c1.isSelected()) {
				facility=facility + "Atm Card";
				
			}else if(c2.isSelected()) {
				facility = facility + "Internet banking";
			}
			else if(c3.isSelected()) {
				facility = facility + "Mobile banking";
			}
			else if(c4.isSelected()) {
				facility = facility + "Email & SMS Alerts";
			}
			else if(c5.isSelected()) {
				facility = facility + "Cheque book";
			}
			else if(c6.isSelected()) {
				facility = facility + "E-Statement";
			}
			
			try {
				if(accountType.equals("")) {
					JOptionPane.showMessageDialog(null,"Account type is Required");
				}else {
					Conn conn=new Conn();
					String query1 = "insert into signup3 values('"+formno+"','"+accountType+"','"+cardnumber+"','"+pinnumber+"','"+facility+"')";
					String query2 = "insert into login values('"+formno+"','"+cardnumber+"','"+pinnumber+"')";
					conn.s.executeUpdate(query1);
					conn.s.executeUpdate(query2);
					
					JOptionPane.showMessageDialog(null,"card Number"+ cardnumber+"\n pin:"+pinnumber);
					setVisible(false);
					new Deposit(pinnumber).setVisible(false);
					
				}
				
			}catch(Exception e) {
				System.out.println(e);
			}
			
			
		}
		else if(ae.getSource()==cancel) {
			setVisible(false);
			new Login().setVisible(true);
		}
	}
	public static void main(String args[]) {
		new Signup3("");
	}

}
