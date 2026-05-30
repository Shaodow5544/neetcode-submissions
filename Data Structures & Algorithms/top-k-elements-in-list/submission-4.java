class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);
        }
        List<Integer>[] bucket=new ArrayList[nums.length+1];
        for(Map.Entry<Integer,Integer> e:map.entrySet())
        {
            int count=e.getValue();
            if(bucket[count]==null) bucket[count]=new ArrayList<>();
            bucket[count].add(e.getKey());
        } 
        int idx=0;
        int[] sol=new int[k];
        for(int i=bucket.length -1; i>=0 && idx<k;i-- )
        {
            if(bucket[i]!=null)
            {
                for(int n: bucket[i])
                {
                    sol[idx++]= n;
                    if(idx==k) break;
                }
            }
        }
        return sol;

    }
}
