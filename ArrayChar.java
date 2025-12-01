package javaPack;

import java.util.Scanner;
//ArrayChar class is subclass 
//ArrayChar is extending the functionality of the MainProgram
public class ArrayChar extends MainProgram
{
	Scanner allinput = new Scanner(System.in);
	
	public void ArrayChar()
	{
		AcceptInfo(); 
	}
	
	public void AcceptInfo()
	{
		float numletters = allinput.nextFloat();
		if(numletters % 1!= 0)
		{
			System.out.print("Incorrect values has been entered. \n");
			MainProgram.main(null);
		}
		else
		{
			allinput.nextLine();
			System.out.print("Enter a word: ");
			String wordent = allinput.nextLine();
			CheckWord(wordent);
		}
	}
	
	private void CheckWord(String entword)
	{
		int wordlen = entword.length();
		if (wordlen == 0)
		{
			MainPorgram.main(null);
		}
		else
		{
			char[] wordarray = new char[wordlen];
			for(int i=0; i<wordlen; i++)
			{
			}
		}
	}
}
