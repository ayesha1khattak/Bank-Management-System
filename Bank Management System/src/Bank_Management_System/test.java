package Bank_Management_System;

import java.text.ParseException;
import java.util.Scanner;
public class test
{
	static int ID;
	static String pass;
	public static void main( String[] args) throws ParseException
    {
		int count=1;
		System.out.println("@           @  @@@@@@  @       @@@@@@@  @@@@@@@  @@       @@  @@@@@@               ");
		System.out.println("@     @     @  @       @       @        @     @  @ @     @ @  @       ");
		System.out.println("@    @ @    @  @       @       @        @     @  @  @   @  @  @         ");
		System.out.println("@  @     @  @  @@@@@@  @       @        @     @  @   @ @   @  @@@@@         ");
		System.out.println("@ @       @ @  @       @       @        @     @  @    @    @  @          ");
		System.out.println("@@         @@  @@@@@@  @@@@@@  @@@@@@@  @@@@@@@  @         @  @@@@@@          ");
		System.out.println("\n \n \t \t \t \t KAAM BANK \n \n");
		System.out.println("USER 1....");
    	New_Account user1=new New_Account();
    	/*
    	System.out.println("USER 2....");
    	New_Account user2=new New_Account();
    	System.out.println("USER 3....");
    	New_Account user3=new New_Account();
    	System.out.println("USER 4....");
    	New_Account user4=new New_Account();
    	System.out.println("USER 5....");
    	New_Account user5=new New_Account();
    	System.out.println("USER 6....");
    	New_Account user6=new New_Account();
    	System.out.println("USER 7....");
    	New_Account user7=new New_Account();
    	System.out.println("USER 8....");
    	New_Account user8=new New_Account();
    	System.out.println("USER 9....");
    	New_Account user9=new New_Account();
    	System.out.println("USER 10....");
    	New_Account user10=new New_Account(); 
    	*/
    	do
    	{
    	Scanner num=new Scanner(System.in);
    	System.out.println("Enter your ID ");
        ID=num.nextInt();
        if(ID>0 || ID<10)
    	{switch(ID)
    	{
    	case 1:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user1.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user1.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
            
    	}/*
    	case 2:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user2.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user2.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
            break;
    	}
    	case 3:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user3.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user3.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
    	}
    	case 4:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user4.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user4.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
    	}
    	case 5:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user5.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user5.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
    	}
    	case 6:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user6.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user6.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
    	}
    	case 7:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextInt();
            int temp;
            temp=user7.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user7.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
    	}
    	case 8:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user8.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user8.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
    	}
    	case 9:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user9.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user9.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            }
    	}
    	case 10:
    	{
    		Scanner pas=new Scanner(System.in);
    		System.out.println("Enter your Password : ");
            pass=pas.nextLine();
            int temp;
            temp=user10.CheckPassword(pass);
            if(temp==1)
            {
            	System.out.println("Password Match : ");
            	user10.Action();
            }
            else
            {
            	System.out.println("Incorrect Password: ");
            	System.out.println("You cannot proceed further ");
            	break;
            } 
    	} */
    	
    	
    	}
    	}
        else
        {
        	System.out.println("This ID doesnot match to any account:");
        	System.out.println("Enter your Correct Account ID");
        }
    	}
    	while(count==1);
    
    	
    }

}
