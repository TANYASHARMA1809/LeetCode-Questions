class MyQueue {
    private Stack<Integer> st;
    public MyQueue() {
        st=new Stack<>();
    }
    
    public void push(int x) {
        st.push(x);
    }
    
    public int pop() {
        Stack<Integer> temp=new Stack<>();
        while(st.size()!=1){
            temp.push(st.pop());
        }
        int x=st.pop();
        while(temp.size()!=0){
            st.push(temp.pop());
        }
        return x;
    }
    
    public int peek() {
        Stack<Integer> temp=new Stack<>();
        while(st.size()!=1){
            temp.push(st.pop());
        }
        int x=st.peek();
        while(temp.size()!=0){
            st.push(temp.pop());
        }
        return x;
    }
    
    public boolean empty() {
        return st.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */