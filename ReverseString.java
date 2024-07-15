package Stack_Examples;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Stack_char obj = new Stack_char();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ss="";
        obj.create_stack(s.length());
        for(int i=0;i<s.length();i++) {
            obj.push(s.charAt(i));
        }
       while(!obj.is_empty()){
            ss+=obj.pop();
        }
        System.out.println(ss);
    }
}
