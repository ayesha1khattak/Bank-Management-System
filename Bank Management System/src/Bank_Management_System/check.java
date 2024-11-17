package Bank_Management_System;

import java.util.InputMismatchException;
import java.util.Scanner;

public class check
{
	int count=1;
	String name;

	public  void checkname() 
	{
		do
		{
		try
		{
			Scanner scanner=new Scanner(System.in);
	        System.out.println("Enter your First Name");
	        name=scanner.nextLine();
	        Custom_Exception.testName(name);
	        break;
	        
		}
		catch(InputMismatchException ex)
        {
            System.out.println("Input Mismatch Exeption");
            System.out.println("You have entered an invalid value");
            System.out.println("ReEnter your response");
        }
		catch(invalidNameEx ex)
        {
    
           System.out.println(ex);
           System.out.println("ReEnter your response");
        }
		
		}
		while(count==1);
	
	}
	public static void main(String [] args)
	{
		check obj= new check();
		obj.checkname();
	}
}
