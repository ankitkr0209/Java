
// //import java.util.Scanner;

// //  class App {
// //     public static void main(String[] args)  {
// //         System.out.println("Hello, World!");
// //         Scanner s = new Scanner(System.in);
// //         System.out.println("enter number :-");
// //         int a ;
// //         a= s.nextInt();
// //         int b;
// //         System.out.print(" \nEnter second number :-");
// //         b= s.nextInt();
// //         int sum ;
// //         sum = a+b;
// //         System.out.println("sum = "+sum);

// //     }
// // }
// import java.io.*;
// class app {
// 	public static void main(String[] args)
// 	{

// 		int[][] arr = { { 1, 2 }, { 3, 4 } };

// 		for (int i = 0; i < 2; i++)
// 			for (int j = 0; j < 2; j++)
// 				System.out.println("arr[" + i + "][" + j + "] = "
// 								+ arr[i][j]);
// 	}
// }
import java.util.*;
public class App {
    public static void conquer(int []arr, int si, int mid, int ei){
        int []merged= new int [ei - si + 1];
        int index1=si;
        int  index2=mid+1;
        int x=0;

        while (index1<=mid && index2<=ei){
            if(arr[index1]<=arr[index2]){
                merged[x]=arr[index1];
                x++;
                index1++;
            }
            else {
                merged[x]=arr[index2];
                x++;
                index2++;
            }
        }

        while(index1<=mid){
            merged[x]=arr[index1];
            x++;
            index1++;
        }
        while(index2<=ei){
            merged[x]=arr[index2];
            x++;
            index2++;
        }

        int j=0;
        for(x=0; x<=merged.length; x++){
            arr[j]=merged[x];
            j++;
        }
    }
    public static void divide(int []arr, int si, int ei){
        if(si < ei) {
            int mid = si + (ei - si) / 2;  //(si+ei)/2
            divide(arr, si, mid);
            divide(arr, mid + 1, ei);
            conquer(arr, si, mid, ei);
        }
    }
    public static void main(String[] args) {
        int []arr={6,3,9,5,2,8};
        int i,n= arr.length;
        System.out.println("Unsorted elements are");
        for (i=0;i< arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();

        divide(arr, 0, n-1);
        System.out.println("Sorted element are");
        //Ascending order
        for(i=0;i<n;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        //Descending order
        for (i=n-1; i>=0; i--){
            System.out.print(arr[i]+"\t");
        }
    }
}

