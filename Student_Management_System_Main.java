package Linked_List_Examples;

import java.util.Scanner;

public class Student_Management_System_Main {
    public static void main(String[] args) {
        Student_Management_System obj =new Student_Management_System();
        Scanner in = new Scanner(System.in);
        obj.create_list();
        int ch;
        do {
            System.out.println("\n1.Insert \n2.Delete Right\n3.Print List\n4.Search\n5.Delete by Rollno\n6.Modify\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    //not full
                {
                    System.out.println("Enter data:");
                    System.out.println("Enter Rollno : ");
                    int rollno = in.nextInt();
                    System.out.println("Enter Name : ");
                    String name = in.next();
                    System.out.println("Enter Gender: ");
                    char c = in.next().charAt(0);
                    obj.insert_right(rollno,name,c);
                }
                break;
                case 2: {
                    obj.delete_right();
                    break;
                }
                case 3:
                    System.out.println("Linked List has");
                    obj.print_list();
                    break;
                case 4:
                    System.out.println("Enter data:");
                    int no= in.nextInt();
                    obj.search_list(no);
                    break;
                case 5:
                    System.out.println("Enter data:");
                    int e = in.nextInt();
                    obj.delete_key(e);
                    break;
                case 6:
                    System.out.println("Enter rollno:");
                    int ee = in.nextInt();
                    obj.modify(ee);
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
