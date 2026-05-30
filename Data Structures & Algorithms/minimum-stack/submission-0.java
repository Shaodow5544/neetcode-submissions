class MinStack {
    class Node{
        public int val;
        public int min=Integer.MAX_VALUE;
        public Node next;
        public Node(int val, Node next){
            this.val=val;
            this.next=next;
        }
        public Node(){
            this.next=null;
        }
    }
    Node head;
    public MinStack() {
        head= new Node();
    }
    
    public void push(int val) {
        // if(head.val==null)
        // {
        //     head.val=val;
        // }
        // else{
            Node x=new Node(val,head);
            if(head.min>val)
            {
                x.min=val;
            }
            else{
                x.min=head.min;
            }
            head=x;
        
        
    }
    
    public void pop() {
        head=head.next;
    }
    
    public int top() {
        return head.val;
    }
    
    public int getMin() {
        return head.min;
    }
}
