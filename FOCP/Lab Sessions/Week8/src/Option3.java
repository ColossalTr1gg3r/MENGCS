import java.util.Scanner;


public class Option3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int op= 0, OP ="3";
		Scanner scan =new Scanner(System.in);
		
		while (!op.equals(3))
		{
			System.out.print("Enter the option  here:  ");
			op= scan.nextLine();
		}
		scan.close();
		System.out.print("Well Done");
	}

}