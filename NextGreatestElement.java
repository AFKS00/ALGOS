package Queue_Examples.InterviewQuestion;

import java.util.Scanner;

public class NextGreatestElement {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter Array size:");
        int size=in.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter Elements: ");
        for(int i=0;i<arr.length;i++){
            arr[i] = in.nextInt();
        }
        int[] arr2 = new int[arr.length];
        arr2[arr2.length-1]=-1;
        for(int i=arr2.length-2;i>=0;i--){
            for(int j=i;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    arr2[i]=arr[j];
                    break;
                }else{
                    arr2[i]=-1;
                }
            }
        }

        for (int j : arr2) {
            System.out.print(j + ",");
        }
    }
}
