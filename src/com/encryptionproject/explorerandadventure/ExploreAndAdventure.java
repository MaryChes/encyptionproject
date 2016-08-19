package com.encryptionproject.explorerandadventure;
 import java.util.Scanner;
public class ExploreAndAdventure
{
	static boolean retry = true;
    public static void main(String[] args) 
    {
    	Scanner codeScanner = new Scanner(System.in);
    	
    	String userInput = null;
    	String theMessageToBeCoded = null;
    	
    	do
		{
			System.out.println("Welcome to the Ceaser Cipher." + "\nPlease enter the message you wish to encrypt below.");
			userInput = codeScanner.nextLine();
			theMessageToBeCoded = userInput;
			
			if (theMessageToBeCoded.matches("[a-z A-Z]+$"))
			{
				System.out.println(Utils.encrypt(theMessageToBeCoded, 4));
				System.out.println(Utils.decrypt(Utils.encrypt(theMessageToBeCoded, 4), 4) + "\n");
			}
			else
			{
				System.out.println("You have entered an invalid character. Please type letters.");
				System.out.println();
			}
		}
        while (retry == true); 
    	codeScanner.close();
    }//main      
}//class

