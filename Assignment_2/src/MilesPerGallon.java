import java.util.Scanner;
public class MilesPerGallon{ 
	
	public static void main (String[] arg)
	{
	
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		
		double miles;
		System.out.print("Enter the number of miles driven: ");
		miles = input.nextDouble();
		
		double gallons;
		System.out.print("Enter the number gallons of gas used: ");
		gallons = input.nextDouble();
		
		double MPG = miles/gallons;
		System.out.println("The miles-per-gallon is " + MPG);
		
		
		
    }

}

