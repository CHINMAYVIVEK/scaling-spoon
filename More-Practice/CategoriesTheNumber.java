// Categories the number

/**
 * 
 * Problem Description

Write a program to input a number(A) from user and print 1 if it is positive, -1 if it is negative, 0 if it's neither positive nor negative.



Problem Constraints

1 <= A <= 1000000



Input Format

One line containing an integer A.



Output Format

One line each 0/1/-1 as per the question.



Example Input

Input 1:

50

Input 2:

-101

Input 3:

0



Example Output

Output 1:

1

Output 2:

-1

Output 3:

0

Example Explanation

Explanation 1:

Clearly, 50 is positive.

Explanation 2:

Clearly, -101 is negative.

Explanation 3:

Clearly, 0 is neither positive nor negative.
 * 
 */

import java.lang.*;
import java.util.*;


public class CategoriesTheNumber {
    public static void main(String[] args) {
        
        try (Scanner sc = new Scanner(System.in)) {
            int A = sc.nextInt();

            if(A <= 1000000){

                if(A==0){
                    System.out.println("0");
                }
                else if(A > 0){
                    System.out.println("1");
                }
                else if(A < 0){
                    System.out.println("-1");
                }

            }
        }
        
    }
}
