package Automation.Testing_practice_hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;
public class Distribute 
{
	// Complete the equal function below.
    static int equal(int[] arr) {
    	int j,k;
    	int m= arr.length;
    	int[] l = new int[m];
    	for( j=0;j<=m-1;j++) {
    		
    for (k=j+1;k<=;k++) {
    	
    	if(arr[k]>arr[j]) {
    		
    		l[k]=arr[j]+1;
    		
    	}else l[k]=arr[k]+1;
    	
    	
    }
    		 			
    	}
    	return l.length ;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[] arr = new int[n];

            String[] arrItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int arrItem = Integer.parseInt(arrItems[i]);
                arr[i] = arrItem;
            }

            int result = equal(arr);

           // bufferedWriter.write(String.valueOf(result));
           // bufferedWriter.newLine();
        }

      //  bufferedWriter.close();

        scanner.close();
    }

}
