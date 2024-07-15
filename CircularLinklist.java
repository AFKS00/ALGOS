package Linked_List_Examples;

public class CircularLinklist {
    Node root,last;

    public   void create_list() {
        root = last=null;
    }

    public void insert_left_incircular(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last = n;
            last.next=root;
        }
        else {
            n.next = root;
            root = n;
            last.next=root;
        }
        System.out.println(data + " inserted in list");
    }

    public  void delete_left_incircular() {
        if (root == null)
            System.out.println("List empty");
        else if(root==last){
            root=last=null;
        }
        else {
            Node n = root;
            root = root.next;
            last.next=root;
            System.out.println(n.data + " deleted from list");
        }
    }

    public void insert_right_incircular(int data) {
        Node n = new Node(data);
        if (root == null) {
            root = last = n;
            last.next = root;
        }
        else {
            last.next=n;
            last=n;
            n.next = root;
            System.out.println(data + " inserted in list");
        }
    }

    public  void delete_right() {
        if (root == null)
            System.out.println("List empty");
        else {
            Node temp = root;
            Node temp2 = root;
            while (temp.next != null) {
                temp2 = temp;
                temp = temp.next;
            }
            if (temp == root)
                root =last= null;
            else {
                last = temp2;
                last.next=root;
            }
            System.out.println(temp.data + " deleted from list");
        }
    }

    public void print_list() {
        if (root == null)
            System.out.println("List empty");
        else {
            Node temp = root;
            do {
                System.out.print("|" + temp.data + "|->");
                temp = temp.next;
            }while(temp!=root);
        }
    }

    public void search_list(int data) {
        if (root == null)
            System.out.println("List empty");
        else {
            Node temp = root;
            while (temp != null) {
                if (temp.data == data) {
                    System.out.println("Found ");
                    break;
                }
                temp = temp.next;
            }
            if (temp == null) {
                System.out.println("Not Found");
            }
        }
    }

    public void delete_key(int key) {
        if (root == null)//list not created then this is root
            System.out.println("List empty");
        else {
            Node t = root;
            Node t2 = root;
            while (t != null) {
                if (t.data == key) {
                    System.out.println("Found in list");
                    break;
                }
                t2 = t;
                t = t.next;
            }
            if (t == null)
                System.out.println("Not found in list");
            else //found and check for case
            {
                if (t == root)//case 1
                    root = root.next;
                else if (t.next == null)//case 2
                    t2.next = null;
                else//case 3
                    t2.next = t.next;
                System.out.println(t.data + " deleted from list");
            }
        }
    }

    public void insert_at(int index, int data) {
        if (root == null)
            System.out.println("List empty");
        else {
            if (index == 0) {
                Node n = new Node(data);
                n.next = root;
                root = n;
            } else {
                Node t = root;
                Node t2 = root;
                int i = 0;
                while (t != null && index > 0) {
                    t2 = t;
                    t = t.next;
                    index--;
                }
                if (t == null) {
                    System.out.println("Index out of range therefore inserted in end");
                    insert_right_incircular(data);
                } else {
                    Node n = new Node(data);
                    t2.next = n;
                    n.next = t;
                }
                System.out.println(data + "inserted");
            }
        }

    }
}