class MyStack {
    private Queue<Integer> qu1 ;
    private Queue<Integer> qu2 ;
    public MyStack() {
        qu1=new LinkedList<>();
        qu2= new LinkedList<>();
    }
    
    public void push(int x) {
        qu2.add(x);
        while(!qu1.isEmpty()){
            qu2.add(qu1.remove());
        }
        Queue<Integer> temp = qu1;
        qu1 = qu2;
        qu2 = temp;
    }
    
    public int pop() {
        int val = qu1.peek();
        qu1.remove();
        return val;
    }
    
    public int top() {
        return qu1.peek();
    }
    
    public boolean empty() {
        if(qu1.isEmpty()){
            return true;
        }
        return false;
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */