class MyLinkedList {
    public static class Node{
        public Node next;
        public int val;
    }
    public Node head;
    public Node tail;
    public int size;

    public MyLinkedList() {
        
    }
    
    public int get(int k) {
        if(k<0 || k>=size){
            return -1;
        }
        Node temp=head;
        for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp.val;
    }
    
    public void addAtHead(int val) {
        Node nn=new Node();
        nn.val=val;
        if(size==0){
            head=nn;
            tail=nn;
            size++;
        }else{
            nn.next=head;
            head=nn;
            size++;

        }
        

    }
    
    public void addAtTail(int val) {
        if(size==0){
            addAtHead(val);
        }else{
            Node nn=new Node();
            nn.val=val;
            tail.next=nn;
            tail=nn;
            size++;
        }
        

        
    }
    
    public void addAtIndex(int k, int val) {
        if(k<0|| k>size){
            return;
        }
        if(k==0){
            addAtHead(val);
        }
        else if(size==k){
            addAtTail(val);
        }else{
            Node nn=new Node();
            nn.val=val;
            Node temp=getNode(k-1);
            nn.next=temp.next;
            temp.next=nn;
            size++;


        }
        

    }
    
    public void deleteAtIndex(int k) {
        if(k<0|| k>=size){
            return;
        }
        else if(size==1){
            head=null;
            tail=null;
            size--;
        }else if(k==0){
            head=head.next;
            size--;
        }
        else if(k==size-1){
            Node k_1th=getNode(k-1);
            k_1th.next=null;
            tail=k_1th;
            size--;

        }
        else{
            Node kth=getNode(k);
            Node k_1th=getNode(k-1);
            k_1th.next=kth.next;
            kth.next=null;
            size--;

        }
        
    }
    public Node getNode(int k){
        if(k<0 || k>=size){
            return null;
        }
        Node temp=head;
         for(int i=1;i<=k;i++){
            temp=temp.next;
        }
        return temp;
    }
    
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */