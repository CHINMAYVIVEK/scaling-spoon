// Which Month?

/**
 * 
 * Problem Description

Write a program to input an integer(A) from user and print the Ath month of the year.

Months list: {January, February, March, April, May, June, July, August, September, October, November, December}

Problem Constraints

1 <= A <= 12

Input Format

One line containing an integer integer A.

Output Format

One line containing the Ath month of the year.

Example Input

Input 1:

1

Input 2:

6

Example Output

Output 1:

January

Output 1:

June

Example Explanation

Explanation 1:

Clearly, January is the 1st month.

Explanation 2:

Clearly, June is the 6th month.
 * 
 */

import java.lang.*;
import java.util.*;

public class WhichMonth {
    public static void main(String[] args) {
        try(Scanner sc = new Scanner(System.in)){

            String list [] = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
            int A = sc.nextInt();

            System.out.println(list[A-1]);
        }        
    }
}
}
