import java.util.InputMismatchException;
import java.util.Scanner;


public class Question3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double height;
      double base;
      double Area;
      Scanner scan = new Scanner(System.in);
      
      try{
      System.out.print("Enter height Here: ");
      height=scan.nextDouble();
      
      System.out.print("Enter base here: ");
      base=scan.nextDouble();
      
      Area=height*base / 2;
      System.out.print("The area of the triangle is: "+Area);
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
