import java.util.*;
public class ArraysAssignment1 {
    public static void inputArray(int arr[]){
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter: ");
            arr[i]=sc.nextInt();
        }
    }
    public static int[] question1(){
        int arr[] = {1,-1,3,2,-7,-5,11,6};
        int j=0,ans[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=0){
                ans[j++]=arr[i];
            }
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                ans[j++]=arr[i];
            }
        }
        return ans;
    }
    public static void printArray(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
   public static int[] merge(int a[], int b[]){
    int m=a.length;
    int n=b.length;
    int j=0;
    int ans[] = new int[m+n];
    for(int i=0;i<m;i++){
        ans[j++]=a[i];
    }
    for(int i=0;i<n;i++){
        ans[j++]=b[i];
    }
    return ans;
   }
   public static int[] makeFrequency(int arr[]){
    int freq[] = new int [100];
    for(int i=0;i<arr.length;i++){
        freq[arr[i]]++;
    }
    return freq;
   } 
   public static int minimum(int arr[]){     // minimum in an array
    int max=Integer.MAX_VALUE;
    for(int i=0;i<arr.length;i++){
        if(arr[i]<max){
            max=arr[i];
        }
    }
    return max;
   }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int n= sc.nextInt();
        int arr[] = new int[n];
        inputArray(arr);
        printArray(arr);
    //    int ans[]= merge(a,b);
        // printArray(ans);
    }
    
    }
    

