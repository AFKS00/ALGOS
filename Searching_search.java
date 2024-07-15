package Searching;

public class Searching_search {

    static int  sequential_seach(int a[],int key){
        for(int i=0;i<a.length;i++){
            if(a[i]==key)
                return i;
        }
        return -1;
    }

    static int binary_Search(int a[],int start ,int end,int key){
        if(start<=end){
            int mid =(start+end)/2;
            if(a[mid]==key){
                return mid;
            }else{
                if(key<a[mid])
                    binary_Search(a,start,mid-1,key);
                else
                    binary_Search(a,mid+1,end,key);
            }
        }
            return -1;
    }

     static int binary_Search(int a[],int key){
        int start =0;
        int end = a.length-1;
        while(start<end){
            int mid =(start+end)/2;
            if(a[mid]==key){
                return mid;
            } else if (a[mid]>key) {
                end =mid-1;
            }else{
                start =mid+1;
            }
        }
        return -1;
     }

     static void heap_sort(int a[]){
        int parentchild,done;
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
