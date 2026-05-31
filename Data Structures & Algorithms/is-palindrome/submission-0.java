class Solution {
    public boolean isPalindrome(String s) {
        int n=s.length();
        s=s.replaceAll("[^a-zA-z0-9]","").toLowerCase();
        int ptr1=0;
        int ptr2=s.length() -1;
        while(ptr1<=ptr2)
        {

            if(s.charAt(ptr1)!=s.charAt(ptr2)) return false;
            ptr1++;
            ptr2--;
        }
        return true;
    }
}
