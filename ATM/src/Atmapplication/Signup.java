package Atmapplication;
import java.awt.*;
import java.util.*;
import javax.swing.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

@SuppressWarnings("serial")
public class Signup extends JFrame implements ActionListener {
	

	long random;
	JTextField nameTextField,fnameTextField ,emailTextField,addressTextField,pinTextField,cityTextField,stateTextField;
    JButton next;
    JRadioButton male,female,others,married,unmarried;
    JDateChooser  dateChooser;
	
	Signup(){
		setLayout(null);
		Random ran=new Random();
		long random=Math.abs((ran.nextLong() % 9000L)+1000L);
		JLabel formno=new JLabel("APPLICATION FORM NO"+ random);
		formno.setFont(new Font("Raleway",Font.BOLD,38));
		formno.setBounds(140,20,600,40);
		add(formno);
		
		JLabel personDetails=new JLabel("Page 1: Personal Details");
		personDetails.setFont(new Font("Raleway",Font.BOLD,22));
		personDetails.setBounds(290,80,400,30);
		add(personDetails);
		
		JLabel name=new JLabel("NAME:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,180,100,30);
		add(name);
		
		nameTextField=new JTextField();
		nameTextField.setFont(new Font("Raleway",Font.ITALIC,14));
		nameTextField.setBounds(300,180,400,30);
		add(nameTextField);
		
		JLabel Fname=new JLabel("Fathername:");
		Fname.setFont(new Font("Raleway",Font.BOLD,20));
		Fname.setBounds(100,220,200,30);
		add(Fname);
		
		fnameTextField=new JTextField();
		fnameTextField.setFont(new Font("raleway",Font.ITALIC,14));
		fnameTextField.setBounds(300,220,400,30);
		add(fnameTextField);
		
		JLabel dob=new JLabel("DATE OF BIRTH:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,260,200,30);
		add(dob);
		
	    dateChooser =new JDateChooser();
		dateChooser.setBounds(300,260,400,30);
		dateChooser.setForeground(new Color(105,105,105));
		add(dateChooser);
		
		
		
		JLabel gender =new JLabel("Gender:");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,300,200,30);
		add(gender);
		
		male =new JRadioButton("Male");
		male.setBounds(300,300,60,30);
		male.setBackground(Color.white);
		add(male);
		
		female =new JRadioButton("Female");
		female.setBounds(450,300,120,30);
		female.setBackground(Color.white);
		add(female);
		
		ButtonGroup gendergroup =new ButtonGroup();
		gendergroup.add(male);
		gendergroup.add(female);
		
		JLabel email=new JLabel("EMAIL:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,340,200,30);
		add(email);
		
	    emailTextField=new JTextField();
		emailTextField.setFont(new Font("Raleway",Font.ITALIC,14));
		emailTextField.setBounds(300,340,400,30);
		add(emailTextField);
		
		JLabel marital=new JLabel("Marital status:");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,380,200,30);
		add(marital);
		
		married =new JRadioButton("Married");
		married.setBounds(300,380,100,30);
		married.setBackground(Color.white);
		add(married);
		
		unmarried =new JRadioButton("Unmarried");
		unmarried.setBounds(450,380,100,30);
		unmarried.setBackground(Color.white);
		add(unmarried);
		
		 others=new JRadioButton("Others");
		others.setBounds(630,380,100,30);
		others.setBackground(Color.white);
		add(others);
		
		ButtonGroup maritalgroup =new ButtonGroup();
		maritalgroup.add(married);
		maritalgroup.add(unmarried);
		maritalgroup.add(others);
		
		
		
		JLabel address=new JLabel("Address:");
	    address.setFont(new Font("Raleway",Font.BOLD,20));
		address.setBounds(100,420,200,30);
		add(address);
		
		 addressTextField=new JTextField();
		addressTextField.setFont(new Font("Raleway",Font.ITALIC,14));
		addressTextField.setBounds(300,420,400,30);
		add(addressTextField);
		
		JLabel city=new JLabel("City:");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,460,320,30);
		add(city);
		
		cityTextField=new JTextField();
		cityTextField.setFont(new Font("Raleway",Font.ITALIC,14));
		cityTextField.setBounds(300,460,400,30);
		add(cityTextField);
		 
		JLabel state=new JLabel("State:");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,500,360,30);
		add(state);
		
		stateTextField=new JTextField();
		stateTextField.setFont(new Font("Raleway",Font.ITALIC,14));
		stateTextField.setBounds(300,500,400,30);
		add(stateTextField);
		
		JLabel pin=new JLabel("Pincode:");
		pin.setFont(new Font("Raleway",Font.BOLD,20));
		pin.setBounds(100,540,200,30);
		add(pin);
		
		pinTextField=new JTextField();
		pinTextField.setFont(new Font("Raleway",Font.ITALIC,14));
		pinTextField.setBounds(300,540,400,30);
		add(pinTextField);
		
		next = new JButton("Next");
		next.setBackground(Color.BLACK);
		next.setForeground(Color.WHITE);
		next.setFont(new Font("Raleway",Font.BOLD,14));
		next.setBounds(620,660,80,30);
		next.addActionListener(this);
		add(next);
		
		
        getContentPane().setBackground(Color.WHITE);
		
		setSize(850,800);
		setLocation(350,10);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae) {
	    String  formno =""+random;
	    String name=nameTextField.getText();
	    String fname=fnameTextField.getText();
	    String dob=((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
	    String gender=null;
	    if(male.isSelected()) {
	    	gender ="Male";
	    	
	    }else if(female.isSelected()) {
	    	gender="Female";
	    	
	    }
	    String email =emailTextField.getText();
	    String marital=null;
	    if(married.isSelected()) {
	    	marital ="Married";
	    	
	    }else if(unmarried.isSelected()) {
	    	marital="Unmarried";
	    	
	    }
	    else if(others.isSelected()) {
	    	marital="others";
	    }
	    String address=addressTextField.getText();
	    String city=cityTextField.getText();
	    String state=stateTextField.getText();
	    String pin=pinTextField.getText();
	    try {
	    	if (name.equals("")) {
	            JOptionPane.showMessageDialog(null, "Name is required");
	        } 
	    	else {
	    		Conn c=new Conn();
                String query = "insert into Signup values('" + formno + "','" + name + "','" + fname + "','" + dob + "','" + gender + "','" + email + "','" + marital + "','" + address + "','" + city + "','" + state + "','" + pin + "')";
                c.s.executeUpdate(query);
                
                setVisible(false);
                new Signup2(formno).setVisible(true);
                
                
            } 
	    }
	    catch(Exception e) {
	    	System.out.println(e);
	    }
	    
     }
	public static void main(String args[]) {
		new Signup();
	}

}
