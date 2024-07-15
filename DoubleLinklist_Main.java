package Linked_List_Examples;

import java.util.Scanner;

public class DoubleLinklist_Main {
    public static void main(String[] args) {
        DoubleLinklist obj = new DoubleLinklist();
        Scanner in = new Scanner(System.in);
        obj.create_list();
        int ch;
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Rev\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    //not full
                {
                    System.out.println("Enter data:");
                    int e = in.nextInt();
                    obj.insert_left(e);
                }
                break;
                case 2: {
                    System.out.println("Enter data:");
                    int e = in.nextInt();
                    obj.insert_right(e);
                    break;
                }
                case 3: {
                    obj.delete_left();
                    break;
                }
                case 4: {
                    obj.delete_right();
                    break;
                }
                case 5:
                    System.out.println("Linked List has");
                    obj.print_list();
                    break;
                case 6:
                    System.out.println("Linked List has");
                    obj.print_list_rev();
                    break;
                case 0:
                    System.out.println("Thanks for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
    }
}
