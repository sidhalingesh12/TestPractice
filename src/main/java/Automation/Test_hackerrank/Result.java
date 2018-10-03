package Automation.Test_hackerrank;

import java.util.HashMap;

public class Result {
	

	    /*
	     * Complete the 'maximumOccurringCharacter' function below.
	     *
	     * The function is expected to return a CHARACTER.
	     * The function accepts STRING text as parameter.
	     */

	    public static char maximumOccurringCharacter(String text) {
			return 0;
	    // Write your code here
			
			HashMap<Character, Integer> Maxcharacter = new HashMap<Character, Integer>();
		    char maxoccuredChar = ' ';
		   // char[] charArray = text.toCharArray();
		    int max = Integer.MIN_VALUE;
		    for(int i=0;i<text.length();i++){
		      Character charArray = text.charAt(i);
		        if(Maxcharacter.containsKey(charArray)){
		            Maxcharacter.put(charArray,Maxcharacter.get(charArray)+1);
		        }
		        else{
		        	Maxcharacter.put(charArray,1);
		        }
		        if(Maxcharacter.get(charArray)>max){
		        	maxoccuredChar = charArray;
		            max = Maxcharacter.get(charArray);
		        }
		    }
		    return maxoccuredChar;
		}

}
	    

	



