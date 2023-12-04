import java.util.*;
public class rough{
    static int[][] matrix_multiplication(int arr[][], int a[][]){
        int r1=arr.length;
        int c1=arr[0].length;
        int c2=a[0].length;
        int ans[][]=new int[r1][c2];
        for(int i=0;i<r1;i++){
            for(int j=0;j<c2;j++){
                int sum=0;
                for(int k=0;k<c1;k++){
                    sum+=arr[i][k]*a[k][j];
                }
                ans[i][j]=sum;
            }
        }

        return ans;
    }
    // taking input
    static void input(int arr[][]){
        Scanner sc = new Scanner(System.in);
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    // printing matrix
    static void print(int arr[][]){
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();
    }
    // pascal triangle
    static void pascal_triangle(int n){
        int arr[][]=new int[n][];
        for(int i=0;i<n;i++){
            arr[i]=new int[i+1];
            arr[i][0]=1;
            arr[i][i]=1;
            for(int j=1;j<i;j++){
                arr[i][j]=arr[i-1][j]+arr[i-1][j-1];
            }
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
        System.out.println();
        return;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        pascal_triangle(n);
    }
}