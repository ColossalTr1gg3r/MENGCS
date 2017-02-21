import java.util.Scanner;


public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int age;
		
		System.out.print("Enter your Age here:");
		age=scan.nextInt();
		if (age >= 18)
		{
			System.out.println("Adult");
			}
		else{
			System.out.println("Young Person");
		}
			
		
		
		
	}

}
