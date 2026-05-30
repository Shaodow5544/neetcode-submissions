class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        PriorityQueue<int[]> pq=new PriorityQueue<>((a,b)->a[1]-b[1]);
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        for(Map.Entry<Integer,Integer> e: map.entrySet())
        {
            pq.offer(new int[]{e.getKey(),e.getValue()});
            if(pq.size()>k)
            {
                pq.poll();
            }
        }
        int[] ans=new int[k];
        for(int i=0;i<k;i++)
        {
            ans[i]=pq.poll()[0];
        }
        return ans;
    }
}
