//********************************************************************
//  FahrenheitPanel.java       Java Foundations
//
//  Demonstrates the use of text fields.
//********************************************************************

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;


public class FahrenheitPanelEdited extends JPanel
{
   private JLabel inputLabel, outputLabel, resultLabel;
   private JTextField fahrenheit;
   private JButton push;

   //-----------------------------------------------------------------
   //  Constructor: Sets up the main GUI components.
   //-----------------------------------------------------------------
   public FahrenheitPanelEdited()
   {
      inputLabel = new JLabel("Enter Fahrenheit temperature:");
      outputLabel = new JLabel("Temperature in Celsius: ");
      resultLabel = new JLabel("---");

      fahrenheit = new JTextField(5);
      fahrenheit.addActionListener(new TempListener());
      
      push = new JButton("Calculate");
      push.addActionListener(new ButtonListener());

      add(inputLabel);
      add(fahrenheit);
      add(outputLabel);
      add(resultLabel);
      add(push);

      setPreferredSize(new Dimension(300, 75));
      setBackground(Color.MAGENTA);
   }

   //*****************************************************************
   //  Represents an action listener for the temperature input field.
   //*****************************************************************
   private class TempListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Performs the conversion when the enter key is pressed in
      //  the text field.
      //--------------------------------------------------------------
      public void actionPerformed(ActionEvent event)
      {
         int fahrenheitTemp, celsiusTemp;

         String text = fahrenheit.getText();

         fahrenheitTemp = Integer.parseInt(text);
         celsiusTemp = (fahrenheitTemp-32) * 5/9;

         resultLabel.setText(Integer.toString(celsiusTemp));
      }
   }
   private class ButtonListener implements ActionListener
   {
      //--------------------------------------------------------------
      //  Updates the counter and label when the button is pushed.
      //--------------------------------------------------------------
	      public void actionPerformed(ActionEvent event){
	      int fahrenheitTemp, celsiusTemp;

	         String text = fahrenheit.getText();

	         fahrenheitTemp = Integer.parseInt(text);
	         celsiusTemp = (fahrenheitTemp-32) * 5/9;

	         resultLabel.setText(Integer.toString(celsiusTemp));
	      }
   }
}
