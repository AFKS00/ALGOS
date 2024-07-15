package Stack_Examples;

import java.util.Scanner;

public class symbol {
    public static void main(String[] args) {
    Stack_char obj = new Stack_char();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        obj.create_stack(s.length());
        boolean flag =true;
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='{') {
                obj.push(c);
            }else{
                if(!obj.is_empty())
                    obj.pop();
                else {
                    flag=false;
                    System.out.println("Error: unexpected }");
                    break;
                }
            }
        }
        if(obj.is_empty() && flag){
            System.out.println("Balanced");
        }else if(!obj.is_empty()){
            System.out.println("Error: expected }");
        }
    }
}