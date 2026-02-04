/*
Subset Sum
Given a set of non-negative integers, and a value S, determine if there is a subset of the given set with sum equal to S.

Input Format
The first line of the input contains T - the number of test cases. It is followed by 2T lines - the first line of each test case contains N - number of elements in given array and S - the required sum. The second line contains elements of the array.

Output Format
For each test case, print "YES" if there is a subset of the given set with sum equal to given S, otherwise "NO", separated by new line .

Constraints
30 points
1 <= N <= 10
0 <= S <= 100
*/

import java.io.*;
import java.util.*;

public class Main {
    public static boolean sss(int ar[],int n,int k)
    {
        boolean[][] dp =new boolean[n+1][k+1];
        for(int i=0;i<n+1;i++)
        {
            dp[i][0]=true;
        }
        for(int i=1;i<n+1;i++)
        {
            for(int j=1;j<k+1;j++)
            {
                if(j>=ar[i-1])
                {
                    dp[i][j]=(dp[i-1][j] || dp[i-1][j-ar[i-1]]);
                    
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
            if(sss(ar,n,k))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}

/*
Input
2
5 15
10 4 5 9 1
5 17
13 11 19 20 21

Output
YES
NO
*/
