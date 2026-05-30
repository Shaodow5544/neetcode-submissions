class Solution {
    public int[] productExceptSelf(int[] nums) {
        int nfzeros=0;
        int idx=-1;
        int val=1;
        int len=nums.length;
        for(int i=0;i<len;i++)
        {
            int n=nums[i];
            if(n==0)
            {
                nfzeros++;
                idx=i;
                if(nfzeros>1) return new int[nums.length];
                continue;
            } 
            val*=n;
        }
        if(nfzeros==1)
        {
            int[] sol=new int[nums.length];
            sol[idx]=val;
            return sol;
        }
        else{
            for(int i=0;i<len;i++)
            {
                nums[i]=val/nums[i];
            }
        }
        return nums;
    }
}  
