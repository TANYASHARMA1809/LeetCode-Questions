class MinStack {
    private Stack<Long> st;
    private Long mini;
    public MinStack() {
        st=new Stack<>();
        mini=Long.MAX_VALUE;
    }
    
    public void push(int value) {
        Long val = Long.valueOf(value);
        if(st.isEmpty()){
            mini=val;
            st.push(val);
        }else{
            if(val>mini){
                st.push(val);
            
            }else{
                st.push(2*val-mini);
                mini=val;
            }
            
        }
        
    }
    
    public void pop() {
        if(st.isEmpty()){
            return;
        }
        Long x=st.pop();
        
        if (x < mini) {
            mini = 2 * mini - x;  // Restore previous mini
        }
    }
    
    public int top() {
        if(st.isEmpty()){
            return -1;
        }
        Long x=st.peek();
        if(mini<x){
            return x.intValue();
        }
        return mini.intValue();
    }
    
    public int getMin() {
        return mini.intValue();
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