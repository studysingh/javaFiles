class Student{
    String nam;
    int rol;
   public void printInfo(){
    System.out.println(this.nam);
    System.out.println(this.rol);
   }
   // parameterized constructor
   Student(String name, int roll){ // parameters are passed 
    this.nam=name; // object nam is parameterized          
    this.rol=roll; // object rol is parameterized
   }
}
public class oops2{
    public static void main(String args[]){
        Student s1=new Student("sandeep",76);
        Student s2=new Student("kartik",54);
        s1.printInfo();
        s2.printInfo();
    }
}