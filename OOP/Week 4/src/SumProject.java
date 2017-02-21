import javax.swing.JOptionPane;


public class SumProject {
	   public static void main(String[] args)
	   {
	      String numStr, result;
	      int num, num2, sum, again;

	      do 
	      {
	         numStr = JOptionPane.showInputDialog("Enter first Number: ");
	         num = Integer.parseInt(numStr);
	         
	         numStr = JOptionPane.showInputDialog("Enter Second Number: ");
	         num2 = Integer.parseInt(numStr);
	         
	         sum= num + num2;

	         result = "The Sum of  " + num + " + " + num2 + " = " +sum ;

	         JOptionPane.showMessageDialog(null, result);

	         again = JOptionPane.showConfirmDialog(null, "Do Another?");
	      }
	      while (again == JOptionPane.YES_OPTION);
	   }
	}

