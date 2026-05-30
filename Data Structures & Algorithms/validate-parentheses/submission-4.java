class Solution {
    public boolean isValid(String s) {

        if(s.length()%2!=0) return false;
        char a=s.charAt(0);
        // if(a==')' || a=='}'|| a==']') return false;

        Stack<Character> stack=new Stack<>();
        int n=s.length();

        for(int i=0;i<n;i++)
        {
            
            char c=s.charAt(i);
            if(c=='('||c=='{'||c=='[')
            {
                stack.push(c);
            }
            else{
                if(stack.isEmpty())
                {
                    return false;
                }
                else{
                    char x=stack.peek();
                if((x=='(' && c==')' )||( x=='{' && c=='}') ||(x=='[' && c==']'))
                {
                    stack.pop();
                }
                else{
                    stack.push(c);
                }
                }
                
            }

        }
        if(!stack.isEmpty())
        {
            return false;
        }
        return true;
    }
}
