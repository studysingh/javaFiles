 //1D Array

/*public class lecture14 {
    public static void main(String[] args){
        // int age[] = new int[6];
        int[]age;
        age=new int[6];
        age[0]=8;
        age[1]=6;
        age[2]=12;
        age[3]=32;
        age[4]=54;
        age[5]=5;
        // age[6]=24;  // out of bounds error
        System.out.println(age[3]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        float[]weight=new float [5];
        weight[0]=34.5f;
        weight[1]=785f;
        weight[2]=35.7f;
        weight[3]=34.8f;
        System.out.println(weight[3]);
        System.out.println("the length of the array age and weight are respectively,"+age.length+","+weight.length); // to find the length of array we use arrayname.length.
        }
    
} */

                        // multi dimensional array
/*public class lecture14{
    public static void main(String[] args){
        int[][] det=new int[3][2];
        det[0][0]= (534);
        det[0][1]= (4);
        det[1][0]= (34);
        det[1][1]= (5);
        det[2][0]= (23);
        det[2][1]= (76);
        // det[3][0]= (90);  //  error index out of bounds
        // det[3][1]= (99);
        System.out.println(det[0][0]);
        System.out.println(det[0][1]);
        System.out.println(det[1][0]);
        System.out.println(det[1][1]);
        System.out.println(det[2][0]);
        System.out.println(det[2][1]);
        System.out.println("       "+det.length);
    }
} */



                        //Loop in Arrays



/*import java.util.*;
class printingArrayUsingLoop{   // new class
    public void printFor(){     // method printFor is created
                                                         // we used for loop
        Scanner sc = new Scanner(System.in);

        int[]age=new int[5];
        for(int i=0;i<5;i++){
            System.out.println("Enter the element"+(i+1));
            age[i]=sc.nextInt();

        }
        int i=0;
        while(i<5){
            System.out.println("The elements "+(i+1)+"is "+age[i]);
            i++;
        }
    }
                                                               // For Each Loop
    public void printForEach(){
        Scanner sc = new Scanner(System.in);
        float weight[]=new float[4];
        for(int i=0;i<4;i++){
            System.out.println("enter the weight no."+(i+1));
            weight[i]=sc.nextFloat();
        }
        for(float weights : weight){
            int i=0;
            System.out.println(" "+weights);
            i++;
        }
    }
        
    }
      

public class lecture14{   // public class as file name
    public static void main(String[] args){
    printingArrayUsingLoop forLoop= new printingArrayUsingLoop();  // object is created
        forLoop.printForEach();
        

    }
} */

                        // Use of .length in loops
class arrayLengthinLoops{
    public void length(){
        int x[][]={{4,3,6},{23,5,233},{34,98,9,87}};  // array defined
        for(int i =0;i<x.length;i++){  // rows counted using x[i]
            for(int j=0;j<x[i].length;j++){  // columns counted using x[i].length
                System.out.println(x[i][j]);  // printed 
            }
        }

    }
}           
public class lecture14{
    public static void main(String[] args){
        arrayLengthinLoops x = new arrayLengthinLoops();
        x.length();                                                 // length method called
    }
}             