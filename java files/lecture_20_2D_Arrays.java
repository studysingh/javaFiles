import java.util.*;
public class lecture_20_2D_Arrays {
    public static void inputArray(int arr[][]){
        Scanner sc =new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
                System.out.print("    ");
            }
            System.out.println();
        }
    }
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
    }
    public static void matrixAdd(int arr1[][],int arr2[][]){  // matrix addition
        int r1=arr1.length;
        int r2=arr2.length;
        int c1=arr1[0].length;
        int c2=arr2[0].length;
        if(r1!=r2||c1!=c2){
            System.out.println("Invalid input - operation can't be performed");
            for(int i=0;i<45;i++){
                System.out.print('-');
            }
            return;
        }
        int ans[][]=new int [r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c1;j++){
                ans[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("Sum of matrix:");
        printArray(ans);
    }
    public static void matrixMul(int arr1[][], int arr2[][]){  // matrix multiplication
        int r1=arr1.length;
        int r2=arr2.length;
        int c1=arr1[0].length;
        int c2=arr2[0].length;
        int mul[][]=new int [r1][c2];
        if(c1!=r2){
            System.out.println("Invalid input-operation can't be performed");
            for(int i=0;i<42;){
                System.out.print('-');
                i++;
            }
            return;

        }
        for(int i=0;i<r1;i++){ // row elements 
            for(int j=0;j<c2;j++){ // column elements
                for(int k=0;k<c1;k++){  // k times the addition is performed 
                    mul[i][j]+=arr1[i][k]*arr2[k][j];
                }
            }
        }
        System.out.println("Product of matrix: ");
        printArray(mul);
    }
    public static void reverse2D_Array(int arr[][]){  // reversing 2D array 
        int r=arr.length;
        int c=arr[0].length;
        int ans[][]=new int [r][c];
        for(int i=0;i<r;i++){
        int k=c-1;  // value of k after j loop updated again to c-1
            for(int j=0;j<c;j++){
                ans[i][j]=arr[i][k--];
            }
        }
        System.out.println("Reversed Array->");
        printArray(ans);
    }
   static void swap(int arr[],int i, int j ){  // swaping array elements
    arr[i]=arr[j]+arr[i];
    arr[j]=arr[i]-arr[j];
    arr[i]=arr[i]-arr[j];
   }
    public static void reverse2D_ArrayInPlace(int arr[][]){ // reversing array column elements in place
        int c=arr[0].length;
        int r=arr.length;
        int i=0,j=c-1;
       for(int k=0;k<r;k++){ while(i<j){
            swap(arr[k],i,j);  // swaping elements of array arr[i]
            i++;
            j--;
        }
    }
        printArray(arr);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for array 1: ");
        int r1=sc.nextInt();
        System.out.print("Enter the number of columns for array 1: ");
        int c1=sc.nextInt();
        int arr1[][]=new int [r1][c1];// array 1
        // System.out.print("Enter the number of rows for array 2: ");
        // int r2=sc.nextInt();
        // System.out.print("Enter the number of columns for array 2: ");
        // int c2=sc.nextInt();
        // int arr2[][]=new int [r2][c2];   // array 2
        System.out.println("Enter the elements of array 1");
        inputArray(arr1);
        // System.out.println("Enter the elements of the array 2");
        // inputArray(arr2);
        System.out.println("Array 1");
        printArray(arr1);
        System.out.println("Array 2");
        // printArray(arr2);
        // matrixMul(arr1,arr2);
        // reverse2D_Array(arr1);
    }
    
}
