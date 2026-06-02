public class Solution {
    public int findDuplicate(int[] nums) {

        int s = nums.length;
        int res = 0;

        for(int i = 0; i < 32; i++) {

            int mask = 1 << i;

            int x = 0;
            int y = 0;

            for(int n : nums) {
                if((n & mask) != 0)
                    x++;
            }

            for(int j = 1; j < s; j++) {
                if((j & mask) != 0)
                    y++;
            }

            if(x > y)
                res |= mask;
        }

        return res;
    }
}