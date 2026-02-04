/*
Count Subset Sums Equals K
Given an array of size N containing positive integers and a target sum K. Find the number of ways of selecting the elements from the array such that the sum of chosen elements is equal to the target K, since the number of ways can be very large, print answer modulo 1e9 + 7.

Input Format
The first line of input contains T - the number of test cases. It is followed by 2T lines. The first line of each test case contains the N - size of the array and the K - target sum. The second line contains N integers - elements of the array.

Output Format
Print the number of ways for each test case separated by a new line.

Constraints
30 points
1 <= N <= 20

70 points
1 <= N <= 100

General Constraints
1 <= T <= 100
1 <= K <= 103
1 <= A[i] <= 103
  */

//code
import java.io.*;
import java.util.*;

public class Main {
    public static int sss(int ar[],int n,int k)
    {
        int[][] dp =new int[n+1][k+1];
        int m=(int)1e9 + 7;
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=1;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<k+1;j++)
            {
                if(j>=ar[i-1])
                {
                    dp[i][j]=(dp[i-1][j]+dp[i-1][j-ar[i-1]])%m;
                    
                }
                else{
                    dp[i][j]=dp[i-1][j];
                }
            }
        }
        return dp[n][k];

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] ar=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            System.out.println(sss(ar,n,k));
        }
    }
}
/*
Input
2
4 5
1 4 4 5
3 4
2 2 1

Output
3
1
*/
