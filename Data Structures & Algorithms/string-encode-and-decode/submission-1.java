class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb=new StringBuilder();
        for(String str: strs)
        {
            sb.append(str.length()) 
                .append("#")
                .append(str);
        }
        System.out.println(sb);
        return sb.toString();
    }

    public List<String> decode(String str) {
        List<String> sol=new ArrayList<>();
        int n=str.length();
        for(int i=0;i<n;i++)
        {   
            int j=i;
            while(str.charAt(j)!='#')
            {
                j++;
            }
            int len= Integer.parseInt(str.substring(i,j));
            i=j+len;
            sol.add(str.substring(j+1,j+1+len));
        }
        return sol;
    }
}
