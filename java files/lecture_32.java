import java.util.*;
public class lecture_32 {
    static void printArray(int arr[],int i){  // printing array
        if(i==arr.length){
            return;
        }
        System.out.print(arr[i]+" ");
        printArray(arr,i+1);
    }
   static void inputArray(int arr[],int i){  // input array
    if(i==arr.length){
        return;
    }
    Scanner sc = new Scanner(System.in);
    arr[i]=sc.nextInt();
    inputArray(arr,i+1);
   }
   static int maxArray(int arr[], int idx){ // finding maximum of Array
    // Base condition
    if(idx==arr.length-1){
        return arr[idx];
    }
    // self work 
    return Math.max(arr[idx],maxArray(arr,idx+1)); // maxArray(arr,idx+1) will be provided by recursion
   }
   static int sumArray(int arr[], int idx){ // printing sum of elements of array
    // Base Condition
    if(idx==arr.length){
        return 0;
    }
    // self work
    return arr[idx]+sumArray(arr,idx+1); // sumArray(arr,idx+1) will be given by recursion

   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of array: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
        inputArray(arr,0);
        printArray(arr,0);
        System.out.println("\n"+sumArray(arr,0));
    }
}
    
}
