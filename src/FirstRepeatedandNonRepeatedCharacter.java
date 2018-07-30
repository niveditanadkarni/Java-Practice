import java.util.HashMap;
import java.util.Scanner;

public class FirstRepeatedandNonRepeatedCharacter 
{    
	static void firstRepeatedNonRepeatedChar(String inputString)
	{
		//Creating a HashMap containing char as a key and occurrences as a value
		HashMap<Character, Integer> charCountMap = new HashMap<Character, Integer>(); 
		//Converting inputString to char array
		char[] strArray = inputString.toCharArray();
		//Checking each char of strArray
		//char c;
		for (char c : strArray)
		{
			if(charCountMap.containsKey(c))
			{
				//If char is present in charCountMap, incrementing it's count by 1
				charCountMap.put(
						c, charCountMap.get(c)+1);
			}
			else
			{
				//If char is not present in charCountMap,
				//adding this char in charCountMap with 1 as it's value
				charCountMap.put(c, 1);
			}
			if (charCountMap.get(c) == 1)
			{
				System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
			}
		}
		//checking for first non-repeated character

	/*	for (char c : strArray)
		{
			if (charCountMap.get(c) == 1)
			{
				System.out.println("First Non-Repeated Character In '"+inputString+"' is '"+c+"'");
			}
			
		}*/

		//checking for first repeated character

		for (char c : strArray)
		{
			if (charCountMap.get(c) > 1)
			{
				//String repeatedCharacter;
				//repeatedCharacter= inputString
				System.out.println("Repeated Character In '"+inputString+"' is '"+c+"'");
			}
		}
	}

	public static void main(String[] args)
	{

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String input = sc.next();

		firstRepeatedNonRepeatedChar(input);
	}
}