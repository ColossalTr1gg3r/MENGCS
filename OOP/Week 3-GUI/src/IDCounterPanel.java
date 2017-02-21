import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class IDCounterPanel  extends JPanel
	{
	
		   private int count;
		   private JButton push1, push2;
		   private JLabel label;

		   //-----------------------------------------------------------------
		   //  Constructor: Sets up the GUI.
		   //-----------------------------------------------------------------
		   public IDCounterPanel()
		   {
		      count = 50;

		      push1 = new JButton("Increment");
		      push1.addActionListener(new ButtonListener());
		      
		      push2 = new JButton("Decrement");
		      push2.addActionListener(new ButtonListener());

		      label = new JLabel("Pushes: " + count);
		      
		      add(label);
		      add(push1);
		      add(push2);

		      setBackground(Color.red);
		      setPreferredSize(new Dimension(500, 40));
		   }


		//*****************************************************************
		   //  Represents a listener for button push (action) events.
		   //*****************************************************************
		   private class ButtonListener implements ActionListener
		   {
		      //--------------------------------------------------------------
		      //  Updates the counter and label when the button is pushed.
		      //--------------------------------------------------------------
			      public void actionPerformed(ActionEvent event)
			      {
			         if (event.getSource() == push1){
			        	 count++;
			            label.setText("Pushes: "+ count);
			            }
			         else
			         {
			        	 count--;
			        	 label.setText("Pushes: " + count);
			         }
			      }
		   }
}
