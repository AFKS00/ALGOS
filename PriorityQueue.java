package Queue_Examples;

public class PriorityQueue {
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
        for(int i=front;i<rear;i++){
            for(int j=front;j<rear;j++){
                if(q[j]>q[j+1]){
                    int t =q[j];
                    q[j]=q[j+1];
                    q[j+1]=t;
                }
            }
        }
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
