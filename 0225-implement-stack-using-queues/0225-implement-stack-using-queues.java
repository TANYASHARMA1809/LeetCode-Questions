class MyStack {
    private Queue<Integer> q;

    public MyStack() {
        q=new LinkedList<>();
    }
    
    public void push(int x) {
        q.offer(x);
    }
    
    public int pop() {
        Queue<Integer> temp =new LinkedList<>();
        while(q.size()!=1){
            temp.offer(q.poll());
        }
        int x=q.poll();
        while(temp.size()!=0){
            q.offer(temp.poll());
        }
        return x;
    }
    
    public int top() {
        Queue<Integer> temp =new LinkedList<>();
        while(q.size()!=1){
            temp.offer(q.poll());
        }
        int x=q.poll();
        while(temp.size()!=0){
            q.offer(temp.poll());
        }
        q.offer(x);
        return x;
    }
    
    public boolean empty() {
        return q.isEmpty();
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