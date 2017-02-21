import java.util.Scanner;


public class Splitter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Enter a line fo text containing spaces : ");
		
		String line = scanner.nextLine();
		
		String [] elements = line.split(" ");
		
		
		System.out.println("The line contained " + elements.length + " elements.");
		
		for ( int i = 0; i < elements.length; i++ ) {
			
			System.out.println("Element " + (i+1) + " was : " + elements[i]);
			
		}
	}

}