/*
When you see:

-Next Greater Element
-Next Warmer Day
-Stock Span
-Daily Temperatures
-Largest Rectangle in Histogram

Think:

-Monotonic Stack

*/

class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        int[] sol=new int[n];
        Deque<Integer> dq=new ArrayDeque<>();
        for(int i=0;i<n;i++)
        {
            while(!dq.isEmpty() && temperatures[i]>temperatures[dq.peek()])
            {
                int idx= dq.pop();
                sol[idx]=i-idx;
            }
            dq.push(i);
        }
        return sol;
    }
}
