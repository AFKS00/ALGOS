package Linked_List_Examples;

import java.util.Scanner;

public class Student_Management_System {
    Snode root;

    void create_list(){
        root=null;
    }


    void insert_right(int rollno,String name,char gender){
        Snode n =new Snode(rollno,name,gender);
        if(root==null)
            root=n;
        else {
            Snode temp=root;
            while(temp.next!=null){
                temp= temp.next;
            }
            temp.next=n;
            System.out.println(" inserted in list");
        }
    }

    void delete_right(){
        if(root==null)
            System.out.println("List empty");
        else {
            Snode temp=root;
            Snode temp2=root;
            while(temp.next!=null){
                temp2= temp;
                temp=temp.next;
            }
            if(temp==root)
                root=null;
            else
                temp2.next=null;
            System.out.println(" deleted from list");
        }
    }

    void print_list(){
        if(root==null)
            System.out.println("List empty");
        else {
            Snode temp=root;
            while(temp!=null){
                System.out.print("|"+temp.rollno+"|->" +"|"+temp.name+"|->"+"|"+temp.gender+"|->");
                temp=temp.next;
            }
        }
    }

    void search_list(int rollno){
        if(root==null)
            System.out.println("List empty");
        else {
            Snode temp=root;
            while(temp!=null){
                if(temp.rollno==rollno){
                    System.out.println("Found ");
                    break;
                }
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Not Found");
            }
        }
    }
    void modify(int rollno){
        Scanner sc = new Scanner(System.in);
        if(root==null)
            System.out.println("List empty");
        else {
            Snode temp=root;
            while(temp!=null){
                if(temp.rollno==rollno){
                    System.out.println("Old Data : "+"Rollno : "+temp.rollno+"Name : "+temp.name+"Gender : "+temp.gender);
                    System.out.println("Please Enter new Data: ");
                    System.out.print("Enter name :");
                    temp.name= sc.next();
                    temp.gender= sc.next().charAt(0);
                    break;
                }
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Not Found");
            }else{
                System.out.println("Data successfully updated.");
            }
        }
    }

    void delete_key(int rollno)
    {
        if(root==null)//list not created then this is root
            System.out.println("List empty");
        else
        {
            Snode t=root;
            Snode t2=root;
            while(t!=null)
            {
                if(t.rollno==rollno)
                {
                    System.out.println("Found in list");
                    break;
                }
                t2=t;
                t=t.next;
            }
            if(t==null)
                System.out.println("Not found in list");
            else //found and check for case
            {
                if(t==root)//case 1
                    root=root.next;
                else if(t.next==null)//case 2
                    t2.next=null;
                else//case 3
                    t2.next=t.next;
                System.out.println(" deleted from list");
            }
        }
    }
}
