package Atmapplication;
import java.awt.*;


import javax.swing.*;

import java.awt.event.*;

@SuppressWarnings("serial")
public class Signup2 extends JFrame implements ActionListener {
	 


	JTextField pan,aadhar;
    JButton next;
    JRadioButton syes,sno,eyes,eno;
   
	JComboBox religion,category,Income,occupation,education;
    String formno;

	
	Signup2(String formno){
		this.formno=formno;
		setLayout(null);
		setTitle("Account application-page 2");
		
		
		JLabel additionalDetails=new JLabel("Page 2: Additional Details");
		additionalDetails.setFont(new Font("Raleway",Font.BOLD,24));
		additionalDetails.setBounds(290,60,400,30);
		add(additionalDetails);
		
		JLabel name=new JLabel("Religion:");
		name.setFont(new Font("Raleway",Font.BOLD,20));
		name.setBounds(100,140,100,30);
		add(name);
		 
		String valReligion[]= {"Hindu","Muslim","Sikh","Christian","Others"};
		religion=new JComboBox(valReligion);
		religion.setBounds(300,140,400,30);
		religion.setBackground(Color.WHITE);
		add(religion);
		
		
		JLabel fname=new JLabel("Catagory:");
		fname.setFont(new Font("Raleway",Font.BOLD,20));
		fname.setBounds(100,190,100,30);
		add(fname);
		
		
		String valcategory[]= {"General","OBC","SC","ST","Others"};
		 category=new JComboBox(valcategory);
		category.setBounds(300,190,400,30);
		category.setBackground(Color.WHITE);
		add(category);
		
		
		JLabel dob=new JLabel("Income:");
		dob.setFont(new Font("Raleway",Font.BOLD,20));
		dob.setBounds(100,240,200,30);
		add(dob);
		
		String valIncome[]= {"Null","<1,50,000","<2,50,000","<5,00,000","upto 10,00000"};
		Income=new JComboBox(valIncome);
		Income.setBounds(300,240,400,30);
		Income.setBackground(Color.WHITE);
		add(Income);
		
	    
		
		
		
		JLabel gender =new JLabel("Educational");
		gender.setFont(new Font("Raleway",Font.BOLD,20));
		gender.setBounds(100,290,200,30);
		add(gender);		
		
		JLabel email=new JLabel("qualification:");
		email.setFont(new Font("Raleway",Font.BOLD,20));
		email.setBounds(100,310,200,30);
		add(email);
		
		String educationValues[]= {"Non-graduate","Graduate","Post-graduate","Doctrate","Others"};
		 education=new JComboBox(educationValues);
		education.setBounds(300,300,400,30);
		education.setBackground(Color.WHITE);
		add(education);
		
		
		JLabel marital=new JLabel("Occupation:");
		marital.setFont(new Font("Raleway",Font.BOLD,20));
		marital.setBounds(100,350,200,30);
		add(marital);
		
		String occupationValues[]= {"Salaried","self-employeed","Business","Student","Retaired"};
		 occupation=new JComboBox(occupationValues);
		occupation.setBounds(300,350,400,30);
		occupation.setBackground(Color.WHITE);
		add(occupation);
		
		
		
		JLabel address=new JLabel("Panno:");
		address.setFont(new Font("Raleway",Font.BOLD,20));
		address.setBounds(100,400,200,30);
		add(address);
		
		pan=new JTextField();
		pan.setFont(new Font("Raleway",Font.ITALIC,14));
		pan.setBounds(300,400,400,30);
		add(pan);
		
	    JLabel city=new JLabel("Adharno:");
		city.setFont(new Font("Raleway",Font.BOLD,20));
		city.setBounds(100,450,200,30);
		add(city);
		
		aadhar=new JTextField();
		aadhar.setFont(new Font("Raleway",Font.ITALIC,14));
		aadhar.setBounds(300,450,400,30);
		add(aadhar);
		 
		JLabel state=new JLabel("Seniorcitizen");
		state.setFont(new Font("Raleway",Font.BOLD,20));
		state.setBounds(100,500,200,30);
		add(state);
		
		syes=new JRadioButton("yes");
		syes.setBounds(300,500,100,30);
		syes.setBackground(Color.WHITE);
	    add(syes);
		
	    
	    sno=new JRadioButton("no");
		sno.setBounds(450,500,100,40);
		sno.setBackground(Color.WHITE);
	    add(sno);
	    
	    ButtonGroup maritalgroup=new ButtonGroup();
	    maritalgroup.add(syes);
	    maritalgroup.add(sno);
	    
		 
	    JLabel pin=new JLabel("Exisitingaccount");
		pin.setFont(new Font("Raleway",Font.BOLD,20));
		pin.setBounds(100,550,200,30);
		add(pin);
		
		eyes=new JRadioButton("yes");
		eyes.setBounds(300,550,100,30);
		eyes.setBackground(Color.WHITE);
	    add(eyes);
		
	    
	    eno=new JRadioButton("no");
		eno.setBounds(450,550,100,30);
		eno.setBackground(Color.WHITE);
	    add(eno);
	    
	    ButtonGroup emaritalgroup=new ButtonGroup();
	    emaritalgroup.add(eyes);
	    emaritalgroup.add(eno);
		
		
		
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
	  
		String sreligion=(String)religion.getSelectedItem();
	    String scategory=(String)category.getSelectedItem();
	     String sincome=(String)Income.getSelectedItem();
	    String seducation=(String)education.getSelectedItem();
	    String soccupation=(String)occupation.getSelectedItem();
	    
	    
	    String span=pan.getText();
        String saadhar=aadhar.getText();
 
	    String seniorcitizen=null;
	    if(syes.isSelected()) {
	    	seniorcitizen="yes";
	    }
	    else if(eno.isSelected()) {
	    	seniorcitizen="No";
	    	
	    }
	    String Exisitingaccount =null;
	    if(syes.isSelected()) {
	    	Exisitingaccount="yes";
	    }
	    else if(eno.isSelected()) {
	    	Exisitingaccount="No";
	    }
	    
         
	    try {
	    		Conn c=new Conn();
                String query = "insert into Signup2 values( '"+formno+"' ,'" +sreligion + "','" + scategory+ "','" + sincome + "','" + seducation + "','" + soccupation + "','" + span + "','" + saadhar + "','" + seniorcitizen + "','" + Exisitingaccount + "')";
                c.s.executeUpdate(query);
                new Signup3(formno).setVisible(true);
                setVisible(false);
           }
	    catch(Exception e) {
	    	System.out.println(e);
	    }
	    
     }
	public static void main(String args[]) {
		new Signup2("");
	}

}

