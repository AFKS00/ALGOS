package Stack_Examples;

public class Stack_char {
    int tos,MaxSize;
    char s[];
 public  void create_stack(int size){
        MaxSize =size;
        tos =-1;
        s= new char[size];
    }
    public  void push(char e){
        tos++;
        s[tos]=e;
    }
    public   boolean is_full(){
        return tos == MaxSize - 1;
     /*   if (tos==MaxSize-1)
            return true;
        else
            return false;
      */
    }
    public  char pop(){
        char temp=s[tos];
        tos--;
        return(temp);
    }
    public  boolean is_empty(){
        return tos==-1;
        /*
        if(tos==-1)
        return true;
        else
        return false;
         */
    }
    public  char peek(){
        return(s[tos]);
    }
    public  void  print_stack(){
        for(int i=tos;i>=0;i--){
            System.out.println(s[i]);
        }

    }
}
