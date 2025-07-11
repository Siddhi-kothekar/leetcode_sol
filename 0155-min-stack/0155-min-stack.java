class MinStack {
    Stack<Long> st;
    long mini;

    public MinStack() {
        st = new Stack<>();
        mini = 0;
    }

    public void push(int val) {
        if (st.isEmpty()) {
            mini = val;
            st.push(0L); // difference = val - mini = 0
        } else {
            long diff = (long) val - mini;
            st.push(diff);
            if (diff < 0) {
                mini = val; // new min
            }
        }
    }

    public void pop() {
        if (st.isEmpty()) return;

        long diff = st.pop();
        if (diff < 0) {
            mini = mini - diff; // revert to previous min
        }
    }

    public int top() {
        long diff = st.peek();
        if (diff >= 0) {
            return (int)(mini + diff);
        } else {
            return (int) mini;
        }
    }

    public int getMin() {
        return (int) mini;
    }
}
