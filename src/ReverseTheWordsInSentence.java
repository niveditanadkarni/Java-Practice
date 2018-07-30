
public class ReverseTheWordsInSentence {

	public static void main (String args[]) {
		
		String input = "my name is Nivedita";
		String output = reverseWords(input);
		System.out.println("input String:" + input);
		System.out.println("output String:" + output);
		
		
		
	}
	
	public static String reverseWords(String str)
	{
		String[] words = str.split(" ");
		String reversedSentence= "";
		
		for (int i = 0 ; i<words.length; i++)
		{
			String word = words[i];
			String reversedWord = "";
			
			for (int j = word.length()-1; j>=0; j--)
			{
				reversedWord += word.charAt(j); 
			}
			reversedSentence = reversedSentence + reversedWord + " ";
		}
		//System.out.println(str);
		//System.out.println(reversedSentence);
		return reversedSentence;
	}	
	
	
}
