import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

public class ReverseStringUsingArrayList {

	public static void main(String args[]) {
		String str = "i am nivedita";
		char[] input = str.toCharArray();
		List<Character> list = new ArrayList<>();
		
		
		for (char c: input) 
			list.add(c);
			
			Collections.reverse(list);
			ListIterator li = list.listIterator();
			while(li.hasNext())
				System.out.print(li.next());
		
	}
}
