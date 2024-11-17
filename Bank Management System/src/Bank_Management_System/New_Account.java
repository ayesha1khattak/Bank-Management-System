package Bank_Management_System;

import java.text.ParseException;
import java.util.Scanner;

public class New_Account extends Customer_Info
{
	
	public New_Account() 
	{
		if(getAge()>18 || getAge()<90)
		{
		System.out.println("Enter the amount u want deposit : ");
		System.out.println("The minimum amount must be 1000 to open an account : ");
		minimumDeposit(inputDepositAmount());
		if(getBalance()>=1000)
		{
		setaccId(getAccId()+1);
		System.out.println("Account Created Successfully....... Congratulations... : ");
		System.out.println("Your Account ID is : "+getAccId());
		System.out.println("You can access your account with Account ID only....");
		}
		else
		{
			System.out.println("You deposited less than the minimum deposited amount.....");
			System.out.println("So your account cannot be created....");
		}
		}
		else
		{
			System.out.println("Your age is less than 18 or greater than 90");
			System.out.println("So your account cannot be created..... ");
			
		}
	}
	public void Action() throws ParseException
	{ 
		Boolean quit = false;
		int choice;
		do
		{
		Scanner pas=new Scanner(System.in);
		System.out.println("Welcome ");
		System.out.println("Enter 1 to Check your Personel Details");
		System.out.println("Enter 2 to check your Account Details");
		System.out.println("Enter 3 to Deposit Money");
		System.out.println("Enter 4 to Withdraw Money");
		System.out.println("Enter 5 to edit Personel Information");
		System.out.println("Enter 6 to Change Password");
		System.out.println("Enter 0 to quit");
	    choice=pas.nextInt();
	    switch(choice)
	    {
	    case 0:
	    {
	    	quit=true;
	    	System.out.println("Thanks for your visit...");
	    	System.out.println("Keep using KAAM Bank........");
	    	break;
	    }
	    
	    case 1:
	    {
	    	ShowPersonelInformation();
	    	break;
	    }
	    case 2:
	    {
	    	int pref;
			Scanner pre=new Scanner(System.in);
			System.out.println("Enter 1 to Check your Complete Account Details");
			System.out.println("Enter 2 to Check your Current Balance");
			System.out.println("Enter 3 to Check your Total Deposited Money");
			System.out.println("Enter 4 to Check your Total Withdrawn Money");
			System.out.println("Enter 5 to Check your Account Creation Date");
			System.out.println("Enter 6 to Check your Currency");
			pref=pre.nextInt();
			switch(pref)
			{
			case 1:
			{
				ShowAccountInformation();
			}
			case 2:
			{
				System.out.println("Current Balance : "+getCurrentBalance());
			   	break;
			}
			case 3:
			{
			   	System.out.println("Total Deposited Ammount : "+getTdepositAmount());
			   	break;
			}
			case 4:
			{
			   	System.out.println("Total Amount Withdrawn: "+getTwithdrawAmount());
			   	break;
			}
			case 5:
			{
			   	System.out.println("Account Creation Time : "+getTimeStampCreated());
			   	break;
			}
			case 6:
			{
			   	System.out.println("Currency : "+getCurrency());
			   	break;
			}
			}
			break;
			
	    }
	   
	    case 3:
	    {
	    	depositAmount(inputDepositAmount());
	    	break;
	    }
	    case 4:
	    {
	    	WithDrawAmount(inputwithDrawAmount());
	    	break;
	    }
	    case 5:
	    {
	    	int edit;
	    	String temp;
			Scanner info=new Scanner(System.in);
			System.out.println("Enter 1 to Change First Name");
			System.out.println("Enter 2 to Change Second Name");
			System.out.println("Enter 3 to Change Address");
			System.out.println("Enter 4 to Change Occupation");
			System.out.println("Enter 5 to Change Contact Number");
		    edit=info.nextInt();
		    switch(edit)
		    {
		    case 1:
		    {
				System.out.println("Enter the new First Name");
				temp=info.nextLine();
		    	setfirstName(temp);
		    	break;
		    }
		    case 2:
		    {
				System.out.println("Enter the new Last Name");
				temp=info.nextLine();
		    	setlastName(temp);
		    	break;
		    }
		    case 3:
		    {
				System.out.println("Enter the new Address");
				temp=info.nextLine();
		    	setAddress(temp);
		    	break;
		    }
		    case 4:
		    {
				System.out.println("Enter the new Occupation");
				temp=info.nextLine();
		    	setOccupation(temp);
		    	break;
		    }
		    case 5:
		    {
				System.out.println("Enter the new contact Number");
				temp=info.nextLine();
		    	setContactNumber(temp);
		    	break;
		    }
		    }
		    break;
	    }
	    case 6:
	    {
	    	int tempID;
	    	String pass,Number;
	    	Scanner info=new Scanner(System.in);
	    	System.out.println("Enter your ID");
			tempID=info.nextInt();
			Scanner inf=new Scanner(System.in);
			System.out.println("Enter your Current Password");
			pass=inf.nextLine();
			Scanner in=new Scanner(System.in);
			System.out.println("Enter your Contact Number");
			Number=in.nextLine();
			if(tempID==getAccId() && pass.equals(getpassword())==true && Number.equals(getContactNumber())==true)
			{
				Scanner i=new Scanner(System.in);
				System.out.println("Enter your New Password");
				pass=i.nextLine();
				setPassword(pass);
				System.out.println("Password Changed Successfully....");
			}
			else
			{
				System.out.println("Wrong Details Entered....");
				System.out.println("So you Cannot proceed Further....");
			}
			
	    	
	    }
	    
	    }
	
	}
	while(quit==false);
	}		
}


