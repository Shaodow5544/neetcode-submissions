class Solution {

    public List<List<String>> groupAnagrams(String[] strs) {

    
    HashMap<String,List<String>> map=new HashMap<>();
    for(String s:strs)
    {
        String key= reorder(s);
        map.computeIfAbsent(key,k->new ArrayList<>()).add(s);
    }
    return new ArrayList<>(map.values());
    }
    public String reorder(String s)
    {
        int[] count=new int[26];
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length();i++)
        {
            count[s.charAt(i)-'a']++;
        }
        for(int i=0;i<26;i++)
        {
            sb.append("$");
            sb.append(count[i]);
        }
        return sb.toString();
    }
}