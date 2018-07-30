
public class StringToArray {


		// TODO Auto-generated method stub

		
/*
		      String str = new String("ab cd de");
		      System.out.println("Return Value :" );      
		      
		      for (String newStr: str.split(" ")) {
		    	  
		         System.out.println(newStr);
		      }
		  
	}*/
	
	/*
	 * //newString.append("%20"); newString.replace(i,i,"%20");
	 */

	
	public String replaceSpaceInString(String s) {

		String newString = "";
		System.out.println("string given:" + s);
		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == ' ')

				newString = newString + "%20";
			else
			newString = newString + s.charAt(i);
		}
		return newString;
	}
	
	

}

		/*String s = "ab cd ef";
		String[] arr = explode(s);
				
	

	public  String[] explode(String s) {
		String[] arr = new String [s.length()];
		for (int i=0; i < s.length(); i++)
		{
			arr[i] = String.valueOf(s.charAt(i));
			
		}
		return arr;
	}*/


