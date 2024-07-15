package Queue_Examples.InterviewQuestion;

public class Stack2_in_1 {
    int tos1,tos2,MaxSize,s[];
    void create_stack(int size){
        MaxSize =size;
        tos1=-1;
        tos2=size;
        s= new int[size];
    }
    void push(int e){
        tos1++;
        s[tos1]=e;
    }
    void push2(int e){
        tos2--;
        s[tos2]=e;
    }
    boolean is_full(){
        return tos1==tos2-1 ;
     /*   if (tos==MaxSize-1)
            return true;
        else
            return false;
      */
    }
    int pop(){
        int temp=s[tos1];
        tos1--;
        return(temp);
    }
    int pop2(){
        int temp=s[tos2];
        tos2++;
        return(temp);
    }
    boolean is_empty(){
        return tos1==-1;
        /*
        if(tos==-1)
        return true;
        else
        return false;
         */
    }
    boolean is_empty2(){
        return tos2==MaxSize;
    }
    int peek(){
        return(s[tos1]);
    }
    int peek2(){
        return(s[tos2]);
    }
    void  print_stack(){
        for(int i=tos1;i>=0;i--){
            System.out.println(s[i]);
        }

    }
    void  print_stack2(){
        for(int i=tos2;i<MaxSize;i++){
            System.out.println(s[i]);
        }

    }
}
