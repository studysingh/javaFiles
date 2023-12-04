import java.util.*;
import java.util.Arrays;
public class ProblemsOnArrays1 {
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
    public static void ques1(int arr[], int x){   // absolute difference equal to x question 1
        boolean check=true;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(Math.abs(arr[i]-arr[j])==x){
                    check=true;
                    System.out.println(check);
                    return;
                } 

            }
        }
        System.out.println("false");
    }
    public static void ques3(int arr[]){    //question 3 finding missed element
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=i+1){
                System.out.println("Missed element is "+(i+1));
                return;
            }
        }
        System.out.println("No element is missing.");
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n= sc.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        printArray(arr);
        ques3(arr);
    }
    
}
