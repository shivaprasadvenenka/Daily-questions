/*
Maximum Contiguous Subsequence
Given an array, find the length of the longest subsequence whose elements can be re-arranged in a strictly increasing contiguous order. 
The difference between 2 adjacent elements in the subsequence, after re-arrangement, should be exactly 1.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains N -
size of the array. The next line contains N integers - the elements of the array.

Output Format
For each test case, print the length of the longest subsequence, separated by a new line.

Constraints
1 <= T <= 1000
1 <= N <= 10000
-100000 <= ar[i] <= 100000

*/

//code
import java.io.*;
import java.util.*;

public class Main {
    public static long Solve(int[] ar,int n)
    {
        if(n==0)
        {
            return 0;
        }
        HashSet<Integer> hs=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            hs.add(ar[i]);
        }
        long max=Integer.MIN_VALUE;
        for(int i=0;i<n;i++)
        {
            if(!hs.contains(ar[i]-1))
            {
                long sum=0;
                int e=ar[i]+1;
                while(hs.contains(e))
                {
                    sum++;
                    e++;
                }
                max=Math.max(sum,max);
            }
        }
        return (long)max+1;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            String[] nums=br.readLine().trim().split(" ");
            int[] ar=new int[n];
            for(int i=0;i<n;i++)
            {
                ar[i]=Integer.parseInt(nums[i]);
            }
            System.out.println(Solve(ar,n));
        }
    }
}

/*

Input
3
8
21 -22 -22 5 -31 -24 5 -23
10
18 -33 31 33 30 -14 32 30 16 17
6
6 3 8 5 2 5

Output
3
4
2

*/
