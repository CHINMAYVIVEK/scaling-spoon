// Floor of A/B

/**
 * 
 * Problem Description
Given two numbers A and B. Print the floor of A/B.



Problem Constraints
1 <= A, B <= 104

Input Format
There are two input lines
The first line has a single integer A.
The second line has a single integer B.


Output Format
Print in a single line the floor of A/B.


Example Input
Input 1:-

4
5

Input 2:-

16
2

Example Output
Output 1:-

0

Output 2:-

8

Example Explanation
Explanation 1:-

floor(4/5) = 0

Explanation 2:-

floor(16/2) = 8

 * 
 */


import java.lang.*;
import java.util.*;

public class FloorOfAB {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
 
            int A = sc.nextInt();
            int B = sc.nextInt();
 
            System.out.println((int)Math.floor(A/B));
 
        }
         
     }
}
