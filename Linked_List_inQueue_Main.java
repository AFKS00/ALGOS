package Linked_List_Examples;

import java.util.Scanner;

public class Linked_List_inQueue_Main {
    public static void main(String args[]) {
        Linked_List_inQueue obj = new Linked_List_inQueue();
        Scanner in = new Scanner(System.in);
        obj.create_list();
        int ch;
        do {
            System.out.println("\nQueue Menu\n-----------\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data:");
                    int e = in.nextInt();
                    obj.enqueue(e);
                    break;
                case 2:
                    obj.dequeue();
                    break;
                case 3:
                    obj.print_list();
                    break;
                case 0:
                    System.out.println("Thanks for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0) ;
    }
}
