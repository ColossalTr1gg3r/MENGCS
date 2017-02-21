import java.util.Scanner;


public class Question2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      double height;
      double base;
      double Area;
      Scanner scan = new Scanner(System.in);
      
      System.out.print("Enter height Here: ");
      height=scan.nextDouble();
      
      System.out.print("Enter base here: ");
      base=scan.nextDouble();
      scan.close();
      
      Area=height*base / 2;
      System.out.print("The area of the triangle is: "+Area);
      
	}

}
