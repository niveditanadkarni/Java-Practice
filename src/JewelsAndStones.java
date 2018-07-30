import java.util.ArrayList;
import java.util.Scanner;
 
class JewelsAndStones {
	public static void main(String args[]) {
		
		Scanner scanner = new Scanner(System.in);
		int t=scanner.nextInt();
		
		while(t-->0)
		{
			String j = scanner.next();
			
			String s = scanner.next();
			
			ArrayList<Character> a1= new ArrayList<>();
			for(int i=0;i<j.length();i++)
				a1.add(j.charAt(i));
			
			char arr[]=s.toCharArray();
			int count=0;
			for(int i=0;i<s.length();i++)
			{
				if(a1.contains(arr[i]))
					count++;
			}
			
			System.out.println(count);
		}
	}
}