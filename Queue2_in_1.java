package Queue_Examples.InterviewQuestion;

public class Queue2_in_1 {
    int Maxsize,front1,front2,rear1,rear2,q[];

    void create_queue(int size){
        front1=0;
        rear1=-1;
        Maxsize=size;
        front2=Maxsize-1;
        rear2=Maxsize;
        q=new int[size];
    }
    void enqueue(int e){
        rear1++;
        q[rear1]=e;
    }
    void enqueue2(int e){
        rear2--;
        q[rear2]=e;
    }
    boolean isfull()
    {
        return rear1+1==rear2;
    }

    int dequeue(){
        int temp=q[front1];
        front1++;
        return temp;
    }
    int dequeue2(){
        int temp=q[front2];
        front2--;
        return temp;
    }
    boolean is_empty(){
        return front1>rear1;
    }
    boolean is_empty2(){
        return front2<rear2;
    }
    void printqueue(){
        for(int i=front1;i<=rear1;i++){
            System.out.print(q[i]+"---");
        }
    }
    void printqueue2(){
        for(int i=front2;i>=rear2;i--){
            System.out.print(q[i]+"---");
        }
    }
}
