package Automation.Testing_practice_hackerrank;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class calculateprize {

    // Complete the solve function below.
    static void solve(double meal_cost, int tip_percent, int tax_percent) {
       double tip_pe=(tip_percent)*meal_cost;
        double tip_p=tip_pe/100;
        
        
       double tax_perc=meal_cost*tax_percent;
        double tax_per=tax_perc/100;
    double cost=meal_cost+tip_p+tax_per;
       // int totalcost= (int) cost;
        
       // System.out.println(tip_p);
        //System.out.println(tax_per);
        System.out.println(Math.round(cost));
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        double meal_cost = scanner.nextDouble();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tip_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int tax_percent = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        solve(meal_cost, tip_percent, tax_percent);

        scanner.close();
    }
}
