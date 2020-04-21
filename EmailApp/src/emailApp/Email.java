package emailApp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private String email;
	private String department;
	private int mailBoxCapacity=500;
	private int defaultpasswordLength=8;
	private String alternateEmail;
	private String companySuffix="company.com";
	
	//constructor to receive first name and lastname;            
	
	public Email(String firstName,String lastName) {
		this.firstName=firstName;
		this.lastName=lastName;
		System.out.println("Email created"+this.firstName+" "+this.lastName); 
		
		//call the method asking for the department -its gonna return the department
		 	this.department=setDepartment();
		 	System.out.println("department :"+this.department);
		 	
		 //call the method that return random password
		 	this.password=setPassword(defaultpasswordLength);
		 	System.out.println("your password :"+this.password);
		 	
		 	//combines element to generate emails
		 	email=firstName.toLowerCase()+"."+lastName.toLowerCase()+"@"+department+"."+companySuffix;
		 	System.out.println("you email is:"+email);
		
	}
	
	
	//ask for department- ASK THE IT SPECIALIST WHAT DEPARTMENT WHAT DEPARTMENT THIS PERSON GONNA BE
	private String setDepartment() {
		System.out.print("enter the department \n 1. for Sales \n 2. for Development\n 3. for Accounting \n 0. for none");
		Scanner scn=new Scanner(System.in);
		int depChoice=scn.nextInt();
		if(depChoice==1) {return "Sales";}
		else if(depChoice==2) {return "Development";}
		else if(depChoice==3) {return "Accounting";}
		else {return "";}
	}
	
	//generate random password
	private String setPassword(int length) {
		String passwordSet="ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%^&*";
		char[] password=new char[length];
		for(int i=0;i<length;i++) {
			int rand=(int)(Math.random()*passwordSet.length());
			password[i]=passwordSet.charAt(rand);
		}
		return new String(password);
	}
	
	
	//set email capacity
	
	public void setmailCapacity(int capacity ) {
		this.mailBoxCapacity=capacity;
	}
	
	//set alternate email
	public void setAlternateMail(String altMail) {
		this.alternateEmail=altMail;
	}
	
	//change the password
	public void setPassword(String password) {
		this.password=password;
	}


	public String getPassword() {
		return password;
	}


	public int getMailBoxCapacity() {
		return mailBoxCapacity;
	}


	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	public String showInfo() {
		return "Name: \n"+firstName+lastName+"Company mail: \n"+email
				+ "mail boxCapacity: "+mailBoxCapacity;
	}
	

}
