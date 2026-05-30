class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null || s.length()!=t.length()) return false;
        int[] string1=new int[26];
        int[] string2=new int[26];
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            int x= (int)(s.charAt(i) - 'a');
            string1[x]++;
            x=(int)(t.charAt(i)-'a');
            string2[x]++;
        }
        for(int i=0;i<26;i++)
        {
            if(string1[i]!=string2[i]) return false;
        }
        return true;
    }
}
