import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		NumberFormat money = NumberFormat.getCurrencyInstance();
	
		double vat;
		double price;
		double total;
		
		System.out.print("Enter your price here: ");
		price=scan.nextInt();
		
		   try{
		if (price<10)
			vat=price*10/100;
		else 
			vat=price*20/100;
		
		total=price+vat;
		
		System.out.print("Total amount due is:" +money.format(total));
		   }
		   
		   catch(InputMismatchException e)
		      {
		    	 System.out.println("\n\nInvalid input: Please enter Numbers only");
		      }
		      finally
		      {
		    	  scan.close();
		      }
	}

}
