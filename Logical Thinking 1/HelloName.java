//Hello Name

/**
 * 
 * Problem Description
Given a name A as input. Print "Hello A", where A is the name in input.

Problem Constraints
1 <= len(A) <= 15
Characters in A are in lowercase English Alphabets.

Input Format
There is a single input line, which is the string A.

Output Format
Print in a single line "Hello A" without quotes.

Example Input
Input 1:-

Ram

Input 2:-

Shyam

Example Output
Output 1:-

Hello Ram

Output 2:-

Hello Shyam

 * 
 */

import java.lang.*;
import java.util.*;
public class HelloName {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String A = in.nextLine();
        A = A.toLowerCase();
        System.out.print("Hello " + A);
        
    }
}
