//  A says Hi to B

/**
 * 
 * roblem Description
Given two names A and B as input. Print "A says Hi to B". where A and B are the names in input.

Problem Constraints
1 <= len(A), len(B) <= 15
Characters in A and B are in lowercase English Alphabets.

Input Format
There are two input lines
The first line has a string A.
The second line has a string B.

Output Format
Print in a single line A says Hi to B.

Example Input
Input:-

Ram
Shyam

Example Output
Output:-

Ram says Hi to Shyam

 * 
 */


import java.lang.*;
import java.util.*;

public class ASaysHiToB {
    public static void main(String[] args) {
       
        Scanner in = new Scanner(System.in);
        String A = in.nextLine();
        String B = in.nextLine();
 
        A = A.toLowerCase();
        B = B.toLowerCase();
 
        System.out.print(A +" says Hi to "+ B);
         
     }
}
