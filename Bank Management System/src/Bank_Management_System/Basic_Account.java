package Bank_Management_System;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
 
public class Basic_Account extends Customer_Account 
{ 
    @Override
    public void minimumDeposit() //interface function
    {
        double amount;
        while(true)
        {
                Scanner scanner=new Scanner(System.in);
                System.out.println("A minimum deposit of Rupees 1000 is required to set up your basic account ");
                System.out.println("Enter Rupees 1000 to deposit: ");
                amount=scanner.nextDouble(); //get minimum amount from stdin
                if(amount<1000)
 		       { 
                   super.minimumDeposit(amount); //after being validated, now deposit allowed
 		       }
 		       else
 		       {
 		    	  
 	              while(amount<1000)
 	              {
 	            	 System.out.println("A minimum deposit of Rupees 1000 is required to set up your basic account ");
 	 	             System.out.println("Enter Rupees 1000 to deposit: ");
 	 	             amount=scanner.nextDouble(); //get minimum amount from stdin
 	 	             minimumDeposit();
 	              }
 		       }
                break;
            }
            
        }
        
       
    
     
    int withDrawAllowedPerDay(double reqWithDrawAmount) //checks if req withdrawl amount is valid to be retreived or not
    {
        double totalRequested=pWithDrawAmount+reqWithDrawAmount;
        if(totalRequested<=30000.0) return 1;
         
        else
        {
             
            System.out.println("You have exceeded your per day's withdrawl limit RS 30,000");
            System.out.println("So your withdrawl request is cancelled");
            return 0;
        
        }
            
    }
     
    @Override
    public int WithDrawAmount(double reqWithDrawAmount) throws ParseException
    {
        int status=0;
        if(computeTimeDiff()>24)
        {
             resetTimeAndAmount();
             status=super.WithDrawAmount(reqWithDrawAmount); 
        }
        else if(computeTimeDiff()<=24 && withDrawAllowedPerDay(reqWithDrawAmount)==1)   
        {
             
            status=super.WithDrawAmount(reqWithDrawAmount); 
             
        }
        return status;
    }
}
