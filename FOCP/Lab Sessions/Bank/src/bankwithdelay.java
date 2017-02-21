import java.util.concurrent.TimeUnit;


public class bankwithdelay {

	public static void main(String[] args) throws Exception 
	{
	String name;
	long accountnumber;
	float Balance;
	long sortcode;
	
	name = "Simon Thow";
	accountnumber = 1978493;
	sortcode=103010;
	Balance = 247.00f;
	
	printWithDelays("Name: " +name, TimeUnit.MILLISECONDS, 100);
	printWithDelays("\nAccount Number: " +accountnumber, TimeUnit.MILLISECONDS, 100);
	printWithDelays("\nSortcode: " +sortcode, TimeUnit.MILLISECONDS, 100);
	printWithDelays("\nBalance: " +"£" +Balance, TimeUnit.MILLISECONDS, 100);
	}

	   public static void printWithDelays(String data, TimeUnit unit, long delay)
		        throws InterruptedException {
		    for (char ch:data.toCharArray()) {
		        System.out.print(ch);
		        unit.sleep(delay);
		    }
	   }
}
