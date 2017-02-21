import java.util.concurrent.TimeUnit;

//********************************************************************
//  Lincoln.java       Java Foundations
//
//  Demonstrates the basic structure of a Java application.
//********************************************************************

public class Lincoln
{
   //-----------------------------------------------------------------
   //  Prints a presidential quote.
   //-----------------------------------------------------------------
   public static void main (String[] args) throws Exception
   {
	   printWithDelays ("A quote by Abraham Lincoln:",TimeUnit.MILLISECONDS, 100);

	   printWithDelays (" Whatever you are, be a good one", TimeUnit.MILLISECONDS, 100);
   }
   public static void printWithDelays(String data, TimeUnit unit, long delay)
	        throws InterruptedException {
	    for (char ch:data.toCharArray()) {
	        System.out.print(ch);
	        unit.sleep(delay);
	    }
}
}
