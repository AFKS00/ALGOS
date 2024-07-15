package Searching;

import java.util.Scanner;

public class Searching_Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
           int a[]= {10,23,43,45,65,45,34,4554,2435,5,5423,4432};
      //  int ar[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
     //   System.out.println("Enter the key which you want to find : ");
      //  int key = sc.nextInt();
      //  key = binary_Search(ar, 0, ar.length - 1, key);
       // if (key == -1) {
         //   System.out.println("key is not founded");
       // } else {
        //    System.out.println("Key is founded at " + key);
      //  }
        heap_sort(a);
        for (int j : a) {
            System.out.print(j + ",");
        }
    }

    static int sequential_seach(int a[], int key) {
        for (int i = 0; i < a.length; i++) {
            if (a[i] == key)
                return i;
        }
        return -1;
    }

    static int binary_Search(int a[], int start, int end, int key) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (a[mid] == key) {
                return mid;
            } else {
                if (key < a[mid])
                    return binary_Search(a, start, mid - 1, key);
                else
                    return binary_Search(a, mid + 1, end, key);
            }
        } else
            return -1;

    }

    static void heap_sort(int a[]){
        int parentchild;
        for(int i=a.length-1;i>0;i--) {
            for (int j = 0; j <= i; j++) {
                parentchild = j;
                while (parentchild >= 0 && parentchild / 2 >= 0) {
                    if (a[parentchild / 2] < a[parentchild]) {
                        //parent < child then swap
                        int temp = a[parentchild / 2];
                        a[parentchild / 2] = a[parentchild];
                        a[parentchild] = temp;
                        parentchild = parentchild / 2;
                    }else{
                        break;
                    }
                }
            }
            int temp = a[0];
            a[0] = a[i];
            a[i] = temp;
        }
    }
}
