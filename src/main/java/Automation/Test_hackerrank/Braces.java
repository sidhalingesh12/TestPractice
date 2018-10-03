package Automation.Test_hackerrank;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class Braces {

	static String[] braces(String[] values) {
	Stack<String> stString=new Stack<String>();
	stString.push("/");
    
 
	for(int i=0;i<values.length;i++)
    {
        if(values[i]=="("||values[i]=="["||values[i]=="{")
        	stString.push(values[i]);
        else
        {
            while(!stString.empty()&&((values[i]==")"&&stString.pop()=="(")||(values[i]=="]"&&stString.pop()=="[")||(values[i]=="}"&&stString.pop()=="{")))
                  {
            	stString.pop();
                  }
        }
    }
                  if(stString.pop()=="/")
                  return values;
                  else
                  return values;
}



public static void main(String[] args) throws IOException  {
	final Scanner scanner = new Scanner(System.in);
	BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

    int valuesCount = scanner.nextInt();
    scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

    String[] values = new String[valuesCount];

    for (int i = 0; i < valuesCount; i++) {
        String valuesItem = scanner.nextLine();
        values[i] = valuesItem;
    }

    String[] res = braces(values);

    for (int i = 0; i < res.length; i++) {
        bufferedWriter.write(res[i]);

        if (i != res.length - 1) {
            bufferedWriter.write("\n");
        }
    }

    bufferedWriter.newLine();

    bufferedWriter.close();

    scanner.close();
}
}
