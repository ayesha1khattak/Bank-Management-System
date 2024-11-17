package Bank_Management_System;

public class invalidMinDepEx extends Exception{
	 
    public invalidMinDepEx(String msg) //exception thrown when for basic account , min deposit is less than 1000
    {
        super(msg);
    }
    public String toString()
    {
        return "Error! Exception due to min deposit deposited less than 1000!";
    }   
}
