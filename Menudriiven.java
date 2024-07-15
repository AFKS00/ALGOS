package Queue_Examples;

import java.util.Scanner;

public class Menudriiven {
    public static void main(String[] args) {

        Queue obj = new Queue();
        Scanner in = new Scanner(System.in);
        System.out.println("Enter queue size:");
        int size = in.nextInt();
        obj.create_queue(size);
        int ch;
        do {
            System.out.println("\nQueue Menu\n-----------\n1.Enqueue\n2.Dequeue\n3.Print\n0.Exit\n:");
            ch = in.nextInt();
            switch (ch) {
                case 1:
                    if (!obj.isfull())//not full
                    {
                        System.out.println("Enter data:");
                        int e = in.nextInt();
                        obj.enqueue(e);
                        System.out.println(e + " enqueue");
                    } else
                        System.out.println("Queue FUll");
                    break;
                case 2:
                    if(!obj.is_empty())//not empty
                    {
                        System.out.println(obj.dequeue()+" dequeued");
                    }
                    else
                        System.out.println("Queue Empty");
                    break;
                case 3:
                    if(!obj.is_empty())//not empty
                    {
                        System.out.println("Queue has");
                        obj.printqueue();
                    }
                    else
                        System.out.println("Queue Empty");
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
