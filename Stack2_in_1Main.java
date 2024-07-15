package Queue_Examples.InterviewQuestion;

import java.util.Scanner;

public class Stack2_in_1Main {
    public static void main(String[] args) {
        Stack2_in_1 obj = new Stack2_in_1();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter stack size:");
        int size=in.nextInt();
        obj.create_stack(size);
        int ch;
        do
        {
            System.out.println("\nStack Menu\n-----------\n1.Push\n2.Push in 2 Stack\n3.Pop\n4.Pop from 2\n5.Peek\n6.Peek from 2\n7.Print\n8.Print from 2\n0.Exit\n:");
            ch=in.nextInt();
            switch (ch)
            {
                case 1:
                    if(!obj.is_full())//not full
                    {
                        System.out.println("Enter data:");
                        int e=in.nextInt();
                        obj.push(e);
                        System.out.println(e+" pushed");
                    }
                    else
                        System.out.println("Stack FUll");
                    break;
                case 2:
                    if(!obj.is_full())//not full
                    {
                        System.out.println("Enter data in 2 stack:");
                        int e=in.nextInt();
                        obj.push2(e);
                        System.out.println(e+" pushed");
                    }
                    else
                        System.out.println("Stack FUll");
                    break;
                case 3:
                    if(!obj.is_empty())//not empty
                    {
                        System.out.println(obj.pop()+" poped");
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 4:
                    if(!obj.is_empty2())//not empty
                    {
                        System.out.println(obj.pop2()+" poped from 2 Stack");
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 5:
                    if(!obj.is_empty())//not empty
                    {
                        System.out.println(obj.peek()+" is at peek");
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 6:
                    if(!obj.is_empty2())//not empty
                    {
                        System.out.println(obj.peek2()+" is at peek in 2 Stack");
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 7:
                    if(!obj.is_empty())//not empty
                    {
                        System.out.println("Stack has");
                        obj.print_stack();
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 8:
                    if(!obj.is_empty2())//not empty
                    {
                        System.out.println("Stack has");
                        obj.print_stack2();
                    }
                    else
                        System.out.println("Stack Empty");
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
