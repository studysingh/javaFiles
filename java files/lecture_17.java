import java.util.*;
 class rotateclock{  // this class contains rotating function my method bakwas
    public int [] rotation(int arr[], int k){
        int i=0,ans[] = new int [arr.length];
        while(i+k<arr.length){
            ans[i]=arr[i+k];
            i++;
        } 
        while(i+k<2*arr.length && i+k>=arr.length&&i<arr.length){
            ans[i]=arr[i+k-arr.length];
            i++;
        }


        return ans;
    }
    public int[] rotational(int arr[] , int k){  // our main hero
        int ans[] = new int[arr.length];
        if(k<=arr.length){
           ans = rotation(arr,k);
        } else{
            k=k%arr.length;
           ans= rotation(arr,k);
        }
        return ans;
    }
}
public class lecture_17{
    public static void swap(int a, int b){    // swaping two numbers
        System.out.println("a: "+a+" b: "+b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("a: "+a+" b: "+b);
    }
    public static void inputArray(int arr[]){  // taking array input
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.println("Enter: ");
            arr[i]=sc.nextInt();
        }
    }
    public static void printArray(int arr[]){  // printing array
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" \t");
        }
        System.out.println();
    }
    public static int[] reverseArray(int arr[]){    // reversing array using another array
        int j=0;
        int reversedArray[] = new int[arr.length];// new array is taken
        for(int i=arr.length-1;i>=0;i--){
            reversedArray[j++]=arr[i];
        }
        return reversedArray;

    }
    public static void swapArray(int[] arr, int i, int j){// swaping arrray elements
        arr[i]=arr[i]+arr[j];
        arr[j]=arr[i]-arr[j];  // arr[i]
        arr[i]=arr[i]-arr[j];  // arr[j]
    }
    public static int[] reverse(int arr[],int startingIndex, int endIndex){  // reversing array elements using swapArray method
        while(startingIndex<endIndex){
            swapArray(arr,startingIndex,endIndex);
            startingIndex++;endIndex--;
        }
        return arr;
    }
    public static int[] rotateInPlace(int arr[],int k){  // rotating array k times in place 
        int n=arr.length;
        k=k%n;
        reverse(arr,0,n-k-1);
        reverse(arr,n-k,n-1);
        reverse(arr,0,n-1);
       
        return arr;
    }
    public static int[] reversingArray(int arr[]){   // reversing array using swaping concept and no inclusion of other array
        int i=0,j=arr.length-1;
        while(i<j){  // condition 
            arr[i]=arr[i]+arr[j];
            arr[j]=arr[i]-arr[j];
            arr[i]=arr[i]-arr[j];
            i++;j--;
        }
        return arr;

    }
    public static int[] rotateArray(int arr[], int k){ // array rotation using new array ans
        int j=0, n=arr.length;
        k=k%n;
        int ans[] = new int[n];
        for(int i=k;i<n;i++ ){
            ans[j++]=arr[i];
        }
        for(int i=0;i<k;i++){
            ans[j++]=arr[i];
        }
    return ans;
    }
    public static int[] makeFrequencyArray(int []arr){  // query asking questions are solved by making frequency table
        int freqArray[] = new int[100005]; // it is given that in the question no number is greater than 100000
        int i=0;
        while(i<arr.length){
            freqArray[arr[i]]++;
            i++;
        }
        return freqArray;
    }
    public static int[] merge(int a[], int b[]){  // merging two arrays
        int m=a.length;
        int n= b.length;
        int ans[]=new int[m+n];
        int j=0;
        for(int i =0;i<m;i++){
            ans[j++]=a[i];
        }
        for(int i =0;i<n;i++){
            ans[j++]=b[i];
        }
        return ans;
    }
    public static void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of Array: ");
        int n= sc.nextInt();
        int arr[]= new int[n];
        inputArray(arr);
        printArray(arr);
        // System.out.print("How many times you want to rotate: ");
        // int k= sc.nextInt();
        // int reversed[]=reverseArray(arr);
        // printArray(reversed);
        // int ans[]=reversingArray(arr);
        // printArray(ans);
        // System.out.print("Enter a: ");
        // int a=sc.nextInt();
        // System.out.print("Enter b: ");
        // int b=sc.nextInt();
        // swap(a,b);
       
       
        // rotateclock obj= new rotateclock();
        // int rota[] = obj.rotational(arr,k);
        // printArray(rota);
        // int rota[]=rotateArray(arr,k);
        // printArray(rota);
        // int ans[] = rotateInPlace(arr,k);
        // printArray(ans);

        // System.out.println("Enter the no. of query: ");
        // int q=sc.nextInt();
        // int ans[] = makeFrequencyArray(arr);
        // int i=0;
        // while(i<q){
        //     System.out.println("Enter the number to be searched");
        //     int qn=sc.nextInt();
        //     if(ans[qn]>0){
        //         System.out.println("yes "+ans[qn]+" times");
        //     } else{
        //         System.out.println("No");
        //     } 
        //     i++;
        // }
    }      
}