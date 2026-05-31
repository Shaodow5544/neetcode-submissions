class Solution {
    public boolean isPalindrome(String s) {
        
            int l = 0;
            int r = s.length() - 1;
            String sl = s.toLowerCase();


            while (l < r) {

                if (!Character.isLetterOrDigit(sl.charAt(l))) {
                        l++;
                        continue;
                } 
                if (!Character.isLetterOrDigit(sl.charAt(r))) {
                    r--;
                    continue;
                }
                if (sl.charAt(l) != sl.charAt(r)) {
                    return false;
                }
                l++;
                r--;

            }
        return true;

    }
}
