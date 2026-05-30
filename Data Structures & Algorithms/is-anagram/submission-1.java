class Solution {
    public boolean isAnagram(String s, String t) {
        if(s==null || t==null || s.length()!=t.length()) return false;
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        int n=s.length();
        for(int i=0;i<n;i++)
        {
            char c=s.charAt(i);
            map1.put(c,map1.getOrDefault(c,0)+1);
            c= t.charAt(i);
            map2.put(c,map2.getOrDefault(c,0)+1);
        }
        for(Character k: map1.keySet() )
        {
            if(!map1.get(k).equals(map2.get(k))) return false;
        }
        return true;
    }
}
