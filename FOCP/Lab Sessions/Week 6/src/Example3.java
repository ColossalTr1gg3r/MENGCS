import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;


public class Example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random randomGen= new Random();
		int guess;
		Scanner scan =new Scanner(System.in);
		int random= randomGen.nextInt(10-1);
		try{
		System.out.println("Please guess the random generated number:");
			guess=scan.nextInt();
		 if (guess== random)
			 System.out.println("You Guessed Right");
		 else
			 System.out.println("You guessed wrong\nYour number was: " +guess);
			 System.out.println("The Random Number was:" +random);
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
