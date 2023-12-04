import java.util.*;
class occurence{   // **class occurence to initialize variable first and last as static
    static int first=-1;  // static variables are defined outside of function so that there value is constant in class occurence
    static int last=-1;
 void occurenceOfElement(String str, int i,char element){    // function for finding first and last occurence of an element in string
        if(i>str.length()-1){
            System.out.println("First occurence is "+first+" and last occurence is "+last);
            return;
        }
        if(str.charAt(i)==element){
            if(first==-1){
                first=i;  // updation in first only if it is -1
            } else{
                last=i; // updation in last if first is not -1
            }
        }
        occurenceOfElement(str,i+1,element); // recursion
    }
}
public class recursion2 {
    static void towerOfHanoi(int n,String src, String helper, String destination){  // **tower of hanoi
        if(n==1){
            System.out.println("Move disk "+n+" from "+src+" to "+destination);
            return;
        }
        towerOfHanoi(n-1,src,destination,helper);  // moving from src to helper
        System.out.println("Move disk "+n+" from "+src+" to "+destination);       
        towerOfHanoi(n-1,helper,src,destination); // moving from helper to destination

    }
    static void reverseString(String str, int i){ // **reversing string
        if(i<0){
            return;
        }
        System.out.print(str.charAt(i));
        reverseString(str,i-1);
    }
    static void checkSort(int arr[], int n){ // **checking array is increasingly sorted or not
        int i=n-1; // i always start with its number less than 1
        if(i<=0){  // base condition 
            System.out.println("Sorted");
            return;
        }
        if(arr[i-1]<arr[i]){  // checking incresing or not
        } else {
            System.out.println("Not Sorted"); // if any index counters i we will exit
            return; 
        }
        checkSort(arr,n-1);
    }
    static void moveAllX(String str, int i, int count, String newString){ // **moving all x at the end of the string
        if(i>str.length()-1){  // base condition 
            for(int j=0;j<count;j++){ // adding x at the count condition
                newString+='x';
            }
            System.out.println(newString); // print newstring
            return;
        }
        if(str.charAt(i)=='x'){  // counting x
            count++;
            moveAllX(str,i+1,count,newString);
        } else{
            newString+=str.charAt(i); // adding character from old string to new string if character is not equal to x
            moveAllX(str,i+1,count,newString);
        }
    }
    static boolean flag[]=new boolean[26]; // array of flag storing value as false or true. default value is false
    static void removeDuplicate(String str, String newString, int i){ // **removing duplicate from string
        if(i>str.length()-1){// base condition
            System.out.println(newString);
            return;
        }
        if(flag[str.charAt(i)-'a']==true){// if value is true no operation is performed only recursion will occur
            removeDuplicate(str, newString, i+1);
        } else{// if character found first time value changes to true and adding it to newString
            newString+=str.charAt(i);
            flag[str.charAt(i)-'a']=true;
            removeDuplicate(str, newString, i+1);

        }

    }
    static void subsequence(String str,int i, String newString){ // **printing subsequence in the same order
        if(i>str.length()-1){ // base condition
            System.out.println(newString);
            return;
        }
        char currChar=str.charAt(i); // finding current character at i
        // if come
        subsequence(str, i+1, newString+currChar); 
        //if not come
        subsequence(str, i+1, newString);
    }
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        String str=sc.nextLine();
        subsequence(str,0,"");
    }
}
