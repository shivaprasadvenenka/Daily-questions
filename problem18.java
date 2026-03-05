/*
Reverse the words in a strsing 
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.


Example 1:
Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
  
Example 2:
Input: s = "Mr Ding"
Output: "rM gniD"
*/

//code
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb=new StringBuilder();
        StringBuilder sb1=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            if(s.charAt(i)==' ' || i==n-1)
            {
                if(i==n-1) sb1.append(s.charAt(i));
                sb1.reverse();
                sb.append(sb1);
                sb1.setLength(0);
                if(i!=n-1) sb.append(' ');
            }
            else
            {
                sb1.append(s.charAt(i));
            }
        }
        String ans=sb.toString();
        return ans;
    }
}
