
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicate {
	
	public String removeDuplicate(String s)
	{
		StringBuilder newString= new StringBuilder();
		Set<Character> set = new HashSet<Character>();
		System.out.println("Given String:"+ s);
		
		for(int i= 0; i<s.length(); i++)
		{
			char c = s.charAt(i);
			if(!set.contains(c)) {
				set.add(c);
				newString.append(c);
			}
		}
		
		return newString.toString();
	}
	
	public String removeDuplicateWords(String s, String wordSplitter) {
	 List<String> values = new ArrayList<String>();
	    String[] changeString = s.split(wordSplitter);
	    StringBuilder newString = new StringBuilder();
	    System.out.println("given string:"+ s);
	    for (int i = 0; i < changeString.length; ++i)
	    {
	        if (!values.contains(changeString[i]))
	        {
	            values.add(changeString[i]);
	            newString.append(" ");
	            newString.append(changeString[i]);
	        } 
	    }
	   return newString.toString();
	}

}
