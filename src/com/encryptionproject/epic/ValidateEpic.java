package com.encryptionproject.epic;

public class ValidateEpic
{
	public static boolean isValidMenuChoice(String menuChoice)
	{
		boolean validSelection = true;
		String[] validEntries = {"1", "2", "3","4"};
		
		for (int i = 0; i < validEntries.length; i++)
		{
			if (menuChoice.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;
			}
		}
		if (validSelection)
		{
			System.out.println("This is not a valid menu entry. Please enter 1, 2, 3, or 4.");
		}
		return validSelection;
	}//end isValidMenuChoice
	
	
	public static boolean isValidYesNo(String userAnswer)
	{
		boolean validSelection = true;
		String[] validEntries = {"yes", "no"};
		
		for (int i = 0; i < validEntries.length; i++)
		{
			if (userAnswer.equalsIgnoreCase(validEntries[i].toString()))
			{
				validSelection = false;
			}
		}
		if (validSelection)
		{
			System.out.println("This is not a valid entry. Please enter 'Yes' or 'No'.");
		}
		return validSelection;
	}//end isValidYesNo Case One
	
	
	
}
