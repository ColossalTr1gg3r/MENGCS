import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
		final double OUNCES_PER_POUND =16.0;
		
		double pricePerPound;
		double weightOunces;
		double weight;
		double totalPrice;
		
		Scanner scan =new Scanner (System.in);
		
		NumberFormat money = NumberFormat.getCurrencyInstance();
		DecimalFormat fmt = new DecimalFormat("0.##");
		
		System.out.println("***** CS Deli *****\n");
		
		System.out.print("Enter your price per pound here:£");
		pricePerPound = scan.nextDouble();
		 
		System.out.print("Enter the weight (ouncess): ");
		weightOunces = scan.nextDouble();
		
	    weight = weightOunces / OUNCES_PER_POUND;
	    totalPrice = pricePerPound * weight;
	    System.out.println("***** CS Deli *****\n");
	    
	    System.out.println ("Unit Price: " + money.format(pricePerPound)+ " per pound");
	    System.out.println ("Weight: " + fmt.format(weight) + " pounds");	    
	    System.out.print ("Total: " + money.format(totalPrice));

		
		
		
		
		 
	}

}
