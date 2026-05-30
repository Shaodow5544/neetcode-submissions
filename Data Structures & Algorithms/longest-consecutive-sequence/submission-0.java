class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set= new HashSet<>();
        for(int n:nums)
        {
            set.add(n);
        }
        int max=0;
        for(int n: set)
        {
            if(!set.contains(n-1))
            {
                int curr=n;
                int length=1;
                while(set.contains(n+1))
                {
                    n++;
                    length++;

                }
                max=Math.max(max,length);
            }
           
        }
        return max;
    }
}
