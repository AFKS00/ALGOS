package Queue_Examples.InterviewQuestion;

import Stack_Examples.Stack;

import java.util.Scanner;

public class MaxStack {
    public static void main(String[] args) {
        //2 objects of stack class called stack,max_stack
        Stack normal_stack=new Stack();
        Stack max_stack=new Stack();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter stack size:");
        int size=in.nextInt();
        normal_stack.create_stack(size);
        max_stack.create_stack(size);
        int ch;
        do
        {
            System.out.println("\nStack Menu\n-----------\n1.Push\n2.Pop\n3.Peek\n4.Print\n5.Print Max\n0.Exit\n:");
            ch=in.nextInt();
            switch (ch)
            {
                case 1:
                    if(!normal_stack.is_full())//not full
                    {
                        System.out.println("Enter data:");
                        int e=in.nextInt();
                        normal_stack.push(e);
                        //check if max stack is empty then copy it to max stack also
                        if(max_stack.is_empty())
                            max_stack.push(e);
                        else
                        {
                            //check if new element is greater than max_stack peek
                            if(e>max_stack.peek())
                            {
                                max_stack.push(e);
                                System.out.println(e+" pushed in max also");
                            }
                        }
                        System.out.println(e+" pushed");
                    }
                    else
                        System.out.println("Stack FUll");
                    break;
                case 2:
                    if(!normal_stack.is_empty())//not empty
                    {
                        int temp=normal_stack.pop();
                        System.out.println(temp+" poped");
                        if(temp==max_stack.peek())
                        {
                            System.out.println(max_stack.pop()+" poped from Max_stzck");
                        }

                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 3:
                    if(!normal_stack.is_empty())//not empty
                    {
                        System.out.println(normal_stack.peek()+" is at peek");
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 4:
                    if(!normal_stack.is_empty())//not empty
                    {
                        System.out.println("Stack has");
                        normal_stack.print_stack();
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 5:
                    if(!max_stack.is_empty())
                        System.out.println("Maximum on stack is:"+max_stack.peek());
                    else
                        System.out.println("Max stack is empty");
                    break;
                case 0:
                    System.out.println("Thanks for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }while(ch!=0);//not with exit condition

    }
}
