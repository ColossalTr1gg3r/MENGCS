import java.util.Scanner;
public class Question1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price=0;
		double vat=0;
		double total;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Enter price:£");
		price= scan.nextDouble();
		
		System.out.print("Enter VAT:£");
		vat= scan.nextDouble();
	
		total = price+vat;
		System.out.println("Total Cost:£"+total);
		
		
		
		
	
		
	}

}
