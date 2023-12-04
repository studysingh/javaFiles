import java.util.*;
import java.util.Arrays;

import javax.sound.sampled.SourceDataLine;
    
    public class lectture_16{
        public static void inputArray(int arr[],int n){
            Scanner sc = new Scanner(System.in);
            for(int i=0;i<n;i++){
                System.out.println("Enter ");
                arr[i]= sc.nextInt();
            }
    
        }
        public static void printArray(int arr[]){
            System.out.println("Given array");
            for(int i=0;i<arr.length;i++){
                System.out.print(arr[i]+"\t");
            }
            System.out.println();
        }
        public static void targetsummation(int[] arr, int target ){
            int count =0;
            for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                    for(int k=j+1;k<arr.length;k++){
                        if(arr[i]+arr[j]+arr[k]==target){
                            System.out.println(arr[i]+","+arr[j]+","+arr[k]);
                            count++;
                        }
                    }
                }
            }
            System.out.print("The required triplets are: ");
            System.out.println(count);
        }
        public static int Arraymaxima(int arr[]){
        int ans=Integer.MIN_VALUE;{
            for(int i=0;i<arr.length;i++){
                if(arr[i]>ans){
                    ans=arr[i];
                }

            }
            
        }
        return ans;
    }
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the length of array: ");
        int n=sc.nextInt();
        int arr[] = new int[n];
        inputArray(arr,n);
        printArray(arr);
        // System.out.print("Enter the target sum to be found: ");
        // int target=sc.nextInt();
        // System.out.println();
        // targetsummation(arr,target);        
                                            /*Printing 2nd largest value in array */
    //    int a= Arraymaxima(arr);   
    //    for(int i=0;i<arr.length;i++){
    //     if(arr[i]==a){                  // changing maximum to -infinity
    //         arr[i]=Integer.MIN_VALUE;
    //     }
    //    }
    // int second=Arraymaxima(arr);
    // System.out.println(second);
    }
    
    
}

