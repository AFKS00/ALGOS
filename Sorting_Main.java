package Algorithm;

public class Sorting_Main {
    public static void main(String args[]){
        int a[]={33,11,44,22,66,55,77,88,99};
        System.out.println("Array before sort: ");
        for (int j : a) {
            System.out.print(j + ",");
        }
       // bubble_sort(a);
       // selection_sort(a);
       // insertion_sort(a);
      // quick_sort(a,0,a.length-1);
        merge_sort(a,0,a.length-1);
        System.out.println();
        for (int j : a) {
            System.out.print(j + ",");
        }
    }
    static void bubble_sort(int a[]){
        int i,j,temp;
        for(i=0;i<a.length-1;i++)
            for (j = i; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
    }

    static void selection_sort(int a[]){
        int i,j,min,pos;
        for(i=0;i<a.length-1;i++){
            min=a[i];pos=i;
            for(j=i+1;j< a.length;j++){
                if(a[j]<min){
                    min=a[j];
                    pos=j;
                }
            }
            a[pos]=a[i];
            a[i]=min;
        }
    }

    static void insertion_sort(int a[]) {
        int i, j, insert;
        for (i = 0; i < a.length-1; i++){
            insert=a[i+1];
            j=i+1;
            while(j>0 && a[j-1]>insert){
                a[j]=a[j-1];
                j--;
            }
            a[j]=insert;
        }
    }

    static void quick_sort(int a[],int start ,int end) {
        int i=start;
        int j=end;
        int pivot =start;
        while(i<j){
            while(a[i]<a[pivot])
                i++;
            while(a[j]>a[pivot])
                j--;
            if(i<j){
                int tmp =a[i];
                a[i]=a[j];
                a[j]=tmp;
            }
        }
        if(i<end){
            quick_sort(a,i+1,end);
        }
        if(start<j){
            quick_sort(a,start,j-1);
        }
    }

    static void merge_sort(int a[],int start,int end){
        if(start<end){
            int mid =(start+end)/2;
            merge_sort(a,start,mid);
            merge_sort(a,mid+1,end);
            merger(a,start,mid,end);
        }
    }
    static void merger(int a[],int start,int mid,int end){
        int i=start;
        int j=mid+1;
        int t[]=new int[a.length];
        int ti=start;//t-index
        while(i<=mid && j<=end)
        {
            if(a[i]<a[j]) {
                t[ti] = a[i];
               ti++;
               i++;
            }
            else {
                t[ti] = a[j];
             ti++;
             j++;
            }
        }
        while(j<=end)//copy leftover
        {
            t[ti]=a[j];
            ti++;
            j++;
        }
        while(i<=mid)//copy leftover
        {
            t[ti]=a[i];
            ti++;
            i++;
        }
        //copy to a
        for(i=start;i<=end;i++)
            a[i]=t[i];
    }
}
