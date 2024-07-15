package Linked_List_Examples;

import java.util.Scanner;

public class Linked_list_in_stackMain {

    public static void main(String args[])
    {
        Linked_list_in_stack obj=new Linked_list_in_stack();
        Scanner in =new Scanner(System.in);
        obj.create_stack();
        int ch;
        do
        {
            System.out.println("\nStack Menu\n-----------\n1.Push\n2.Pop\n3.Peek\n4.Print\n0.Exit\n:");
            ch=in.nextInt();
            switch (ch)
            {
                case 1:
                    System.out.println("Enter data:");
                    int e=in.nextInt();
                    obj.push(e);
                    break;
                case 2:
                    obj.pop();
                    break;
                case 3:
                    obj.peek();
                    break;
                case 4:
                    obj.print_stack();
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
