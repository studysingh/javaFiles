import java.util.*;
public class problemson2darray1 {
    static void inputArray(int arr[][]){
        Scanner sc = new Scanner(System.in);
         for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]=sc.nextInt();
            }
         }
    }
    static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static int [][] multiply(int arr1[][],int arr2[][]){ // Multiplication of two matrixes
        int c1=arr1[0].length;
        int r2=arr2.length;
        int r1=arr1.length;
        int c2=arr2[0].length;
        int ans[][]=new int [r1][c2];
        if(c1!=r2){
            System.out.println("Invalid Input");
        }
        if(c1==r2){
           for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<c1;k++){
                   sum+=arr1[i][k]*arr2[k][j];
                   ans[i][j]=sum;
                }
            }
           }
        }
           return ans;
        }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for array 1: ");
        int r1=sc.nextInt();
        System.out.print("Enter the number of columns for array 1: ");
        int c1=sc.nextInt();
        int arr1[][]=new int [r1][c1];// array 1
        System.out.print("Enter the number of rows for array 2: ");
        int r2=sc.nextInt();
        System.out.print("Enter the number of columns for array 2: ");
        int c2=sc.nextInt();
        int arr2[][]=new int [r2][c2];   // array 2
        System.out.println("Enter the elements of array 1");
        inputArray(arr1);
        System.out.println("Enter the elements of the array 2");
        inputArray(arr2);
        System.out.println("Array 1 ->");
        printArray(arr1);
        System.out.println("Array 2 ->");
        printArray(arr2);
        System.out.println("Ans->");
        printArray(multiply(arr1,arr2));
    }
    
}
