import java.util.Scanner;


public class Car {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String registration;
		String model;
		double price;
		String  make;
		
		Scanner scan = new Scanner(System.in);   	
		
		System.out.print("Enter Registration number: ");
		registration= scan.next();
		
		System.out.print("Enter Model: ");
		model= scan.next();
		
		System.out.print("Enter Price: ");
		price=scan.nextDouble();
		
		System.out.print("Enter Make: ");
		make= scan.next();
		
		System.out.println("Your Details Are:");
		System.out.println("Registration number:"+registration);
		System.out.println("Model of the car:"+model);
		System.out.println("Price of the car:"+price);
		System.out.println("Make of the car:"+make);
	}

}
