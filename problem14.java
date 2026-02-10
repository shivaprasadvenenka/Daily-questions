/*
LONGEST COMMON PREFIX
Write a function to find the longest common prefix string amongst an array of strings.

If there is no common prefix, return an empty string "".
Constraints:

1 <= strs.length <= 200
0 <= strs[i].length <= 200
strs[i] consists of only lowercase English letters if it is non-empty.
*/

//code
class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        if(strs==null || n==0) return "";
        String ps=strs[0];
        for(int i=1;i<n;i++)
        {
            while(!strs[i].startsWith(ps))
            {
                ps=ps.substring(0,ps.length()-1);
            }
            if(ps.length()==0)
            {
                return "";
            }
        }
        return ps;
    }
}


/*
Input: strs = ["flower","flow","flight"]
Output: "fl"


Input: strs = ["dog","racecar","car"]
Output: ""
Explanation: There is no common prefix among the input strings.

*/
