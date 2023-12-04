import java.util.*;
public class string {
    static void charString(String name){ // reading character at position i 
        for(int i=0;i<name.length();i++){
            char ch=name.charAt(i);
            System.out.println(ch);
         }

    }
    static void comparing(String name1,String name2){ // compare to function of strings
        /*
         it is based on ascii value. it checks the ith character of two strings. whose ascii value is greater that wins.
         if name1>name2 gives +ve value
         if name1<name2 gives -ve value
         if name1=name2 gives 0 value
         */
        if(name1.compareTo(name2)==0){
            System.out.println("Both are equal.");
        }else if(name1.compareTo(name2)>0){
            System.out.println("name1 is greater.");
        } else{
            System.out.println("name1 is smaller than name2.");
        }
    }
    static void substring(String string,int beginning, int ending){  // substring
        // in .substring(beginning , ending index) beginning index is included for printing and ending index is not included in printing
        String substring=string.substring(beginning,ending);
        System.out.println(substring);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name: ");
        String name=sc.nextLine();  
        substring(name,2,5);     
        

    }
    
}
