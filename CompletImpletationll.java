public class CompletImpletationll {
    public static class Node{
        int val;
        Node next;
      public Node(int val){
        this.val=val;
        this.next=null;

        }
    }
    public static class Linkedlist{
        Node head;
        Node tail;
        int size;
        public Linkedlist(){
            head=tail=null;
            size=0;
        }
        public void insertAtEnd(int val){
            Node temp = new Node(val);
            if(size==0) head=tail=temp;
            else{
                tail.next=temp;
                tail=temp;
            }
            size++;

        }
        public void insertAtBeginning(int val){
            Node temp = new Node(val);
            if(size==0) head = tail=temp;
            else{
                temp.next=head;
                head=temp;
            }
            size++;
        }
        void insertAtindx(int idx, int val){
            if(idx<0 || idx>size) System.out.print("Invalid Index");
            else if(idx==0) insertAtBeginning(val);
            else if(idx==size) insertAtEnd(val);
            else{
                Node t = new Node(val);
                Node temp=head;
                for(int i=1; i<=idx-1;i++){
                    temp=temp.next;

                }
                t.next=temp.next;
                temp.next=t;
                size++;

            }
        }
      
        public int getAtindx(int idx){
            if(idx < 0 || idx >= size){
                System.out.println("Invalid input");
                return -1;
            } else if(idx == 0) {
                return head.val;
            } else if (idx == size - 1) {  
                return tail.val;
            } else {
                Node temp = head;
                for(int i = 1; i <= idx; i++){
                    temp = temp.next;
                }
                return temp.val;
            }
        }
        public void deleteAtHead(){
            if(size==0){
                System.out.print("Linked list is empty:");
                return;
            }
            head = head.next;
            size--;

        }
        public void deleteAttail(){
            if(size==0){
                System.out.print("List is Empty:");
                return;
            }
            Node temp =head;
            while(temp.next!=tail){
                temp=temp.next;
            }
            temp.next=null;
            tail=temp;
            size--;

        }
        public void DeleteAtIndex(int idx){
            if(size==0){
                System.out.print("List is Empty!");
                return;
            }
            if(idx<0 || idx>=size){
                System.out.print("Invalid Input :");
                return ;
            }
            else if(idx==0)  deleteAtHead();
            else if(idx==size-1) deleteAttail();
            else{
                Node temp=head;
                for(int i=1; i<=idx-1; i++){
                    temp=temp.next;

                }
                temp.next=temp.next.next;
                size--;
            }
        }
        
        public  void display(){
            Node temp = head;
            while(temp!=null){
                System.out.print(temp.val+" ");
                temp =temp.next;
            }
            System.out.println();
         }

    }
public static void main(String[] args) {
    Linkedlist ll = new Linkedlist();  
    ll.insertAtEnd(10);
    ll.display();
    ll.insertAtEnd(20);
    ll.display();
    ll.insertAtEnd(34);
    ll.insertAtEnd(39);
    ll.display();
    ll.insertAtBeginning(45);
    ll.display();
    //System.out.print(ll.size+" ");
    ll.insertAtindx(4,80);
    ll.display();
   // System.out.println(ll.getAtindx(2));
   ll.deleteAtHead();
   ll.display();
   ll.deleteAttail();
   ll.display();
   ll.DeleteAtIndex(2);
   ll.display();
    

}

}
