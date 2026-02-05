/*
Pair with Difference K
You are given an integer array and an integer K. You have to tell if there exists a pair of integers in the given array such that ar[i]-ar[j]=K and i≠j.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N and K - the size of the array and the number K. The second line contains the elements of the array.

Output Format
For each test case, print "true" if the arrays contains such elements, "false" otherwise, separated by new line.

Constraints
40 points
2 <= N <= 1000

60 points
2 <= N <= 100000

General Constraints
1 <= T <= 100
-105 <= ar[i], K <= 105
  */

//code

import java.io.*;
import java.util.*;

public class Main {
    public static boolean sss(int ar[],int n,int k)
    {
        HashSet<Integer> hp=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hp.add(ar[i]);
        }
        for(int i=0;i<n;i++)
        {
            int sum=k+ar[i];
            hp.remove(ar[i]);
            if(hp.contains(sum))
            {
                return true;
            }
            hp.add(ar[i]);
        }
        return false;
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
5 60
1 20 40 100 80
10 11
12 45 52 65 21 645 234 14 575 112

Output
true
false


  */
