import java.util.Scanner;
import java.io.*;
class Dcoder{
	

//public class Assignment {

	public static void main(String[] args) throws FileNotFoundException /* Throws Error if file cannot be found */ {
		System.out.println("Please enter Home team, Away team and scores including : between each in your Text file");
		//Reading from Text File
		Scanner keyboard = new Scanner(System.in);
	      System.out.println("Please Enter File Name including .txt:"); // Asks the user for file name
		String filename = keyboard.nextLine();
		File file = new File (filename);
		keyboard.close();
		//File file = new File ("football.txt");
		
	    /* Initialising the array as well as other integers that are going to be
	    used */
		String[] home_team = new String[100];
		String[] away_team = new String[100];
		int[] home_score = new int [100];
		int[] away_score = new int [100];
		
		String input = "i"; // Initialising input string
		String[] Element = new String[4]; // Element Split
		int ResultNo = 0;
		int i = 0;
		// Initialisiing the other elements
		Element[1] = "i";
		Element[2] = "i";
		Element[3] = "i";
		
		int hometotal =0, awaytotal = 0, counter = 0, highesthome= home_score[0], highestaway= away_score[0], invalidentries = 0; 
		Scanner scan = new Scanner(file);
		
		  /* The while loop will always trigger, in this case it asks for the
             users input or until stop has been typed.*/
           while (!input.equalsIgnoreCase("Stop")){
		      input = scan.nextLine();
		// A try loop that will catch if the home/away score in not a valid
	      // integer
		try{
		    if(input.isEmpty())
		         { //Checks if input is empty
			     System.out.print("Error, Please enter results in the text file");
			     invalidentries++;// Counts The invalid entries
		         }
		      else if (!input.isEmpty())
		         {
		           Element = input.split(":");
		      if (Element.length == 4)
		         {
		      if(Element[0].isEmpty())
		         { //Check if element 0 is empty if its send message to console 
			     System.out.println("Error Home team is missing");
			     invalidentries++;
			   }
		      else if(Element[1].isEmpty()) 
		         {//Check if element 1 is empty if its send message to console
		         
		         
		         
			     System.out.println("Error Away team is missing");
			     invalidentries++;	
		         }
		      else if(Element[2].isEmpty()) 
		         { //Check if element 2 is empty if its send message to console
			     System.out.println("Error Home Team Score is missing");
			     invalidentries++;
			   }
		      else if(Element[3].isEmpty())
		         { //Check if element 3 is empty if its send message to console
			     System.out.println("Error Away Team score is missing");
			     invalidentries++;	
		         }
		       // Allocates the split numbers into an array aswell as converts home and away scores into Integer
		      else if (Element.length == 4)
		         {
			     home_team[ResultNo]=Element[0];
			     away_team[ResultNo]=Element[1];			
			     home_score[ResultNo]= Integer.valueOf(Element[2]);		
			     away_score[ResultNo]=	Integer.valueOf(Element[3]);
			     ResultNo ++;
			   }
		    }
		}
		// This Checks to see if Semi Colon has been typed instead of colon
		if(input.contains(";"))
		      {
			System.out.println("The field delimiter may be missing or wrong field delimiter is used.");
			invalidentries++;
			}
		}//End of Try Loop
		catch (NumberFormatException exception) 
		      {// Sends Error that this is no a number value
                  System.out.println("A Home / Away team score may not be a valid integer number");
                  invalidentries++;
                  }
		}
		//Displays the information in this Format home_team[Home_score]Away_team[Away_score]
	      while (i < ResultNo)
	           {
		      System.out.println(home_team[i] + "[" + home_score[i] + "]" +"|" + away_team[i] + "[" + away_score[i] + "]");
                 i++;
	           }
	      while(counter < ResultNo)
	           {
		       // This adds up every home and away team score inputed.
	 	     hometotal= hometotal + home_score[counter];
		      awaytotal= awaytotal + away_score[counter];
		  if(home_score[counter] > highesthome) 
		     {
			highesthome =home_score[counter];
		     }
		  if(away_score[counter] > highestaway)
		     {
			highestaway =away_score[counter];
		     }
		      counter++;
	           }
	           scan.close();
	           //Prints all the information in a list
	           System.out.print("Total\n***************************" +
	                            "\nTotal Games Played " + ResultNo +
					     "\nTotal Goals Scored Home: " + hometotal +
					     "\nTotal Goals Scored Away: " + awaytotal +
					     "\nHighest Home Goals: " + highesthome+
					     "\nHighest Away Goals: " + awaytotal+
					     "\nTotal Invalid Entries:" + invalidentries);
		}
	}
    