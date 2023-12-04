import java.util.*;

public class lecture_18 {
    public static void inputArray(int arr[]){
        System.out.println("Enter elements of array: ");
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"  ");
        }
        System.out.println();
    }
    public static int count(int arr[],int x){  // counting x in array
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                count++;
            }
        }
        return count;
    }
    public static void swap(int[] arr,int i,int j){   // swaping of array elements
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];// arr[i]
        arr[i]=arr[i]-arr[j];// arr[j]
    }
    public static int[] sort0and1(int arr[]) {                 // sorting of array of 0 and 1 using two pointer
        int left=0,n=arr.length,right=n-1;
        while(left<right){
            if(arr[left]==1&&arr[right]==0){
                swap(arr,left,right);
            }
            else if(arr[left]==0){
                left++;
            }
            else if(arr[right]==1){
                right--;
            }
        }
        
        return arr;
    }       
    public static int[] reverseArray(int arr[]){  // reversing array
        int i=0,j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
        return arr;
    }
    public static void sorteven(int arr[]){   // sorting array into even and odd irrespective of inc. or dec. order two pointer concept
        int left=0,right=arr.length-1;
        while(left<right){
            if(arr[left]%2!=0&&arr[right]%2==0){
                swap(arr,left,right);
            } else if(arr[left]%2==0){
                left++;
            } else if(arr[right]%2!=0){
                right--;
            }
        }
        
    } 

   //ques You are given a non decreasing array . You have to find the square array which will also be in non decreasing order.
    public static int [] ques(int arr[]){  
    int left=0,right=arr.length-1,i=0,ans[]=new int [arr.length];
    while(left<=right){
        if(Math.abs(arr[left])>=Math.abs(arr[right])){
            ans[i++]=arr[left]*arr[left];
            left++;

        } else if(Math.abs(arr[left])<Math.abs(arr[right])){
            ans[i++]=arr[right]*arr[right];
            right--;
        }
    }
    return reverseArray(ans);
   }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter length of array: ");
        int n=sc.nextInt();
        int arr[]= new int[n];
        inputArray(arr);
        printArray(arr);
        // System.out.println("sorted array");
        // printArray(sort0and1(arr));
        // sorteven(arr);
        // printArray(reverseArray(arr));
        printArray(ques(arr));
       

    }
}