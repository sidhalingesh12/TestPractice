package Automation.Testing_practice_hackerrank;
public class sample {
	public static String dnaComplement(String s) {
	    // Write your code here
	        
	        	               
	        char[] charArr=s.toCharArray();
	        int count=charArr.length;
	        char swap1=charArr[0];
	        
	          charArr[0]=charArr[1];
	        
	        charArr[1]=swap1;
	        
	        char swap2=charArr[count];
	        
	        charArr[count]=charArr[count-1];
	        
	        charArr[count-1]=swap2;
	        
	              
	         String Result1=new String(charArr);
	        
	       return Result1;
	       
	
}
}