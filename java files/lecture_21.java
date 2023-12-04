import java.util.*;
public class lecture_21 {
    public static void inputArray(int arr[][]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
                
            }
        }
    }
    public static void printArray(int arr[][]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void swap2D_Array(int arr[][], int i,int j){ // i and j are reversed
        arr[i][j]=arr[j][i]+arr[i][j];
        arr[j][i]=arr[i][j]-arr[j][i];
        arr[i][j]=arr[i][j]-arr[j][i];
    }
    static void swapColumnElements(int arr[],int f,int l){
        arr[f]=arr[f]+arr[l];
        arr[l]=arr[f]-arr[l];
        arr[f]=arr[f]-arr[l];
      
       }
    public static void transpose(int arr[][]){  // Transpose of a matrix
        int r1=arr.length;
        int c1=arr[0].length;
        int transpose[][]=new int [c1][r1];
        for(int i=0;i<c1;i++){
            for(int j=0;j<r1;j++){
                transpose[i][j]=arr[j][i];
            }
        }
        System.out.println("Transpose of Matrix->");
        printArray(transpose);
    }
    static void transposeInPlace(int arr[][]){  // this method can be used only for square matrix
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<c;i++){
            for(int j=i+1;j<r;j++){
                swap2D_Array(arr,i,j);
            }
        }
        System.out.println("Transpose of Array ->");
        printArray(arr);
    }
    static void rotateacw90(int arr[][]){  //matrix rotated by 90 degree in anti clockwise direction
        int r=arr.length;
        int c=arr[0].length;
        int k=c-1;
        int ans[][]=new int [c][r];
        for(int i=0;i<c;i++){
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][k];
            }
            k--;
        }
        System.out.println("Rotated array by 90 degree anticlockwise ->");
        printArray(ans);
    }
    static void rotatecw90(int arr[][]){  //rotate matrix by 90 degree clockwise
        // logic behind this was to find transpose of the matrix and then reversing elements column wise
        int r=arr.length;
        int c=arr[0].length;
        int ans[][]= new int [c][r];
        for(int i=0;i<c;i++){  // finding transpose of matrix
            for(int j=0;j<r;j++){
                ans[i][j]=arr[j][i];
            }
        }
        for(int k=0;k<c;k++){
        int f=0,l=r-1;
      while(f<l){
        swapColumnElements(ans[k],f,l);  // reversed elements of column
        f++;
        l--;
      }
    } 
        System.out.println("Array rotated by 90 degrees in clockwise direction ->");
        printArray(ans);
    }
    static void pascalTriangle(int n){  // pascal Triangle
        int pascal[][]=new int [n][]; //matrix defined using only rows
        for(int i=0;i<n;i++){
        pascal[i]=new int [i+1];  // dynamically columns are assinged
        pascal[i][0]=1;
            pascal[i][i]=1;  // pascal of arr[i][i]=1 and arr[i][0]=1
            for(int j=1;j<i;j++){  
                pascal[i][j]=pascal[i-1][j]+pascal[i-1][j-1];  // pascal triangle definition
            }

        }
        printArray(pascal);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the number of rows for array 1: ");
        // int r1=sc.nextInt();
        // System.out.print("Enter the number of columns for array 1: ");
        // int c1=sc.nextInt();
        // int arr1[][]=new int [r1][c1];// array 1
        // // System.out.print("Enter the number of rows for array 2: ");
        // // int r2=sc.nextInt();
        // // System.out.print("Enter the number of columns for array 2: ");
        // // int c2=sc.nextInt();
        // // int arr2[][]=new int [r2][c2];   // array 2
        // System.out.println("Enter the elements of array 1");
        // inputArray(arr1);
        // // System.out.println("Enter the elements of the array 2");
        // // inputArray(arr2);
        // System.out.println("Array 1 ->");
        // printArray(arr1);
        // // System.out.println("Array 2 ->");
        // // printArray(arr2);
        // // rotateacw90(arr1);
        // rotatecw90(arr1);
        System.out.println("Enter the number of rows: ");
        int n=sc.nextInt();
        pascalTriangle(n);
    }
    
}
