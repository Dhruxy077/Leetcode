class MinStack {
    class node{
        public int val;
        public int min;
        node next;

        public node(int val,int min, node next){
            this.val=val;
            this.min=min;
            this.next=next;
        }
    }
    node head;
    public MinStack() {
        head=null;
    }
    public void push(int val) {
        if(head==null){
            head=new node(val,val,null);
        }else{
            head=new node(val,Math.min(val,head.min),head);
        }
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

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */