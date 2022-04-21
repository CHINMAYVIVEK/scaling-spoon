//  Average of five Numbers

/**
 * Problem Description
Given 5 numbers A, B, C, D, E as input. Print the average of these 5 numbers (correct up to 2 decimal places).

Problem Constraints
1 <= A, B, C, D, E <= 104

Input Format
There are five lines in the input.
Each line has an integer.

Output Format
Print the average of the input numbers (correct up to 2 decimal places).

Example Input
Input:-

22
51
2
7
73

Example Output
Output:-

31.00

 */
import java.lang.*;
import java.util.*;
public class AverageOfFiveNumbers {
    public static void main(String[] args) {
               
        Scanner in = new Scanner(System.in);
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int D = in.nextInt();
        int E = in.nextInt();
        double sum = A+B+C+D+E;
       double ans;
       ans = sum/5;
       Formatter formatter = new Formatter();
        formatter.format("%.2f", ans);

        
        System.out.print(formatter.toString());

    }
}
