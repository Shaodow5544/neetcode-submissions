class Solution {
    public int largestRectangleArea(int[] heights) {
        int n=heights.length;
        int maxArea=0;
        Deque<Integer> dq=new ArrayDeque<>(); //To store the pse(previous smallest element) in stack
        for(int i=0;i<=n;i++)
        {
            //i == index of the next smallest element
            int currheight= (i==n)? 0:heights[i];
            //To run this loop to compute maxarea for all the pse of i
            while(!dq.isEmpty() && heights[dq.peek()] > currheight){
                int height=heights[dq.pop()];
                int pse= (dq.isEmpty())? -1 : dq.peek(); 
                // index of the pse(left) of the currnt computing element(which is of height not of i)
                int width=i-pse-1;
                maxArea=Math.max(maxArea, (height*width));
            }  
            dq.push(i);
        }
        return maxArea;
    }
}
