package Bank_Management_System;

public class Custom_Exception
{
	public static void testMinDep(double amount) throws invalidMinDepEx
    {
        if(amount<1000)
        {
            throw new invalidMinDepEx("Exception thrown due to deposit amount<1000");
        }
        else
        {
            System.out.println("Deposit of Rupees 1000 validated");
        }
    }
	public static void testName(String name) throws invalidNameEx
    {
        if (!name.matches("[a-zA-Z]+(\\s+[a-zA-Z]+)*"))
        {
            throw new invalidNameEx();
        }
        else
        {
            System.out.println("Field value validated");
        }

    }
	public static void testNumber(String name) throws invalidNumberEx
    {
        if (!name.matches("[0-9/]+"))
        {
            throw new invalidNumberEx();
        }
        else
        {
            System.out.println("Field value validated");
        }

    }
	public static void testAddress(String name) throws invalidAddressEx
    {
        if (!name.matches("[A-Za-z0-9'#\\.\\-\\s\\,/]+(\\s+[a-zA-Z]+)*"))
        {
            throw new invalidAddressEx();
        }
        else
        {
            System.out.println("Field value validated");
        }

    }
	 public static void testAge(int age) throws invalidAgeEx
	    {
	        if(!Integer.toString(age).matches("[0-9]+")) 
	        {
	            throw new invalidAgeEx();
	        }
	        else
	        {
	        	if(age<18 || age>90)
	        	{
	        		System.out.println("Age not valid....");
	        	}
	        	else
	        	{
	        		System.out.println("Age validated....");
	        	}
	        }
	    }
	 public static void testGender(String sex) throws invalidGenderEnteredEx
	    {
	        if ((!sex.equals("female")   || !sex.equals("Female") ) || (!sex.equals("male") ||!sex.equals("Male") ))
	        {
	            System.out.println("Error! Either enter male or female");
	            throw new invalidGenderEnteredEx();
	             
	        }
	        else
	        {
	            System.out.println("Gender Validated");
	        }
	         
	    }
	 public static void testAccountType(String type) throws invalidAccountTypeEx
	    {
	        if ((!type.equals("Saving")   || !type.equals("saving") ) || (!type.equals("Current") ||!type.equals("current") ))
	        {
	            System.out.println("Error! Either enter Saving or Current");
	            throw new invalidAccountTypeEx();
	             
	        }
	        else
	        {
	            System.out.println("Gender Validated");
	        }
	         
	    }
	
}
