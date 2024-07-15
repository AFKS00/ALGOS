package Stack_Examples;

public class Stack {
    int tos,MaxSize,s[];
    public void create_stack(int size){
        MaxSize =size;
        tos =-1;
        s= new int[size];
    }
  public   void push(int e){
        tos++;
        s[tos]=e;
    }
    public boolean is_full(){
        return tos == MaxSize - 1;
     /*   if (tos==MaxSize-1)
            return true;
        else
            return false;
      */
    }
    public  int pop(){
        int temp=s[tos];
        tos--;
        return(temp);
    }
    public boolean is_empty(){
        return tos==-1;
        /*
        if(tos==-1)
        return true;
        else
        return false;
         */
    }
    public int peek(){
        return(s[tos]);
    }
    public void  print_stack(){
        for(int i=tos;i>=0;i--){
            System.out.println(s[i]);
        }

    }
}
