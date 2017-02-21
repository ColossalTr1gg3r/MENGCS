import java.util.Scanner;


public class StudentID {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String id= "HI", NS ="NS";
		Scanner scan =new Scanner(System.in);
		
		while (!id.equals(NS))
		{
			System.out.print("Enter your student ID here:  ");
			id= scan.nextLine();
		}
		scan.close();
		System.out.print("Well Done");
	}

}
