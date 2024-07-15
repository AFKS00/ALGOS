package Queue_Examples;

public class CircularDequeue {
    int Maxsize,front,rear,q[];
    int count;

    void create_queue(int size){
        Maxsize=size;
        front=0;
        rear=-1;
        q=new int[size];
        count=0;
    }
    void enqueue(int e){
        rear=(rear+1)%Maxsize;
        q[rear]=e;
        count++;
    }
    boolean isfull()
    {
        return count==Maxsize;
    }

    int dequeue(){
        int temp=q[front];
        front=(front+1)%Maxsize;
        count--;
        return temp;
    }
    boolean is_empty(){
        return count==0;
    }
    void printqueue(){
       /* for(int i=front;i<=rear;i++){
            System.out.print(q[i]+"---");
        }*/
        int i=front;
        int c =0;
        while(c<count){
            System.out.print(q[i]+"---");
            i=(i+1)%Maxsize;
            c++;
        }
    }
}
