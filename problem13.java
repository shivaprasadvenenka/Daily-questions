/*
Path in a Graph
Given an undirected graph, you have to find if there exists a path between 2 given nodes of the graph.

Input Format
The first line of input contains T - number of test cases. First line of each test case contains N - number of nodes and M - number of edges. 
It is followed by M lines, each contains a pair (u,v) - denoting an undirected edge between node u and node v. The next line contains Q - number of queries. 
Its followed by Q lines, each contains a pair (S,D) - denoting an query to check if there exits a path between node S and node D.

Output Format
For each test case, first print the test case number as shown. For each query of a test case, print "Yes" if path exists between the nodes of the query,
print "No" otherwise, separated by new line.

Constraints
1 <= T <= 1000
1 <= N <= 100
0 <= M, Q <= min(N*N, 100)
1 <= u, v, S, D <= N
*/

//code
import java.io.*;
import java.util.*;

public class Main {
    static ArrayList<Integer>[] gr; 
    static boolean vis[];
    public static boolean Solve(int s,int d)
    {
        if(s==d) return true;
        vis[s]=true;
        for(int nb:gr[s])
        {
            if(!vis[nb])
            {
                if(Solve(nb,d)) return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        Scanner sc=new Scanner(System.in);
        int T=sc.nextInt();
        for(int t=1;t<=T;t++)
        {
            System.out.println("Test Case #"+t+":");
            int n=sc.nextInt();
            int m=sc.nextInt();
            gr=new ArrayList[n+1];
            for(int i=1;i<=n;i++)
            {
                gr[i]=new ArrayList<>();
            }
            for(int i=0;i<m;i++)
            {
                int u=sc.nextInt();
                int v=sc.nextInt();
                gr[u].add(v);
                gr[v].add(u);
            }
            int q=sc.nextInt();
            for(int i=0;i<q;i++)
            {
                vis=new boolean[n+1];
                int s=sc.nextInt();
                int d=sc.nextInt();
                if(Solve(s,d)) System.out.println("Yes");
                else System.out.println("No");
            }
        }
    }
}

/*

Input
2
5 3
1 3
2 4
3 2
4
1 5
3 4
4 5
1 4
10 9
3 4
5 1
2 5
4 6
2 3
6 3
1 4
8 9
8 10
5
2 4
8 4
9 10
10 5
9 7

Output
Test Case #1:
No
Yes
No
Yes
Test Case #2:
Yes
No
Yes
No
No
*/
