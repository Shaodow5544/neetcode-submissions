class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0) return new int[]{};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);

        }
        List<Integer> sol= map.entrySet()
                                .stream()  
                                .sorted((a,b)->b.getValue()-a.getValue())  
                                .limit(k)  
                                .map(entry ->entry.getKey()) // same as .map(Map.Entry::getValue())
                                .toList();
        int[] ans= sol.stream()
                        .mapToInt(Integer::intValue)
                        .toArray();
        return ans;
        
    }
}
