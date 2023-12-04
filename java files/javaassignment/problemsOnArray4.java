import java.util.*;
import java.util.Arrays;
public class problemsOnArray4 {
    static void inputArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    static void ques1(int arr[],int m){  // question 1 
        int sumfull=0;
        for(int i=0;i<arr.length;i++){  // sum of whole array
            sumfull+=arr[i];
        }
        int sum=0;
        for(int i=0;i<m;i++){  // sum of m elements of sorted array
            sum+=arr[i];
        }
        System.out.println(Math.abs((sumfull-sum)-sum));  // sum of larger elements - sum of smaller elements
    }
    static void ques2(int arr[]){  // question 2
        int count0s=0;
        for(int i=0;i<arr.length;i++){  // counted 0s
            if(arr[i]==0){
                count0s++;
            }
        }
        int count1s=arr.length-count0s; // count 1s
        int min=Math.min(count0s,count1s);
        if(min==0){   // no 0 or 1 found
            System.out.println(-1);
        }
        else{
            System.out.println(2*min);  // minimum found multiply by 2
        }
    }
    static void ques3(int arr[]){
        int sum=0;
        int n=arr.length;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>ans){
                ans=sum;
            }
        }
        System.out.println("ans "+ans);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        inputArray(arr);
        printArray(arr);
    }
    
}
