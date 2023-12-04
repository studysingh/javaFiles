import java.util.*;
public class stringBuilder {
    static void reversing(String string){
        for(int i=string.length()-1;i>=0;i--){
            System.out.print(string.charAt(i));
        }
    }
    static void ascii(char ch){
        int n=(int)ch;
    }
    static void reverse(String string){
        StringBuilder sb= new StringBuilder(string);
        int n=sb.length();
        for(int i=0;i<n/2;i++)  {
            // we are reversing the character here
            int front=i;
            int back=n-1-i;
            char frontchar=sb.charAt(front);
            char backchar=sb.charAt(back);
            sb.setCharAt(front,backchar);
            sb.setCharAt(back,frontchar);
        }      
        System.out.println(sb);
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string=sc.nextLine();
        StringBuilder sb=new StringBuilder(string);// making class stringbuilder
        System.out.println(sb);
        System.out.println(sb.charAt(2));
        sb.setCharAt(4,'r'); // it is used to replacing a character at index. it requires two parameter index and the character to be placed
        System.out.println(sb);
        // inserting character at ith index shift the remaining string to right
        sb.insert(3,'e');  // require two argument index and the character to be inserted
        System.out.println(sb);
        // deleting substring from beginnig index(inclusive)  to ending index(non inclusive)
        sb.delete(3,7);
        System.out.println(sb);
        // appending(adding) some string to the end 
        sb.append(" kahan hai?");
        System.out.println(sb);
        String name=sc.nextLine();
        reverse(name);
    }
    
}
