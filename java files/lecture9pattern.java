import java.util.*;
public class lecture9pattern {
    public static void rectangle(){        /*Solid rectangular pattern */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r= sc.nextInt();
        System.out.print("Enter the number of column: ");
        int c= sc.nextInt();
        char ch = '*';
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                System.out.print(ch);
            } System.out.print("\n");
        }
        sc.close();
    }
    public static void hollowRectangle(){       /*Hollow rectangular pattern */
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int r= sc.nextInt();
        System.out.print("Enter the number of column: ");
        int c= sc.nextInt();
        char ch = '*';
        for(int i=1;i<=r;i++){
            for(int j=1;j<=c;j++){
                if(i==1 || j==1 || i==r||j==c){
                    System.out.print(ch);
                } else {
                    System.out.print(" ");
                } 
            } 
            System.out.println();

        }
        sc.close();

    }
    public static void simpleTriangle(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of stars: ");
        int r= sc.nextInt();
        char ch = '*';
        for(int i=1;i<=r;i++){
            for(int j=1;j<=r;j++){
                if(i<=j){      // inverted triangle because i<j if i>j it will be simple triangle
                    System.out.print(ch);
                }
            }
            System.out.println();
    }
    sc.close();
}
                                                        /*Pyramid Pattern */
public static void pyramid(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int r = sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=1;j<=r-i;j++){
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");
        }
        System.out.println();
    }

    sc.close();
}
                                                    /*Invert Pyramid */
public static void invertPyramidPattern(){                                                    
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number of rows: ");
    int r = sc.nextInt();
    for(int i=r;i>=1;i--){  // decreasing loop is to be run
        for(int j=1;j<=r-i;j++){                    // space printing using logic
            System.out.print(" ");
        }
        for(int k=1;k<=2*i-1;k++){
            System.out.print("*");  // star printing using logic
        }
        System.out.println();
    }

    sc.close();
}
// diagonal number printing
public static void number(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number to which you want to print: ");
    int r= sc.nextInt();
    for(int i=1;i<=r;i++){
        for(int j=i;j<=r;j++){
            System.out.print(j);
        }
        for(int j=1;j<=i-1;j++){
            System.out.print(j);
        }
        System.out.println();
    }
    sc.close();
}
                                        /*Numerical Triangular Pattern */
public static void numtri(){
    Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int r= sc.nextInt();
        for(int i=1;i<=r;i++){
            for(int j=1;j<=i;j++){
               System.out.print(j);
                
            }
            System.out.println();
            sc.close();
        }     
}
                                                /*Numerical Pyramidal Pattern */
    public static void numpyr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n= sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int k=1;k<=n-i;k++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k);
            }
            for(int k=i-1;k>=1;k--){
                System.out.print(k);
            }
            System.out.println();
        }
        sc.close();
    }
                                                /*Printing Cross pattern of length n */
public static void cross(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the length of cross");
    int n= sc.nextInt();
    if(n%2!=0){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                if(i==j || i+j==n+1){
                    System.out.print("@");
                } else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    sc.close();

}
                                    /*Printing plus pattern */
public static void plus(){
    int n=5;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n;j++){
            if(i==3 || j==3){
                System.out.print("*");
            } else{
                System.out.print(" ");
            }
        }
        System.out.println();

    }
}
    public static void main(String[] args){
        // rectangle();
        // hollowRectangle();
        // simpleTriangle();
        // pyramid();
        // invertPyramidPattern();
        // number();
        // numtri();
        numpyr();
        // cross();
        // plus();

    }
    
}
