import java.util.*;
import java.util.Arrays;
public class problemsOnArrays3 {
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
    public static boolean ques1(int arr[],int m){  // question 1
        Arrays.sort(arr);
        int count =0;
        boolean check=true;
        int n=arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]!=arr[i-1]){
                count++;
            }
        }
        if((count+1)>=m){  //comparison b/w m and unique elements
            check=true;
        } else{
            check=false;
        }
    return check;
    }
    public static int countSubarrays(int arr[]){ // note that here we have taken only consecutive sequence sum question2
        int count=0;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            sum=arr[i];
            if(sum%2==1){// odd sum condition for only 1 element
                count++;
            }
            for(int j=i+1;j<arr.length;j++){
                sum+=arr[j];
                if(sum%2==1){// odd sum condition for more than 1 element
                    count++;
                }
            }
        }
        return count;
    }
    public static void maxArea(int arr[]){ // Finding maximum area where length is given as a function of i Question 3
        int ans=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                int l=Math.min(arr[i],arr[j]); //length
                int b=j-i; // breadth
                int area=l*b;
                if(ans<area){
                    ans=area;
                }
            }
        }
        System.out.println(ans);
    }
    public static void ques4(int arr[],int TargetSum){  //Target sum if array is given in non-decreasing order
        int i=0,j=arr.length-1, sum=-1;// two opposite pointers
        while(i<j){
            sum=arr[i]+arr[j];
            if(sum>TargetSum){
                j--;
            } else if(sum<TargetSum){
                i++;
            } else if(sum==TargetSum){
                System.out.println(++i+" "+ ++j);
                break;
            }
        }
        if(sum!=TargetSum){
            System.out.println(sum);
        }
    }
    public static int [] ques5(int arr[]){ // Arranging square array of an array given in non decreasing order
        int i=0,j=arr.length-1;
        int ans[] = new int [arr.length];
        int k=arr.length-1;
        while(i<j&&k>=0){
            if(Math.abs(arr[i])>Math.abs(arr[j])){
                ans[k]=arr[i]*arr[i];
                i++;
            } else if (Math.abs(arr[i])<=Math.abs(arr[j])){
                ans[k]=arr[j]*arr[j];
                j--;
            }
            k--;
        }
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the length of Array: ");
        int n=sc.nextInt();
        int arr[]=new int[n];
        inputArray(arr);
        printArray(arr);
        int ans[]=ques5(arr);
        printArray(ans);

    }
    
}
