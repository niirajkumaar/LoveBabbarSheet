package array;
//Que-- Kth Max & Min of the Array       Date: 13-10-2022     Solved By--Niraj Kumar
import java.util.Scanner;
public class Q3KthMaxMin{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array: ");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the values of the Array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        sort(arr,size);
        System.out.print("Enter the value of k: ");
        int k=sc.nextInt();
        int max=arr[size-k];
        int min=arr[k-1];
        System.out.println("Kth Maximum: "+max);
        System.out.println("Kth Minimum: "+min);

    }
    static void sort(int arr[],int size) {
        int temp;
        for(int j=0;j<size-1;j++) {
            for (int k = 0; k < size - 1 - j; k++) {
                if (arr[k] > arr[k + 1]) {
                    temp = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
    }
}