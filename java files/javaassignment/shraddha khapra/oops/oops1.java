class pen{
    String color;
    String brand;
    String type;
     void features(){
        System.out.println(this.color); // this keyword used for object call
        System.out.println(this.brand);
        System.out.println(this.type);
    }
    pen(){
        System.out.println("qualities of pen"); // non parameterized constructor
    }

}

public class oops1 {
    public static void main(String [] args){
        pen pen1=new pen();
        
        pen1.color="red";
        pen1.brand="win x ten";
        pen1.type="ball pen";
        pen1.features();
        pen pen2=new pen();
        pen2.color="blue";
        pen2.brand="reynolds";
        pen2.type="gel";
        pen2.features();  // function is called this keyword takes the object pen2

    }
    
}
