class Solution {
    public String reverseByType(String s) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int as=(int)s.charAt(i);
            if(as>=97 && as<=122)
            {
                sb1.append(s.charAt(i));
            }
            else
            {
                sb2.append(s.charAt(i));
            }
        }
        sb1.reverse();
        sb2.reverse();
        StringBuilder sb=new StringBuilder();
        int b=0,c=0;
        for(int i=0;i<n;i++)
        {
            int as=(int)s.charAt(i);
            if(as>=97 && as<=122)
            {
                sb.append(sb1.charAt(b));
                b++;
            }
            else
            {
                sb.append(sb2.charAt(c));
                c++;
            }
        }
        return sb.toString();
    }
}
