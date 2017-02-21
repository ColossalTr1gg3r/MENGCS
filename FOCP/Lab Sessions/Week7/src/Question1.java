import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class Question1 {

	public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			NumberFormat money = NumberFormat.getCurrencyInstance();
		
			double vat=0;
			double price;
			double total;
			
			System.out.print("Enter your price here: ");
			price=scan.nextInt();
			
			 try{
			if (price<=9.99)
				{
				vat=price*10/100;
				}
			else if(price>=10 && price<=20) // Between 10-20
				{
				vat=price*20/100;
				}
			else
		    	vat=price*30/100;
			
			total=price+vat;
			   
			System.out.print("Total amount due is:" +money.format(total));
			
	}		
}  

