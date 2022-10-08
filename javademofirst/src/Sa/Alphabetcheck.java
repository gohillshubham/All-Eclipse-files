package Sa;

import java.util.Scanner;
//import java.io.*;
import java.util.ArrayList;

public class Alphabetcheck {    
	private static ArrayList<Character>missingChars(String str)
	{
	    final int MAX_CHARS = 26;
	     
	    boolean[] present = new boolean[MAX_CHARS];
	    ArrayList<Character> charsList = new ArrayList<>();
	     
	    for(int i = 0; i < str.length(); i++)
	    {
	        if ('A' <= str.charAt(i) &&
	                   str.charAt(i) <= 'Z')
	            present[str.charAt(i) - 'A'] = true;
	        else if ('a' <= str.charAt(i) &&
	                        str.charAt(i) <= 'z')
	            present[str.charAt(i) - 'a'] = true;
	        else
	        	continue;
	    }
	     
	    for(int i = 0; i < MAX_CHARS; i++)
	    {
	        if (present[i] == false)
	            charsList.add((char)(i + 'a'));
	    }
	    return charsList;
	}
	 
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	    String str = sc.nextLine();
	    sc.close();
	    ArrayList<Character> missing = Alphabetcheck.missingChars(
	        str);
	         
	    if (missing.size() >= 1)
	    {
	        for(Character character : missing)
	        {
	            System.out.print(character);
	        }
	    }
	}
}
