class StockSpanner {
    ArrayList<Integer> arr;
    public StockSpanner() {
        arr = new ArrayList<>();
    }
    
    public int next(int price) {
        arr.add(price);
        int cnt = 1;
        for(int i = arr.size() - 2;i>=0;i--){
            if(arr.get(i) <= price){
                cnt++;
            }
            else break;
        }
        return cnt;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */