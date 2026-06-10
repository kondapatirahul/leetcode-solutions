class MinStack {
 private Stack<Integer> s;
 private Stack<Integer> minstack;

    public MinStack() {
        s=new Stack<>();
        minstack=new Stack<>();
    }
    
    public void push(int value) {
        s.push(value);
        if(minstack.isEmpty() || value<=minstack.peek()){
            minstack.push(value);
        }
    }
    
    public void pop() {
        if(s.peek().equals(minstack.peek()))
        {
        minstack.pop();
        }
            s.pop();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return minstack.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
