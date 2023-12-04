import java.util.*;
import java.util.Arrays;
public class Arrays2 {
    public static void inputArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println();
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static boolean equalArray(int arr1[], int arr2[]){  // question 5
        boolean check =true;
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]==arr2[i]){
                check = true;
            } else{
                check=false;
            }

        }
        return check;
    }
    public static void sumSubArray(int arr[],int S){    //question 4
        for(int i=0;i<arr.length;i++){
            int sum=arr[i];
            if(sum==S){
                System.out.println("The index of the number is "+i);
                return;
            } else{
            for(int j=i+1;j<arr.length;j++){
                sum=sum+arr[j];
                if(sum==S){
                    System.out.println("The starting and ending index are"+i+" "+j);
                return;
                }
            }
            }
        }
    }
    public static int kthsmallest(int arr[], int k){  // question 3
        Arrays.sort(arr);
        return arr[k-1];
        
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array:");
        int n= sc.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        printArray(arr);
        System.out.println("Enter k: ");
        int k=sc.nextInt();
        System.out.println(kthsmallest(arr,k));
    }
    
}
