package com.encryptionproject.epic;
 import java.util.Scanner;

import com.encryptionproject.explorerandadventure.Utils;
public class Epic
{
	static boolean retry = true;
    public static void main(String[] args) 
    {
    	Scanner codeScanner = new Scanner(System.in);
    	Scanner shiftNumber = new Scanner(System.in);
    	
    	String userInput = null;
    	String theMessageToBeCoded = null;
    	String menuChoice = null;
    	String userAnswer = null;
    	
    	int userShift = 0;
    	int randomShift = 0;
    	
    	do
    	{
    		System.out.println("Welcome to the Ceaser Cipher." + "\nTo select an option, please use the menu below.:");
    		do
    		{
    			System.out.println("\n\t1. Encrypt a message with a shift of 4."
    				+ "\n\t2. Encypt a message with the shift of your choice."
    				+ "\n\t3. Encrypt a message with a random shift"
    				+ "\n\t4. Exit application");
    			menuChoice = codeScanner.nextLine();
    		}
    		while (ValidateEpic.isValidMenuChoice(menuChoice));
    		
    		switch(menuChoice)
    		{
    		case "1":
    			System.out.println("Please enter the message you wish to encrypt.");
    			userInput = codeScanner.nextLine();
    			theMessageToBeCoded = userInput;
    			UtilsEpic.encrypt(theMessageToBeCoded, 4);
    			System.out.println(UtilsEpic.encrypt(theMessageToBeCoded, 4) + "\n");
    			System.out.println("Would you like to decrypt this message?");
    			System.out.println("\n\tYes"
    				+ "\n\tNo");
    			userAnswer = codeScanner.nextLine();
    			
    			switch(userAnswer)
    			{
    				case "Yes":
    					System.out.println(Utils.decrypt(Utils.encrypt(theMessageToBeCoded, 4), 4) + "\n");
    				break;
    			
    				case "No":
    					System.out.println();
    				break;
    			}	
    		break;
    		
    		
    		case "2":
    			System.out.println("Enter the shift number for the Ceaser Cipher.");
    			userShift = shiftNumber.nextInt();
    			System.out.println("Please enter the message you wish to encrypt.");
    			userInput = codeScanner.nextLine();
    			theMessageToBeCoded = userInput;
    			UtilsEpic.encrypt(theMessageToBeCoded, userShift);
    			System.out.println(UtilsEpic.encrypt(theMessageToBeCoded, userShift) + "\n");
    			System.out.println("Would you like to decrypt this message?");
    			System.out.println("\n\tYes"
    				+ "\n\tNo");
    			userAnswer = codeScanner.nextLine();
    			
    			switch(userAnswer)
    			{
    				case "Yes":
    					System.out.println(Utils.decrypt(Utils.encrypt(theMessageToBeCoded, userShift), userShift) + "\n");
    				break;
    			
    				case "No":
    					System.out.println();
    					break;
    			}
    		break;
    		
    		
    		case "3":
    			randomShift = (int)(Math.random() * 26) + 1; //cast int so no decimals
    			System.out.println("Please enter the message you wish to encrypt with a random shift.");
    			userInput = codeScanner.nextLine();
    			theMessageToBeCoded = userInput;
    			UtilsEpic.encrypt(theMessageToBeCoded, randomShift);
    			System.out.println(UtilsEpic.encrypt(theMessageToBeCoded, randomShift) + "\nYour random shift for this message is: " + randomShift + "\n");
    			System.out.println("Would you like to decrypt this message?");
    			System.out.println("\n\tYes"
    			+ "\n\tNo");
    			userAnswer = codeScanner.nextLine();
    			switch(userAnswer)
    			{
    				case "Yes":
    					System.out.println(Utils.decrypt(Utils.encrypt(theMessageToBeCoded, randomShift), randomShift) + "\n");
    				break;
    			
    				case "No":
    					System.out.println();
    					break;
    			}
    		break;
    		
    		
    		case "4":
    			System.out.println("Thank you for using the Ceaser Cipher. Goodbye :)");
    			System.exit(0);
    		break;
    		}//switch	
    	}//do
    	while (retry == true);
    	codeScanner.close();
    }//main      
}//class

