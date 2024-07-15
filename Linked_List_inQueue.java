package Linked_List_Examples;

public class Linked_List_inQueue {
    Node front,rear;

    void create_list(){
        front=rear=null;
    }

    void enqueue(int data){
        Node n =new Node(data);
        if(rear==null){
            front=rear=n;
        }
        else {
           rear.next=n;
           rear=n;
        }
        System.out.println(data+ " Enqueued");
    }

    void dequeue(){
        if(front==null)
            System.out.println("List empty");
        else {
            Node n=front;
            if(front==rear){
                front=rear=null;
            }else
               front=front.next;
            System.out.println(n.data+ " dequeued");
        }
    }

    void print_list(){
        if(front==null)
            System.out.println("List empty");
        else {
            Node temp=front;
            while(temp!=null){
                System.out.print("|"+temp.data+"|->");
                temp=temp.next;
            }
        }
    }
}
