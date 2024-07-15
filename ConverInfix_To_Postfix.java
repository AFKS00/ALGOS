package Queue_Examples.InterviewQuestion;

import Stack_Examples.Stack_char;

public class ConverInfix_To_Postfix {
    public static void main(String[] args) {
        String s="A+B*C";
        String ss="";
        int i=0;
        Stack_char obj = new Stack_char();
        obj.create_stack(s.length());
        while(i<s.length()) {
            char ch = s.charAt(i);
            if ((ch >= 'a' && ch <= 'z')||(ch >= 'A' && ch <= 'Z')) {
                ss=ss+ch;
            }else if (ch=='('){
                obj.push(ch);
            }else if(ch==')'){
                while(obj.peek() != '('){
                    ss=ss+obj.pop();
                }
                obj.pop();
            } else{
                if(obj.is_empty()) {
                    obj.push(ch);
                } else if(precedence(ch)>precedence(obj.peek())) {
                    obj.push(ch);
                }else {
                    while(!obj.is_empty()){
                        ss+=obj.pop();
                    }
                    obj.push(ch);
                }
            }
            i++;
        }
        while(!obj.is_empty()){
            ss=ss+obj.pop();
        }

        System.out.println(ss);
    }


    static int precedence(char c){
        if(c=='^'){
            return 3;
        }else if(c=='*' || c=='/' || c=='%'){
            return 2;
        }else if(c=='+' || c=='-')
            return 1;
        else
            return 0;

    }
}

