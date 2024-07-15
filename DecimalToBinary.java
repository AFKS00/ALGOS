package Stack_Examples;

import java.util.Scanner;

public class DecimalToBinary {
    public static void main(String[] args) {
        Stack obj =new Stack();
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        obj.create_stack(64);
        while(a!=0){
            int rem=a%2;
            obj.push(rem);
            a=a/2;
        }
        while(!obj.is_empty()){
            System.out.print(obj.pop());
        }
    }
}
