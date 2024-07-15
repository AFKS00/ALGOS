package Stack_Examples;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Stack obj=new Stack();
        Scanner in =new Scanner(System.in);
        System.out.println("Enter stack size:");
        int size=in.nextInt();
        obj.create_stack(size);
        int ch;
        do
        {
            System.out.println("\nStack Menu\n-----------\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
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
                    if(!obj.is_empty())//not empty
                    {
                        System.out.println(obj.pop()+" poped");
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 3:
                    if(!obj.is_empty())//not empty
                    {
                        System.out.println(obj.peek()+" is at peek");
                    }
                    else
                        System.out.println("Stack Empty");
                    break;
                case 4:
                    if(!obj.is_empty())//not empty
                    {
                        System.out.println("Stack has");
                        obj.print_stack();
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