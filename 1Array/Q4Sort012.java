package array;
//Que-- sort 012 of the Array       Date: 14-10-2022     Solved By--Niraj Kumar
import java.util.Scanner;
public class Q4Sort012 {
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
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]);
            System.out.print(" ");
        }
    }
    static void sort(int arr[],int size){
        int zc=0;
        int c1=0;
        int c2=0;
        for(int i=0;i<size;i++){
            if(arr[i]==0){
                zc++;
            }
            else if(arr[i]==1){
                c1++;
            }
            else{
                c2++;
            }

        }
        int j=0;
        while(zc-->0){
            arr[j]=0;
            j++;
        }
        while(c1-->0){
            arr[j]=1;
            j++;
        }
        while(c2-->0){
            arr[j]=2;
            j++;
        }
    }
}
