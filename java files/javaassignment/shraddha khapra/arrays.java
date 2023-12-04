import java.util.*;
public class arrays{
    static void input(int arr[][]){  // input matrix
        int r=arr.length;
        int c=arr[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=sc.nextInt();
            }
        }
    }
    static void print(int arr[][]){ //ṇ printing matrix
        int r=arr.length;
        int c=arr[0].length;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void search(int arr[][],int num){  // searching number in 2D Array
        int r=arr.length;
        int c=arr[0].length;
        boolean flag=true;
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][j]==num){
                    flag=true;
                    System.out.println(i+"  "+j);
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
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int r=sc.nextInt();
        System.out.println("Enter the number of columns: ");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        input(arr);
        print(arr);
        System.out.println("Enter the number to be found: ");
        int num=sc.nextInt();
        search(arr,num);


    }
}