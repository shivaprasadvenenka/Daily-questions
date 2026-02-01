/*You are given an integer n.

An integer is called Monobit if all bits in its binary representation are the same.

Return the count of Monobit integers in the range [0, n] (inclusive).

Note: Please do not copy the description during the contest to maintain the integrity of your submissions.*/

 //code
class Solution {
    public int countMonobit(int n) {
        int cnt=0;
        int i=1;
        while(i<=n)
        {
            i=(i*2)+1;
            cnt++;
        }
        return cnt+1;
    }
}
/*
Input: n = 1
Output: 2

Input: n = 4
Output: 3
*/
