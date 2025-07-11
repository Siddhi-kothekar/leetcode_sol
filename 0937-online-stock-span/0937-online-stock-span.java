class StockSpanner {
    ArrayList<Integer> arr;
    Stack<Integer> st;
    int idx ;
    public StockSpanner() {
        arr = new ArrayList<>();
        st = new Stack<>();
        idx = 0;
    }
    
    public int next(int price) {
        arr.add(price);
        while(!st.isEmpty() && arr.get(st.peek()) <= price){
            st.pop();
        }
        int span;
        if(st.isEmpty()){
            span = idx + 1;
        }
        else{
            span = idx - st.peek();
        }
        st.push(idx);
    idx++;
    return span;
    }
    
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */