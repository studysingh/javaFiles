import java.util.*;
public class lecture_19 { 
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
    public static int sumArray(int arr[],int k){  // sum of array elements till k th elements
        int sum=0;
        for(int i=0;i<=k;i++){
            sum=sum+arr[i];
        }
        return sum;

    }
    public static int[] prefixSum1(int arr[]){ // prefix sum using sumArray method written above
        int ans[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            ans[i]=sumArray(arr,i);

        }
        return ans;
    }
    public static int [] prefixSum2(int arr[]){  // prefix sum using another array
        int prefix[] = new int [arr.length];
        prefix[0]=arr[0];                                
        for(int i=1;i<arr.length;i++){
            prefix[i]=prefix[i-1]+arr[i];
        }
        return prefix;
    }
    public static int [] prefixSum3(int arr[]){  // finding prefix sum in place
        int j=0;
        arr[j++]=arr[0];
        for(int i=1;i<arr.length;i++){
            arr[j++]=arr[i-1]+arr[i];
        }
        return arr;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

                                         // asking queries on prefix sum
        /*System.out.println("Enter the length of array: ");
        int n= sc.nextInt();
        int arr[] = new int[n+1];
        System.out.println("Enter");
        for(int i=1;i<=n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=1;i<=n;i++){
            System.out.print(arr[i]+"\t");
        }
        int p[]=prefixSum3(arr);
        System.out.println("Enter the number  of queries: ");
        int q=sc.nextInt();
        for(int i=0;i<q;i++){
            System.out.println("Enter the range for sum: ");
            int l=sc.nextInt();
            int r=sc.nextInt();
            int ans=p[r]-p[l-1];
            System.out.println(ans);
        }*/
        String s="Invalid input-operation can't be performed";
        System.out.println(s.length());
       
      
      
    }
    
}
