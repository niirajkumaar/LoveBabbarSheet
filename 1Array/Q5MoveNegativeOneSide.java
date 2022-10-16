package array;
//Que-- Move negative integers at one side       Date: 15-10-2022     Solved By--Niraj Kumar
import java.util.Scanner;
public class Q5MoveNegativeOneSide {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of Array:");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter the value of the array:");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        swap(arr,size);
        System.out.print("Negative integers at one side:");
        for(int i=0;i<size;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    static void swap(int arr[],int size){
        int neg=0;
        for(int j=0;j<size;j++){
            if(arr[j]<0){
                int temp=arr[j];
                arr[j]=arr[neg];
                arr[neg]=temp;
                neg++;

            }
        }
    }
}
