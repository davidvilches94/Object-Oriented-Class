//OK. O.Aktunc

import java.util.Scanner;
public class CompareNumbers {
	
	public static void main(String[] arg){
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		int large = 0;
		int small = 0;
		int number1;
		int sum;
		int product;
		int average;
		System.out.print("Enter the first Integer: ");
		number1= input.nextInt();
		
		int number2;
		System.out.print("Enter the second Integer: ");
		number2= input.nextInt();
		
		int number3;
		System.out.print("Enter the third Integer: ");
		number3= input.nextInt();
		
		System.out.println("For the numbers "+number1+" ,"+number2+" and "+number3);
		
		  if(number1 > number2)
		  {
		     large = number1;
		  }
	      if(number2 > number1)
	      {
	         large = number2;   
		  } 
	      if(number3 > large)
	      {
	    	 large = number3;
	      }	
	      
	      
		  if(number1 < number2)
		  {
			small = number1;
		  }
		  if(number2 < number1)
		  {
		    small = number2;
		  }
		  if(number3 < small)
		  {
			small = number3;
		  }
		
		sum = number1 + number2 + number3;
		product = number1*number2*number3;
		average = (number1 + number2 + number3)/3;
		
		System.out.println("Largest is: " +large);
		System.out.println("Smallest is: "+small);
		System.out.println("Sum is: " +sum);
		System.out.println("Product is: " +product);
		System.out.println("Average is: " +average);
	}

}

