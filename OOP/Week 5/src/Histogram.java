import java.util.Scanner;
public class Histogram
{
 public static void main (String[] args)
 {
  Scanner scan = new Scanner (System.in);

  int[] nums = new int[101];
  System.out.println("Enter numbers between 1 and 100[-1 to quit]: ");
  int num = scan.nextInt();

  int base10 = 0;

  while (num != -1)
  {
   nums[num]++;
   num = scan.nextInt();
  }

  for (int count = 1; count <=100;count+=10)
   { 

    System.out.print(count + " - " + (base10+=10) + "  | " );
    
    for (int index = count ; index<=base10 ; index++)
    {
      while(nums[index] > 0) {
        System.out.print("*");
        nums[index]--;
      }
    }
    System.out.println();
   }
 }
}
