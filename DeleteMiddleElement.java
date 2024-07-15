package Queue_Examples.InterviewQuestion;

import Stack_Examples.Stack;

import java.util.Scanner;

public class DeleteMiddleElement {
    public static void main(String[] args) {
        System.out.println("Enter stack size:");
        Scanner in =new Scanner(System.in);
        int size=in.nextInt();
        Stack normal_stack=new Stack();
        normal_stack.create_stack(size);
        System.out.println("Enter Elements: ");
        for(int i=0;i<size;i++){
            normal_stack.push(in.nextInt());
        }
        Stack copy = new Stack();
        copy.create_stack(size);

            for(int i =0 ;i<size/2;i++) {
                copy.push(normal_stack.pop());
            }
            normal_stack.pop();
            while(!copy.is_empty()){
                normal_stack.push(copy.pop());
            }

        while(!normal_stack.is_empty()){
            System.out.print(normal_stack.pop()+"---");
        }
    }
}
