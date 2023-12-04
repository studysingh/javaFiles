import java.util.*;
import java.util.Arrays;
public class lecture_15{
    public static void printArray(int arr []){  /*Printing array */
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
    }
    public static void inputArray(int arr[]){          /*Taking array as input */
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<arr.length;i++){
            System.out.print("Enter the element: ");
            arr[i]= sc.nextInt();

        }
        sc.close();
    }
    public static void main(String[] args){
        int arr[] = new int[4];
        inputArray(arr);
         printArray(arr);
       /*  int arr_2[]=arr;
        arr_2[0]=67;
        printArray(arr_2);
        printArray(arr);     // On changing element in arr_2 element also changes in arr. The reason is memory concept
        */
       
        /*  int arr_2[]=arr.clone();  // clone method to reflect change only in the changed element's array
        arr_2[2]=67;
        System.out.println("Array 2 after changing value of element 2 ");
        printArray(arr_2);
        System.out.println("Original Array after changing value of element 2 ");
        printArray(arr);*/
        
        /*int arr_2[]=Arrays.copyOf(arr, 3);   //No change reflection using method copyOf of Arrays class 
        arr_2[1]=76;
        arr[0]=736;
        System.out.println("Array 2");  // changes reflect only in specified array
        printArray(arr_2);
        System.out.println("Arr");   // changes reflect only in specified array
        printArray(arr);*/

        /*copyOfRange method of Arrays class */
       /*  int arr_2[]=Arrays.copyOfRange(arr,2,4); // copy element 2 and 3 only
        printArray(arr_2); */
        Arrays.sort(arr);
        System.out.println("Sorted array");
        printArray(arr);
        
        


    }
}