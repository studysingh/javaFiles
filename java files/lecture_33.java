import java.util.*;
import java.util.ArrayList;
public class lecture_33 {
    static void input(int arr[], int idx){
        Scanner sc = new Scanner(System.in);
        if(idx==arr.length){
            return;
        }
        arr[idx]=sc.nextInt();
        input(arr,idx+1);
    }
    static void print(int arr[], int idx){
        if(idx==arr.length){
            System.out.println();
            return;
        }
        System.out.print(arr[idx]+"  ");
        print(arr,idx+1);
    }
    static boolean search(int arr[],int x, int idx){ // finding a number x in array and returning  true and false
        if(idx==arr.length){
            return false;
        }
        // self work 
        if(arr[idx]==x){ 
        return true;
        }
        // self work
        return search(arr,x,idx+1);
    }
    static void searching(int arr[], int x, int idx){ // printing all the index where x is present
        // base condition
        if(idx==arr.length){
            return;
        }
        // self work
        if(arr[idx]==x){
            System.out.println(idx);
        }
        // recursive work
        searching(arr,x,idx+1);
    }
      static ArrayList<Integer> storeIndex(int arr[], int x, int idx){ // storing index of x find after traversing array in the arraylist
       // base condition return empty arraylist
        if(idx==arr.length){
            return new ArrayList<Integer>();
        }
        // self work 
        ArrayList<Integer> ans=new ArrayList<>();
        if(arr[idx]==x){
            ans.add(idx); // ans arraylist stores idx search
        }
        // recursive work
        ArrayList<Integer> smallAns = storeIndex(arr,x,idx+1); // stores the elements after idx element
        ans.addAll(smallAns); // appended elements of smallAns arrayList in ans arrayList
        return ans;

    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements of the array: ");
        int n=sc.nextInt();
        int arr[]=new int [n];
        input(arr,0);
        print(arr,0);
        ArrayList<Integer> ans=storeIndex(arr,5,0);
        System.out.println(ans);
    }
    
}
