package Linked_List_Examples;

import java.util.Scanner;

public class Linked_list_in_stack {
      // (Dynamic Stack)
      Node tos;
    void create_stack()
    {
        tos=null;//root is never created but assigned to 1st
    }
    void push(int data)
    {
        Node n=new Node(data);
        if(tos==null)//list not created then this is root
            tos=n;
        else
        {
            n.next=tos;//1
            tos=n;//2
        }
        System.out.println(data+" pushed");
    }
    void pop()
    {
        if(tos==null)//list not created then this is root
            System.out.println("Stack empty");
        else
        {
            Node t=tos;//1
            tos=tos.next;//2
            System.out.println(t.data+" poped from stack");
        }
    }
    void peek()
    {
        if(tos==null)//list not created then this is root
            System.out.println("Stack empty");
        else
        {
            System.out.println(tos.data+" is at peek in stack");
        }
    }
    void print_stack()
    {
        if(tos==null)//list not created then this is root
            System.out.println("List empty");
        else
        {
            Node t=tos;
            while(t!=null)
            {
                System.out.println(t.data);
                System.out.println("----");
                t=t.next;
            }
        }
    }
}