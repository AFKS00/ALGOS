package Linked_List_Examples;

import java.util.Scanner;

public class CircularLinklist_Main {
    public static void main(String args[])
    {
        int ch, e;
        Scanner in = new Scanner(System.in);
        CircularLinklist obj = new CircularLinklist();
        obj.create_list();//user given size :list
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List`\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.insert_left_incircular(e);
                    break;
                case 2:
                    System.out.println("Enter data:");
                    e = in.nextInt();
                    obj.insert_right_incircular(e);
                    break;
                case 3:
                    obj.delete_left_incircular();
                    break;
                case 4:
                    obj.delete_right();
                    break;
                case 5:
                    obj.print_list();
                    break;

                case 0:
                    System.out.println("Exiting.....");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        } while (ch != 0);
    }
}
