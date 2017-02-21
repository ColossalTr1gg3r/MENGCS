import java.util.Date;
import java.util.concurrent.TimeUnit;

//********************************************************************
//  LincolnDelay.java       Java Foundations
//
//  Demonstrates the basic structure of a Java application.
//********************************************************************

public class LincolnDelay
{
   //-----------------------------------------------------------------
   //  Prints a presidential quote.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws Exception
   {
		System.out.println("An Emergency Broadcast");
		System.out.println("***********************");
		//Print current time and date
	System.out.println(new   Date()); 
	System.out.println("***********************");
	   // Delaying Text by 100 Milliseconds 
	   printWithDelays (" A quote by Abraham Lincoln:",TimeUnit.MILLISECONDS, 100);
	    
	   printWithDelays (" \n Whatever you are, be a good one", TimeUnit.MILLISECONDS, 100);
	   
	   printWithDelays ("\n	         *\n	        ***\n	       *****\n	      *******\n	       *****\n	        ***\n	         *", TimeUnit.MILLISECONDS, 100);
   }
   public static void printWithDelays(String data, TimeUnit unit, long delay)
	        throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print(ch);
	        unit.sleep(delay);
	    }
}
}
