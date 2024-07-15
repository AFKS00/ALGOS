package Queue_Examples;
public class Queue {
    int Maxsize,front,rear,q[];

    void create_queue(int size){
        front=0;
        rear=-1;
        Maxsize=size;
        q=new int[size];
    }
    void enqueue(int e){
       rear++;
        q[rear]=e;
    }
    boolean isfull()
    {
        return rear==Maxsize-1;
    }

    int dequeue(){
        int temp=q[front];
        front++;
        return temp;
    }
    boolean is_empty(){
        return front>rear;
    }
    void printqueue(){
        for(int i=front;i<=rear;i++){
            System.out.print(q[i]+"---");
        }
    }
}
