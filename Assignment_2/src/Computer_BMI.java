import javax.swing.JOptionPane;
public class Computer_BMI {
	
	public static void main (String[] arg)
	{
		
		
	    double weight;
		double height;
		String input;
		
		input = JOptionPane.showInputDialog("Enter your weight in pounds");
		weight = Double.parseDouble(input);
		
	    input = JOptionPane.showInputDialog("Enter your height in inches");
		height = Double.parseDouble(input);
		
		double BMI = Math.pow(height,2.0)/weight;
		
		JOptionPane.showMessageDialog(null,"Your Body Mass Index is " + BMI);
	}
}