//   ASSIGNMENT LECTURE 4


// Question 1

/*import java.util.*;
public class problems {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = sc.nextLine();
        System.out.print("Enter your Field of Interest: ");
        String field = sc.nextLine();
        System.out.print("Enter your Roll no.: ");
        long roll = sc.nextLong();
        System.out.println("Name: "+name+"\nRoll No. :"+roll+"\nField of Interest:"+field);



        sc.close();
        
}
}*/
  
  // Question 2
  /*import java.util.*;
  public class problems{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.print("Give string 1: ");
        String first = sc.nextLine();
        System.out.print("Give string 2: ");
        String second = sc.nextLine();
        System.out.println(first+second);
        sc.close();
    }
  }*/
   
  // Question 3
  import java.util.*;
  public class problems1{
    public static void main(String[] args){
        Scanner marks = new Scanner(System.in);
        System.out.println("Robert, Enter your marks:");
        int physics,chemistry,maths;
        System.out.print("Physics: ");
        physics= marks.nextInt();
        System.out.print("Chemisty: ");
        chemistry= marks.nextInt();
        System.out.print("Mathematics: ");
        maths= marks.nextInt();
        int total=physics+chemistry+maths;
        double percentage=total/3.0;
        System.out.println("Your total marks are "+total+" out of 300 and percentage is "+percentage+"%.");


        marks.close();


    }
  }