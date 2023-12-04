import java.net.SocketTimeoutException;
import java.util.*;
public class problemsOn2DArray {
    static void inputArray(int arr[][]){
        Scanner sc = new Scanner(System.in);
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void printArray(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    static void ques1(int arr[][],int x){
        boolean flag=true;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(arr[i][j]==x){
                    System.out.println(i+" "+j);
                    flag=true;
                    return;
                }
                else{
                    flag=false;
                }
            }
        }
        if(flag==false){
            System.out.println(-1);
        }

    }
    static int [][] ques2(int arr[],int r, int c){
        int k=0;
        int ans[][]=new int [r][c];
        if(r*c==arr.length){
        for(int i=1;i<r;i++){
            for(int j=0;j<c;j++){
           ans[i][j]=arr[k];
           k++;
            }
        }
    }
        return ans;
    }
    static void prefixsum2d(int arr[][]){ // prefix sum of 2d array
        for(int i=0;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        for(int i=1;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                arr[i][j]+=arr[i-1][j];
            }
        }
        System.out.println("Prefix Sum Array->");
        printArray(arr);
    }
    static void ques4(int arr[][]){
      for(int k=0;k<arr.length;k++){
        int i=0;
        int j=arr[0].length-1;
        while(i<j){
            // swaping two elements
            arr[k][i]=arr[k][i]+arr[k][j];
            arr[k][j]=arr[k][i]-arr[k][j];
           arr[k][i]=arr[k][i]-arr[k][j];
           i++;
           j--;
        }
      }
      printArray(arr);
    }
    static int ques3(int arr[][],int r1,int c1,int r2,int c2){ // printing sum from starting coordinates to the ending coordinates
        int ans=0;
        if(r1<arr.length&&r2<arr.length&&c1<arr[0].length&&c2<arr[0].length&&r1<=r2&&c1<=c2){
        for(int i=r1;i<=r2;i++){
            for(int j=c1;j<=c2;j++){
           ans+=arr[i][j];
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
        // System.out.print("Enter the number of rows for array 2: ");
        // int r2=sc.nextInt();
        // System.out.print("Enter the number of columns for array 2: ");
        // int c2=sc.nextInt();
        // int arr2[][]=new int [r2][c2];   // array 2
        System.out.println("Enter the elements of array 1");
        inputArray(arr1);
        // System.out.println("Enter the elements of the array 2");
        // inputArray(arr2);
        System.out.println("Array 1 ->");
        printArray(arr1);
        // System.out.println("Array 2 ->");
        // printArray(arr2);
        System.out.println("Reversed Array->");
        ques4(arr1);
    }
    
}
