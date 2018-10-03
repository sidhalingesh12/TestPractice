package Automation.Testing_practice_hackerrank;

	import java.io.*;
import java.util.*;

	public class Solution {

	    public static void main(String[] args) {
	        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
	        Scanner scan = new Scanner(System.in);
	        int num=scan.nextInt();
	        for(int l=0;l<num;l++){
	        String strname = scan.next(); 
	        
	        char[] charArr=strname.toCharArray();
	        //char arr[] = null;
	       // List<String> addchar = null;
	        for(int i=0;i<=charArr.length-1;i++){
	            if(i%2==0){
	            	/*System.out.println(charArr[i]);
	            	addchar.add(Character.toString(charArr[i]));*/
	            	//charArr[i];
	            	//System.out.println(charArr[i]);
	            	char ch=charArr[i];
	            	String s=Character.toString(ch);
	            	System.out.print(s);
	            	
	            }
	            
	            }
	        System.out.print(" ");
	        
	        for(int j=0;j<=charArr.length-1;j++)
	            	{if(j%2!=0)
	            	{
	            	char chra=charArr[j];
	            	String s1=Character.toString(chra);
	            	System.out.print(s1);
	            }
	            
	        
	            	}
	        
	        
	        
	        }
	    }
	}

