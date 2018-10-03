package Automation.Testing_practice_hackerrank;
//public class DataMap {

	//Complete this code or write your own from scratch
	import java.util.*;
	import java.io.*;

	class DataMap{
	    public static void main(String []argh){
	    	HashMap<String,String> phoneBook=new HashMap<String,String>();
            Scanner in = new Scanner(System.in);
            int n = in.nextInt();
            for(int i = 0; i < n; i++){
                String name = in.next();
                int phone = in.nextInt();
                String phoneNum=Integer.toString(phone);
                // Write code here
                phoneBook.put(name, phoneNum);
                
            }
            while(in.hasNext()){
                String s = in.next();
                // Write code 
                //phoneBook.put(s, phoneNum);
                
                if(phoneBook.containsKey(s))
                {
                System.out.println(s+"="+phoneBook.get(s));
                }
                else {System.out.println("Not found");}
            } in.close();
            
        }
    }
//}
