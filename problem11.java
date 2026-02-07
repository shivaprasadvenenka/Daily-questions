/*
Max Element with Queries
You are given an array of integers of size N. You are also given Q queries consisting of three integers i, j, and x. For each query,
increment each element of the array from index i to j by a value of x. At the end, print the largest element of the array.

Input Format
The first line of input contains T - the number of test cases. For each test case, the first line contains N - the size of the array.
The second line contains N integers - the elements of the array. The third line contains Q - the number of queries. The Q subsequent lines each contain 
  3 integers i, j - the indices denoting the subarray and x - the value to be added to the elements of the subarray.

Output Format
For each test case, after processing all the queries, print the max element of the entire array, separated by a new line.

Constraints
30 points
1 <= N <= 102
1 <= Q <= 102

70 points
1 <= T <= 100
1 <= N <= 105
1 <= Q <= 104

General Constraints
1 <= T <= 100
-105 <= A[i], x <= 105
0 <= i <= j < N
  */

//code
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int[] ar=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=sc.nextInt();
            }
            int q=sc.nextInt();
            int[] diff=new int[n];
            while(q-->0)
            {
                int i=sc.nextInt();
                int j=sc.nextInt();
                long x=sc.nextInt();
                diff[i]+=x;
                if(j+1<n) diff[j+1]-=x;
            }
            int cur=0;
            int max=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                cur+=diff[i];
                max=Math.max(max,cur+ar[i]);
            }
            System.out.println(max);
        }
    }
}


/*
Input
2
5
1 2 3 4 5
2
0 3 7
1 2 2
6
4 10 -1 2 8 -3
1
3 5 6

Output
12
14


  */
