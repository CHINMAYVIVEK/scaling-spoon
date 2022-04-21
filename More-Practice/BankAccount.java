// Bank Account

/**
 * 
 * 
 * Problem Description

You are given a Bank account having N amount and you are asked to perfrom ADD(credit) and SUBTRACT(debit) operations.

After each operation print the amount left in the Bank account. If the debit amount is greater than current balance print "Insufficient Funds"(without quotes) and the operation is skipped.



Problem Constraints

1 <= N, X <= 1011

1 <= Number of operations <= 105



Input Format

First line contains a single integer N denoting the balance in bank account.

Second line contains a single integer M denoting the number of operations.

Each of next M lines contains two space separated integers Type and Amount(X).

If Type == 1, Perform ADD operation.
If Type == 2, Perform SUBTRACT operation.



Output Format

Print Amount in the bank balance after each operation on a new line.


Example Input

1000
3
1 500
2 1400
2 500



Example Output

1500
100
Insufficient Funds



Example Explanation

Initially bank balance is 1000. 
First operation, ADD 500, bank balance becomes 1500, print it.
Second operation, SUBTRACT 1400, bank balance becomes 100, print it.
Third operation, SUBTRACT 500, print "Insufficient Finds".

 * 
 */

import java.lang.*;
import java.util.*;

public class BankAccount {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
              
             long N = sc.nextInt();
             int M = sc.nextInt();
 
             long[][] value = new long [M][2];
            
             // int[][] value = { {1,500}, {2, 1400},{2, 500} };
 
             if ((N >=1) && (M >=1 && M<= 100000)){
 
                 for(int i = 0; i< M; i++ ){
                     value[i][0] = sc.nextLong() ;
                     value[i][1] = sc.nextLong() ;
                 }
 
         
                 for(int i = 0; i< M; i++ ){
 
                     if ( value[i][0] == 1){
                         N = N + value[i][1];
                         System.out.println(N);
                     }
                     if ( value[i][0] == 2){
                         if( value[i][1] > N){
                             System.out.println("Insufficient Funds");
                         }else{
                             N = N - value[i][1];
                             System.out.println(N);
                         }
                     
                     }
                     
 
                 }
             }
          
        }
        catch(IndexOutOfBoundsException ioob){
             ioob.printStackTrace();
         }
         
     }

}
