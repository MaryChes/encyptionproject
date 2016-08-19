package com.encryptionproject.explorerandadventure;

public class Utils
{
	
	public static String decrypt(String encode, int shift) 
    {
        return encrypt(encode, 26-shift);
    }//decrypt
 
    public static String encrypt(String encode, int shift) 
    {
        shift = shift % 26 + 26;
        StringBuilder encrypted = new StringBuilder();
        
			for (char i : encode.toCharArray())
			{
				if (Character.isLetter(i))
				{
					if (Character.isUpperCase(i))
					{
						encrypted.append((char) ('A' + (i - 'A' + shift) % 26));
					} else
					{
						encrypted.append((char) ('a' + (i - 'a' + shift) % 26));
					}
				} else
				{
					encrypted.append(i);
				}
			}
			return encrypted.toString().toUpperCase();
    }//encrypt
    
    
}//class Utils
