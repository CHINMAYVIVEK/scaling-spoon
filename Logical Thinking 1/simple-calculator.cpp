//  A Simple Calculator

/**
 * @brief 
 * 
 */

//Problem Description
// Given two numbers A and B. Print A+B, A*B, A-B, A/B in the same order.

// Problem Constraints
// 1 <= A, B <= 10^4

// Input Format
// There are two input lines
// The first line has a single integer A.
// The second line has a single integer B.

// Output Format
// Print in a single line separated by space A+B, A*B, A-B, A/B in the same order.

// Example Input
// Input 1:-

// 4
// 5

// Input 2:-

// 16
// 2

// Example Output
// Output 1:-

// 9 20 -1 0

// Output 2:-

// 18 32 14 8


#include<iostream>

using namespace std;

int main()  {
   
    int A =70 ;
    int B = 24;
    cin >>A >>B;
    cout <<A+B <<" "<<A*B <<" "<<A-B << " "<< A/B;
    
    return 0;
}