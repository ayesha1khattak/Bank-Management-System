package Bank_Management_System;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Customer_Account
{
		final static String BankName="KAAM Bank";
	 	private static int accId=0;
	    private double currentBalance;
	    private String timeStampCreation; //timestamp to store complete details at the time account was created
	    private String currency;
	    private double interestRate;
	    String pWithDrawTime; //empty string signifies no previous withDraws
	    double pWithDrawAmount; //initially no payment withDrawn
	    String currentTime;
	    private double tdepositAmount;
	    private double twithdrawAmount;
	    String withDrawlDate; //actual withDrawl date or depositDate
	    double withDrawlAmount;//actual withDrawl amount
	    double depositAmount; //actual deposit amount
	    

	public Customer_Account() 
	{
		currentBalance=0.0;
        withDrawlAmount=0.0;     
        depositAmount=0.0;
        withDrawlDate="";
        tdepositAmount=0.0;
	    twithdrawAmount=0.0;
        currency="";
        interestRate=10;
        pWithDrawAmount=0.0;//this donot refer to actual withDrawn amount rather it is a total of withDrawls for one particular day....initially no payment withDrawn
        pWithDrawTime="No Previous WithDrawls Yet";
        timeStampCreation=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa").format(Calendar.getInstance().getTime()); //get current Time//this donot refer to actual withDrawn time rather it is a last withDrawl time for one particular day
	}
	public void minimumDeposit(double amount)
    {
		if(amount>=1000)
		{
			depositAmount(amount);
		}
		else
		{
			System.out.println("Your deposited amount is less than 1000");
			System.out.println("Sorry ....Your Account Cannot be open....");
			
		}
        
    }
	public void printSuccessDeposit(double amount)
    {
        System.out.println("Your Deposited Request has been successfully fullfilled");
        System.out.println("Amount Deposited is: " + amount);
        System.out.println("New balance is " + currentBalance);
        currentTime=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa").format(Calendar.getInstance().getTime());
        System.out.println("Current Time is : " + currentTime);
    }
	public void printSuccessWithDraw(double amount)
    {
        System.out.println("Your withdrawl request has been successfully fullfilled");
        System.out.println("Amount Withdrawn is: " + amount);
        System.out.println("Reaming balance is " + currentBalance);
        currentTime=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa").format(Calendar.getInstance().getTime());
        System.out.println("Current Time is : " + currentTime);
    }
	
     
    public void printFailureWithDraw(double amount)
    {
        System.out.println("Your balance is insufficient for your withDrawl request");
        System.out.println("Your Balance Remaining: " + currentBalance);
        System.out.println("Your WithDrawlRequest: " + amount);
        System.out.println("So your withdrawl request is cancelled");
        currentTime=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa").format(Calendar.getInstance().getTime());
        System.out.println("Current Time is : " + currentTime);
    }
	 public void depositAmount(double amount)
	    {
		    tdepositAmount+=amount;
	        currentBalance+=amount;
	        depositAmount=amount;
	        printSuccessDeposit(amount);
	    }
	 public double inputwithDrawAmount()
	 {
		 double amount;
			@SuppressWarnings("resource")
			Scanner num=new Scanner(System.in);
			System.out.println("Enter the amount u want to withdraw");
			amount= num.nextDouble();
			return amount;
	 }
	 public double inputDepositAmount()
	 {
		 double amount;
			@SuppressWarnings("resource")
			Scanner num=new Scanner(System.in);
			System.out.println("Enter the amount u want to Deposit");
			amount= num.nextDouble();
			return amount;
	 }
	   public int WithDrawAmount(double amount) throws ParseException
	    { 
		   if(amount<=currentBalance)
		   {
			   if((pWithDrawAmount+amount)<30000)
		       { 
				   twithdrawAmount+=amount;
				   currentBalance=currentBalance-amount;
				   pWithDrawAmount+=amount;
				   pWithDrawTime=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa").format(Calendar.getInstance().getTime()); //get current Time
				   withDrawlDate=pWithDrawTime;
				   withDrawlAmount=amount;
				   printSuccessWithDraw(amount);
				   return 1;
		       }
		       else
		       {
		    	   System.out.println("Your requested amount is exceeding daily limit");
		           System.out.println("Your Withdrawn Amount of today is " + pWithDrawAmount);
		           System.out.println("Your WithDrawlRequest: " + amount+" is exceeding 30000");
		           System.out.println("So your withdrawl request is cancelled");
		           return 1;
		       }
		   }
		   
		   else 
	           {
	        	  while(amount>currentBalance)
	        	  {
	        		  printFailureWithDraw(amount);
	        		  amount=inputwithDrawAmount();
	        		  WithDrawAmount(amount);
	        	  }
	        	  return 1;
	           }
	   
	    }
	   public void TransferWithdraw(double amount) throws ParseException
	    { 
		   if(amount<=currentBalance)
		   {
				   twithdrawAmount+=amount;
				   currentBalance=currentBalance-amount;
		   }
		   
		   else 
	           {
	        	  while(amount>currentBalance)
	        	  {
	        		  System.out.println("Your requested amount is exceeding your current limit");
			          System.out.println("So amount cannot be transfered...." );
	        	  }
	           }
	   
	    }
	   public void TransferDeposit(double amount)
	    {
		    tdepositAmount+=amount;
	        currentBalance+=amount;
	    }
	   public long computeTimeDiff() throws ParseException//function that computes time difference between previous and and current withDraw time 
	    {
	        String currentTime=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa").format(Calendar.getInstance().getTime()); //get current Time
	        this.currentTime=currentTime;
	        if(pWithDrawTime.equals("No Previous WithDrawls Yet")) //if not withDrawn earlier 
	        {
	             
	            return 0;
	        }
	        DateFormat format=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa"); //setup date formatter for parsing
	         
	        //computing time difference bewteen previous withDraw time and current withDraw request
	        Date getPreviousTime=format.parse(pWithDrawTime);
	        Date getCurrentTime=format.parse(currentTime);
	        long timeDiff=getCurrentTime.getTime()-getPreviousTime.getTime();
	        timeDiff/=1000*60*60; 
	        return timeDiff;
	    }
	   void resetTimeAndAmount() //reset previous withdraw time and amount after 24 hours 
	    {
	        pWithDrawAmount=0.0;   
	        pWithDrawTime=currentTime;
	    }
	   public void setWithDrawTime(String withDraw) //use at the time of file to object mapping
	    {
	        pWithDrawTime=withDraw;
	    }
	    public void setWithDrawAmount(double amount) //use at the time of file to object mapping
	    {
	        pWithDrawAmount=amount;
	    }
	    public void setAccountId(int id) throws ParseException
	    {  
	        accId=id;   
	    }
	    void setCurrentBalance(double bal)
	    {
	        currentBalance=bal;
	    }
	    public void setCurrency(String currency)
	    {
	        this.currency=currency;
	    }
	    public void setInterestRate(double rate)
	    {
	        interestRate=rate;
	    }
	    public void setTimeStamp(String timeStamp)
	    {
	        timeStampCreation=timeStamp;
	    }
	    String validateCurrency()
	    {
	        Scanner scanner=new Scanner(System.in);
	        int response;
	        do
	        {
	            System.out.println("Press 1 for Dollar Currency, or 2 for Ruppee Currency: ");
	            response=scanner.nextInt();
	            if(response!=1 && response!=2) System.out.println("You have entered an invlaid response! Enter again");
	             
	        }while(response!=1 && response!=2);
	        System.out.println("Response validated");
	        String currency="";
	        if(response==1) currency="Dollar";
	        else if(response==2) currency="Ruppee";
	        return currency;
	    }
	    void setTimeAndDay() //set time and day 
	    {
	        timeStampCreation=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss aa").format(Calendar.getInstance().getTime()); //get current Time
	     
	    }
	    public double getBalance()
	    {
	        return currentBalance;
	    }
	     
	    public int getAccId()
	    {
	        return accId;
	    }
	    public double getTdepositAmount()
	    {
	        return tdepositAmount;
	    }
	    public double getTwithdrawAmount()
	    {
	        return twithdrawAmount;
	    }
	    public double getCurrentBalance()
	    {
	        return currentBalance;
	    }
	    public String getCurrency()
	    {
	        return currency;
	    }
	    public double getInterestRate()
	    {
	        return interestRate;
	    }
	    public String getTimeStampCreated()
	    {
	        return timeStampCreation;
	    }
	    public String getWithDrawTime()
	    {
	        return pWithDrawTime;
	    }
	     
	    public double getWithDrawAmount()
	    {
	        return pWithDrawAmount;
	    }
	    public void setaccId(int accId)
	    {
	        this.accId=accId;
	    }
		public void minimumDeposit() {
			// TODO Auto-generated method stub
			
		}
	    

}
