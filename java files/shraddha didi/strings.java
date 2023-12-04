import java.util.*;
public class strings{
    // reversing a string
    static void reverse_string(String str){
        StringBuilder sb= new StringBuilder(str);
        for(int i=0;i<str.length()/2;i++){ // loop runs only for half string
            // replacing back character by front character and front character by end character
            int front=i;
            int back=str.length()-1-i;
            sb.setCharAt(front, str.charAt(back));
            sb.setCharAt(back, str.charAt(front));   
        }
        System.out.println(sb);
        return;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        reverse_string(str);
        
    }
}