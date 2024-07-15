package Linked_List_Examples;

import java.util.Scanner;

public class Linked_list_menudriven {
    public static void main(String[] args) {
        Linked_list obj =new Linked_list();
        Scanner in = new Scanner(System.in);
        obj.create_list();
        int ch;
        do {
            System.out.println("\n1.Insert Left\n2.Insert Right\n3.Delete Left\n4.Delete Right\n5.Print List\n6.Search\n7.Delete on Key\n8.Insert At\n0.Exit\n:");
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
                case 2:
                {
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
                    System.out.println("Enter data:");
                    int no= in.nextInt();
                    obj.search_list(no);
                    break;
                case 7:
                    System.out.println("Enter data:");
                    int e = in.nextInt();
                    obj.delete_key(e);
                    break;
                case 8:
                    System.out.println("Enter index:");
                    int i = in.nextInt();
                    System.out.println("Enter data:");
                    int ee= in.nextInt();
                    obj.insert_at(i,ee);
                    break;
                case 0:
                    System.out.println("Thanks for using code");
                    break;
                default:
                    System.out.println("Wrong option selected");
                    break;
            }
        }while(ch!=0);
    }
}
