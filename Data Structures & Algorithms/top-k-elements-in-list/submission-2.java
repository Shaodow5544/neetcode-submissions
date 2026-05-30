class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        if(nums.length==0) return new int[]{};
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int n:nums)
        {
            map.put(n,map.getOrDefault(n,0)+1);

        }
        int[] arr= map.entrySet()
                                .stream()  
                                .sorted((a,b)->b.getValue()-a.getValue())  
                                .limit(k)  
                                .mapToInt(entry ->entry.getKey()) // same as .map(Map.Entry::getValue())
                                .toArray();
        // int[] ans= sol.stream()
        //                 .mapToInt(Integer::intValue)
        //                 .toArray();int[] ans= sol.stream()
        //                 .mapToInt(Integer::intValue)
        //                 .toArray();
        // return map.entrySet()
        //           .stream()
        //           .sorted((a, b) -> b.getValue() - a.getValue())
        //           .limit(k)
        //           .mapToInt(Map.Entry::getKey)
        //           .toArray();
        return arr;
        
    }
}
