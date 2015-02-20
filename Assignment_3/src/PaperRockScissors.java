import java.util.Scanner;
import java.util.Random;
public class PaperRockScissors {

	public static void main(String[] args){
		
     int rock = 0;
     int paper = 1;
     int scissors = 2;
     int cpu_gen;
     int cpu_player = 0; 
     int player;
     
     
     Random generator = new Random();
     
     cpu_gen = generator.nextInt(3)+1;
     
     if (cpu_gen == 0)
    	 cpu_player = rock;
     else if (cpu_gen == 1)
    	 cpu_player = paper;
     else if (cpu_gen == 2)
    	 cpu_player = scissors;
     
     @SuppressWarnings("resource")
 	 Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your move 0 for Rock, 1 for Paper, 2 for Scissors: ");
		player = input.nextInt();
		
		if (player == cpu_gen) 
		       System.out.println("It's a tie!"); 
		
		    else if (player == rock) 
		       if (cpu_player == scissors) 
		          System.out.println("Rock beats scissors. You win!!");
		
		    else if (cpu_player == paper) 
		            System.out.println("Paper beats rock. You lose!!");
		
		    else if (player == paper) 
		       if (cpu_player == scissors) 
		       System.out.println("Scissor beats paper. You lose!!");
		
		    else if (cpu_player == rock) 
		            System.out.println("Paper beats rock. You win!!");
		
		    else if (player == scissors) 
		         if (cpu_player == paper) 
		         System.out.println("Scissor beats paper. You win!!"); 
		
		    else if (cpu_player == rock) 
		            System.out.println("Rock beats scissors. You lose!!");
		
  }

}
