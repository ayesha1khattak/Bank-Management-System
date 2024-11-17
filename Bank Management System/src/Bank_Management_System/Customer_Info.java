package Bank_Management_System;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Customer_Info extends Customer_Account
{
		private String firstName;
	    private String lastName;
	    private String address;
	    private String CNIC;
	    private int age;
	    private String sex;
	    private String dob;
	    private String occupation;
	    private String contactNumber;
	    private String password;        
	    private String accountType;

	public Customer_Info()
	{
		int count=1;
		do
		{
		try
		{
			Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter your First Name");
	        firstName=scanner.nextLine();
	        Custom_Exception.testName(firstName);
	        break;
	        
		}
		catch(InputMismatchException ex)
        {
            System.out.println("Input Mismatch Exeption");
            System.out.println("You have entered an invalid value");
            System.out.println("ReEnter your First Name");
        }
		catch(invalidNameEx ex)
        {
    
           System.out.println(ex);
           System.out.println("ReEnter your First Name");
        }
		
		}
		while(count==1);
		do
		{
		try
		{
			Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter your Last Name");
	        lastName=scanner.nextLine();
	        Custom_Exception.testName(lastName);
	        break;
	        
		}
		catch(InputMismatchException ex)
        {
            System.out.println("Input Mismatch Exeption");
            System.out.println("You have entered an invalid value");
            System.out.println("ReEnter your Last Name");
        }
		catch(invalidNameEx ex)
        {
    
           System.out.println(ex);
           System.out.println("ReEnter your Last Name");
        }
		
		}
		while(count==1);
		 Scanner scanner=new Scanner(System.in);
		 do
	 		{
	 		try
	 		{
	 			
	 	        System.out.println("Enter your Complete Address");
	 	        address=scanner.nextLine();
	 	        Custom_Exception.testAddress(address);
	 	        break;
	 	        
	 		}
	 		catch(InputMismatchException ex)
	         {
	             System.out.println("Input Mismatch Exeption");
	             System.out.println("You have entered an invalid value");
	             System.out.println("ReEnter your Address");
	         }
	 		catch(invalidAddressEx ex)
	         {
	     
	            System.out.println(ex);
	            System.out.println("ReEnter your Address");
	         }
	 		
	 		}
	 		while(count==1);
         do
 		{
 		try
 		{
 			
 	        System.out.println("Enter your CNIC Number");
 	        CNIC=scanner.nextLine();
 	        Custom_Exception.testNumber(CNIC);
 	        break;
 	        
 		}
 		catch(InputMismatchException ex)
         {
             System.out.println("Input Mismatch Exeption");
             System.out.println("You have entered an invalid value");
             System.out.println("ReEnter your CNIC Number");
         }
 		catch(invalidNumberEx ex)
         {
     
            System.out.println(ex);
            System.out.println("ReEnter your CNIC Number");
         }
 		
 		}
 		while(count==1);
         try
  		{
  	        System.out.println("Enter your Age");
  	        age=scanner.nextInt();
  	        Custom_Exception.testAge(age);
  		}
  		catch(InputMismatchException ex)
          {
              System.out.println("Input Mismatch Exeption");
              System.out.println("You have entered an invalid value");
          }
  		catch(invalidAgeEx ex)
          {
      
             System.out.println(ex);
          }
  		
   			
   	        System.out.println("Enter the Gender");
   	        sex=scanner.next();
   	       
   	 
         do
  		{
  		try
  		{
  			
  	        System.out.println("Enter your Date of Birth in this format dd/mm/yyyy");
  	        dob=scanner.next();
  	        Custom_Exception.testNumber(dob);
  	        break;
  	        
  		}
  		catch(InputMismatchException ex)
          {
              System.out.println("Input Mismatch Exeption");
              System.out.println("You have entered an invalid value");
              System.out.println("ReEnter your Date of Birth");
          }
  		catch(invalidNumberEx ex)
          {
      
             System.out.println(ex);
             System.out.println("ReEnter your Date of Birth ");
          }
  		}
  		while(count==1);
         do
 		{
 		try
 		{
 	        System.out.println("Enter your Occupation");
 	        occupation=scanner.next();
 	        Custom_Exception.testName(occupation);
 	        break;
 	        
 		}
 		catch(InputMismatchException ex)
         {
             System.out.println("Input Mismatch Exeption");
             System.out.println("You have entered an invalid value");
             System.out.println("ReEnter your Occupation");
         }
 		catch(invalidNameEx ex)
         {
     
            System.out.println(ex);
            System.out.println("ReEnter your Occupation");
         }
 		
 		}
 		while(count==1);
         do
   		{
   		try
   		{
   			
   	        System.out.println("Enter your Contact Number");
   	        contactNumber=scanner.next();
   	        Custom_Exception.testNumber(contactNumber);
   	        break;
   	        
   		}
   		catch(InputMismatchException ex)
           {
               System.out.println("Input Mismatch Exeption");
               System.out.println("You have entered an invalid value");
               System.out.println("ReEnter your Contact Number");
           }
   		catch(invalidNumberEx ex)
           {
       
              System.out.println(ex);
              System.out.println("ReEnter your Contact Number");
           }
   		}
   		while(count==1);
         System.out.println("Enter your Password");
         password=scanner.next();
  	        System.out.println("Enter your Account Type");
  	        accountType=scanner.next();
	}
   		 
	public void ShowPersonelInformation()
	{
	 System.out.println("Personel Information of the Customer : ");
	 System.out.println("Account ID : "+getAccId());	
	 System.out.println("First Name : "+firstName);
   	 System.out.println("Last Name : "+lastName);
   	 System.out.println("Addres : "+address);
   	 System.out.println("CNIC number: "+CNIC);
     System.out.println("Age is : "+age);
	 System.out.println("Gender : "+sex);
	 System.out.println("Date of Birth"+dob);
	 System.out.println("Occupation : "+occupation);
	 System.out.println("Contact Number : "+contactNumber);
	 System.out.println("Account Type:"+accountType);
	}
	public void ShowAccountInformation()
	{
		System.out.println("Account Information of the Customer : ");
		System.out.println("Current Balance : "+getCurrentBalance());
	   	System.out.println("Currency : "+getCurrency());
	   	System.out.println("Total Deposited Ammount : "+getTdepositAmount());
	   	System.out.println("Total Amount Withdrawn: "+getTwithdrawAmount());
	   	System.out.println("Account Creation Time : "+getTimeStampCreated());
	}
	
	    public String getfirstName()
	    {
	        return firstName;
	    }
	    public String getlastName()
	    {
	        return lastName;
	    }
	    public String getpassword()
	    {
	        return password;
	    }
	    public String getAddress()
	    {
	        return address;
	    } 
	    public String getCNIC()
	    {
	        return CNIC;
	    }
	    public int getAge()
	    {
	        return age;
	    }
	    public String getGender()
	    {
	        return sex;
	    }
	    public String getDateOfBirth()
	    {
	        return dob;
	    }
	    public String getOccupation()
	    {
	        return occupation;
	    }
	    public String getContactNumber()
	    {
	        return contactNumber;
	    }
	    public String getAccountType()
	    {
	        return accountType;
	    }
	    public void setfirstName(String firstName)
	    {
	        this.firstName=firstName;
	    }
	    public void setlastName(String lastName)
	    {
	        this.lastName=lastName;
	    }
	    public void setAddress(String address)
	    {
	        this.address=address;
	    }
	    public void setOccupation(String occupation)
	    {
	        this.occupation=occupation;
	    }
	    public void setContactNumber(String contactNumber)
	    {
	        this.contactNumber=contactNumber;
	    } 
	    public void setPassword(String password)
	    {
	    	this.password=password;
	    }
	    
	    public int CheckPassword(String pass)
	    {
	    	if(pass.equals(password))
	    	{
	    		return 1;
	    	}
	    	else
	    		return 0;
	    }
}
