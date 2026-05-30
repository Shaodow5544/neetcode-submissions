class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> stack=new ArrayDeque<>();
        for(String n: tokens)
        {
            if(n.equals("+") || n.equals("-") || n.equals("*") || n.equals("/"))
            {
                int b=stack.pop();
                int a=stack.pop();
                if(n.equals("+")) stack.push(a+b);
                else if(n.equals("-")) stack.push(a-b);
                else if(n.equals("*")) stack.push(a*b);
                else stack.push(a/b);
            }
            else stack.push(Integer.parseInt(n));
        }
        return stack.pop();
    }
}
