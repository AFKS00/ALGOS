package Linked_List_Examples;

public class DoubleLinklist {
    DNode root;

    void create_list() {
        root = null;
    }

    void insert_left(int data) {
        DNode n = new DNode(data);
        if (root == null)
            root = n;
        else {
            root.left=n;
            n.right = root;
            root = n;
        }
        System.out.println(data + " inserted in list");
    }

    void delete_left() {
        if (root == null)
            System.out.println("List empty");
        else {
            DNode n = root;
            if (root.left == null && root.right == null) {
                root = null;
            } else {
                root = root.right;
                root.left = null;
                System.out.println(n.data + " deleted from list");
            }
        }
    }

    void insert_right(int data) {
        DNode n = new DNode(data);
        if (root == null)
            root = n;
        else {
            DNode temp = root;
            while (temp.right != null) {
                temp = temp.right;
            }
            temp.right = n;
            n.left=temp;
            System.out.println(data + " inserted in list");
        }
    }

    void delete_right() {
        if (root == null)
            System.out.println("List empty");
        else {
            DNode temp = root;
            DNode temp2 = root;
            while (temp.right != null) {
                temp2 = temp;
                temp = temp.right;
            }
            if (temp == root)
                root = null;
            else {
                temp.left=null;
                temp2.right = null;
            }
            System.out.println(temp.data + " deleted from list");
        }
    }

    void print_list() {
        if (root == null)
            System.out.println("List empty");
        else {
            DNode temp = root;
            while (temp != null) {
                System.out.print("|" + temp.data + "|->");
                temp = temp.right;
            }
        }
    }
    void print_list_rev() {
        if (root == null)
            System.out.println("List empty");
        else {
            DNode temp = root;
            while (temp.right != null) {
                temp = temp.right;
            }
            while (temp != null) {
                System.out.print("|" + temp.data + "|->");
                temp = temp.left;
            }
        }
    }
}
