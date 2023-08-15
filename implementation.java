public class implementation {
    
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    public static class Linkedlist{
        Node head=null;
        Node tail =null;
        
        void inserAtEnd(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                tail.next=temp;
            }
            tail=temp;
        }
        
        void insertAtBeg(int val){
            Node temp = new Node(val);
            if(head==null){
                head=temp;
            }
            else{
                temp.next=head;
            }
            head=temp;

        }

        void insertAtMid(int val,int n){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
                tail=temp;
            }
            else{
                Node tem=head;
                if(n==0){
                    insertAtBeg(val);
                    return;
                }
                else if(n>size()){
                    inserAtEnd(val);
                    return;
                }
                else if(n<0 || n>size()){   
                    System.out.println("Wrong Input");
                    return;
                }
                for(int i=1;i<n-1;i++){
                    tem=tem.next;
                }
                temp.next=tem.next;
                tem.next = temp;
            }
        }

        void deleteAt(int n){
            if(head==null){
                System.out.println("Enter the Value");
            }
            else if(n==0){
                System.out.println("item deleted is "+ head.data);
                head=head.next;
                return;
            }
            else if(n==size()){
                Node temp = head;
                while(temp.next.next!=null){
                    temp=temp.next;
                }
                System.out.println("item deleted is "+ tail.data);
                temp.next=null;
                tail=temp;
                return;
            }
            Node temp = head;
            for(int i =1;i<n-1;i++){
                temp=temp.next;
            }
            System.out.println("item deleted is "+ temp.next.data);
            temp.next=temp.next.next;
        }

        void display(){
            Node tem =head;
            while(tem!=null){
                System.out.print(tem.data + " ->");
                tem=tem.next;
            }
            System.out.println();
        }

        int size(){
            Node tem =head;
            int count =0;
            while(tem!=null){
                count++;
                tem=tem.next;
            }
            return count;
        }

        void getAt(int n){
            Node temp = head;
            for(int i =0;i<n;i++){
                temp=temp.next;
            }
            System.out.println("Value at "+  n + " is " +temp.data);
        }
    }
    public static void main(String[] args) {
        Linkedlist ll = new Linkedlist();
        ll.inserAtEnd(12);
        ll.inserAtEnd(23);
        ll.inserAtEnd(45);
        ll.display();
    
        System.out.println("Size is - "+ll.size());
        ll.insertAtBeg(10);
        ll.insertAtBeg(5);
        ll.display();
        
        System.out.println("Size is - "+ll.size());
        ll.insertAtMid(25, 5);
        ll.display();
        
        System.out.println("Size is - "+ll.size());
        ll.insertAtMid(67, 7);
        ll.display();
        System.out.println("Tail is - "+ll.tail.data);

        ll.insertAtMid(2, 0);
        ll.display();

        ll.insertAtMid(-1, -1);

        ll.getAt(0);

        ll.deleteAt(5);
        ll.display();

        ll.deleteAt(0);
        ll.display();

        ll.deleteAt(6);
        ll.display();
        System.out.println("Tail is - "+ll.tail.data);
        System.out.println("Head is - "+ll.head.data);
    }
    
}
