import java.util.*;
public class lecture_23 {
    static void input(int arr[][]){
        System.out.println("Input Array");
        Scanner sc = new Scanner(System.in);
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void print(int arr[][]){
        System.out.println("Array");
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void prefixSum1(int arr[][]){  // making prefix sum array adding columns of a row
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
    }
    static void prefixSum2(int arr[][]){ // making prefix sum array adding row of a single column
        int r=arr.length;
        int c=arr[0].length;
        for(int i=1;i<r;i++){
           for(int j=0;j<c;j++){
            arr[i][j]+=arr[i-1][j];
           }
        }
    }
    static void prefixSumFinal(int arr[][]){  // sum of the matrix using sum1 and sum2. Sum of coordinates(r,c)-(0,0)
        prefixSum1(arr);
        prefixSum2(arr);
        print(arr);
    }

    static void queryprefixSum(int arr[][], int query){ // query on prefix sum of matrix
        Scanner sc=new Scanner(System.in);
        int r=arr.length;
        int c=arr[0].length;
        // arr is changed to prefix sum matrix
        for(int i=0;i<r;i++){
            for(int j=1;j<c;j++){
                arr[i][j]+=arr[i][j-1];
            }
        }
        // query are asked
        for(int q=0;q<query;q++){
            System.out.println("Enter coordinate of starting point");
            int a1=sc.nextInt();
            int b1=sc.nextInt();
            System.out.println("Enter the coordinates of end point");
            int a2=sc.nextInt();
            int b2=sc.nextInt();
            int sum=0;
            if(b1>0){
            for(int i=a1;i<=a2;i++){
                int colsum=arr[i][b2]-arr[i][b1-1];// sum of single column
                sum+=colsum;// sum of all prefix sum of all columns
            }
        } else{ // condition is made if b1=0 then index out of bounds
            for(int i=a1;i<=a2;i++){
                int colsum=arr[i][b2]-0;// sum of single column
                sum+=colsum;
            }

        }
            System.out.println(sum);// sum is printed
        }
       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c=sc.nextInt();
        int arr[][]=new int [r][c];
        input(arr);
        print(arr);
        queryprefixSum(arr,5);
    }
    
}
