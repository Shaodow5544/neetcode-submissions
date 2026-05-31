class Solution {
    public int trap(int[] height) {
        int n=height.length;
        int leftmax=0;
        int rightmax=0;
        int volume=0;
        int l=0;
        int r=n-1;
        while(l<r)
        {
            if(height[l]<height[r])
            {
                if(height[l]>leftmax)
                {
                    leftmax=height[l];
                }
                else{
                    volume+=leftmax-height[l];
                }
                
                l++;
                
            }
            else 
            {
                if(height[r]>rightmax)
                {
                    rightmax=height[r];
                }
                else{
                    volume+=rightmax-height[r];
                }
                
                r--;
            }
        }
        return volume;
    }
}
