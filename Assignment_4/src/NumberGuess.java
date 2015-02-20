import java.util.Scanner;
import java.util.Random;
public class NumberGuess {
	
	public static void main(String [] args){
		
		int user_input = 0;
		int random_number;
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		Random number_gen = new Random();
		
		
		System.out.print("Enter a number between 1 and 100: ");
		user_input = input.nextInt();
				
		random_number = number_gen.nextInt(100) +1;
		
		while (user_input != random_number){
		
		if (user_input > random_number){
			System.out.println("Guess lower");
		    user_input = input.nextInt();
		}
		else if (user_input < random_number){
			System.out.println("Guess higher");
		    user_input = input.nextInt();
	    }    
	    }
		
		System.out.println("You guessed it right!");
		
	}
}
