/*
Frequency Sort
You are given an array of integers. Sort them by frequency. See examples for more clarifications.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines, the first line contains N - the size of the array. 
The second line contains the elements of the array.

Output Format
For each test case, print the elements of the array sorted by frequency. In case 2 elements have the same frequency, print the smaller element first.

Constraints
1 <= T <= 100
1 <= N <= 10000
-1000 <= A[i] <= 1000
*/

import java.io.*;
import java.util.*;

public class Main {
    public static int[]  sss(int ar[],int n)
    {
        int[] fr=new int[2001];
        for(int i=0;i<n;i++)
        {
            fr[ar[i]+1000]++;
        }
        List<Integer> li=new ArrayList<>();
        for(int i=0;i<2001;i++)
        {
            if(fr[i]>0)
            {
                li.add(i-1000);
            }
        }
        Collections.sort(li,(a,b)->{
            if(fr[a+1000]!=fr[b+1000]) return fr[a+1000]-fr[b+1000];
            return a-b;
        });
        int i=0;
        for(int x:li)
        {
            int cnt=fr[x+1000];
            while(cnt>0)
            {
                ar[i]=x;
                i++;
                cnt--;
            }
        }
        return ar;
    }

    public static void main(String[] args) {
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
            sss(ar,n);
            for(int i=0;i<n;i++)
            {
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }
}


/*
Input
2
6
4 -2 10 12 -8 4
8
176 -272 -272 -45 269 -327 -945 176
  */

Output
-8 -2 10 12 4 4
-945 -327 -45 269 -272 -272 176 176

