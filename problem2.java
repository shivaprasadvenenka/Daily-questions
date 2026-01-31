/*Problem Name: Find the Element in a Large Array
You are given a sorted array of integers of size up to 1,000,000. Your task is to determine whether a
given integer k exists in the array. Use an efficient searching algorithm, such as Exponential Search 
followed by Binary Search, to avoid timeouts.*/

//code
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    public static boolean exp(int[] ar,int n,int k)
    {
        if(ar[0]==k) return true;
        int i=1;
        while(i<n && ar[i]<=k)
        {
            i=i*2;
        }
        return bs(i/2,Math.min(i,n-1),ar,k);
    }
    public static boolean bs(int l,int h,int[] ar,int k)
    {
        while(l<=h)
        {
            int mid=l+(h-l)/2;
            if(ar[mid]==k)
            {
                return true;
            }
            else if(ar[mid]<k)
            {
                l=mid+1;
            }
            else{
                h=mid-1;
            }
        }
        return false;
    }
	public static void main (String[] args) throws IOException
	{
		Scanner sc=new Scanner(System.in);
		if (!sc.hasNextInt())
            return;
	    int n=sc.nextInt();
	    if (!sc.hasNextInt())
            return;
	    int k=sc.nextInt();
	    int[] ar=new int[n];
	    for(int i=0;i<n;i++)
	    {
	        if (!sc.hasNextInt())
            return;
	        ar[i]=sc.nextInt();
	    }
	    if(exp(ar,n,k))
	    {
	        System.out.println("true");
	    }
	    else
	    {
	        System.out.println("false");
	    }
	}
}


/*## Input
7 56
1 5 6 7 56 77 177

## output
true */
