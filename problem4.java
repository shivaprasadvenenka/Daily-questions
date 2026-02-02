/* Bubble Sort 
Bubble Sort and print the total number of swaps involved to sort the array.

Input Format
The first line of input contains T - the number of test cases. It's followed by 2T lines. The first line of each test case contains N - the size of the array. The next line contains N integers - the elements of the array.

Output Format
For each test case, print the total number of swaps, separated by a new line.

Constraints
1 <= T <= 100
1 <= N <= 100
-1000 <= ar[i] <= 1000 */

//code
import java.io.*;
import java.util.*;

public class Main {
    public static int Solve(int[] ar,int n)
    {
        int cnt=0;
        for(int i=0;i<n-1;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(ar[j+1]<ar[j])
                {
                    int temp=ar[j+1];
                    ar[j+1]=ar[j];
                    ar[j]=temp;
                    cnt++;
                }
            }
        }
        return cnt;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-->0)
        {
            int n=Integer.parseInt(br.readLine());
            int[] ar=new int[n];
            String[] nums=br.readLine().trim().split(" ");
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
4
8
176 -272 -272 -45 269 -327 -945 176
2
-274 161
7
274 204 -161 481 -606 -767 -351
2
154 -109

Output
15
0
16
1
*/
