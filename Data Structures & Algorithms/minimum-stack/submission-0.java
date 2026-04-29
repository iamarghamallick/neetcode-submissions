class MinStack {

    Stack<Integer> st1, st2;

    public MinStack() {
        st1 = new Stack<>();
        st2 = new Stack<>();
    }
    
    public void push(int val) {
        st1.push(val);
        if(!st2.isEmpty()) {
            int top = st2.peek();
            st2.push(Math.min(top, val));
        } else {
            st2.push(val);
        }
    }
    
    public void pop() {
        if(!st1.isEmpty()) {
            st1.pop();
            st2.pop();
        }
    }
    
    public int top() {
        if(!st1.isEmpty()) {
            return st1.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!st2.isEmpty()) {
            return st2.peek();
        }
        return -1;
    }
}
