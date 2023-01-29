package lets_grow_more;

import java.util.*;
public class Task1
{

	public static void main(String[] args) 
	{
		
        System.out.println("1 INR ");
        System.out.println("2 USD ");
        System.out.println("3 YUAN ");
       
     
        Scanner sc = new Scanner(System.in);
        System. out.println("Choose A currency");
        int choice = sc.nextInt();
        System.out.println("Enter Amount:");
        double amount = sc.nextDouble();
	        switch (choice)
	        {
	        	
	        	
		            case 1:
		                INR_exchange(amount);
		                break;
		            case 2:
		                USD_exchange(amount);
		                break;
		            case 3:
		                YUAN_exchange(amount);
		                break;
		           
		            default:
		                System.out.println("Invalid choice");
	        	
	        }
      

    }

	public static void INR_exchange(double amt)
	{
	    System.out.println("1 INR = " + 0.013 + " USD");
	    System.out.println();
	
	    System.out.println(amt+" INR = " + (amt*0.013) + " USD");
	    System.out.println();
	
	    System.out.println("1 INR = " + 0.012 + " YUAN");
	    System.out.println();
	    System.out.println(amt+" INR = " + (amt*0.012) + " YUAN");
	    System.out.println();
	
	}
    

	public static void USD_exchange(double amt)
	{
	    System.out.println("1 USD = " + 79.37 + " INR");
	    System.out.println();
	    System.out.println(amt+" USD = " + (amt*79.37) + " INR");
	    System.out.println();
	
	    System.out.println("1 USD= " + 0.98 + " YUAN");
	    System.out.println();
	
	    System.out.println(amt+" USD = " + (amt*0.98) + " YUAN");
	}

    

	public static void YUAN_exchange(double amt)
	{
	    System.out.println("1 YUAN = " + 12.02 + " INR");
	    System.out.println();
	    System.out.println(amt+" YUAN = " + (amt*12.02) + " INR");
	    System.out.println();
	
	    System.out.println("1 YUAN = " + 015 + " USD");
	    System.out.println();
	
	    System.out.println(amt+" YUAN = " + (amt*0.15) + " USD");
	}


				

}


