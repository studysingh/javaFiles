/*public class introductionToOOps {  // creating class
    int age = 24;  // attribute/method in class
    public static void main(String[] args){
        introductionToOOps Rohan = new introductionToOOps();  // creating object Rohan
        System.out.println(Rohan.age);  // calling method or attribute by using object.attribute

    }
    
}*/

/*class student{
    String name;
    int rollNo;
    int age;
}
public class introductionToOOps{
    public static void main(String[] args) {
        student obj1 = new student();
        System.out.println(obj1.name); // no assigned value so prints null for string
        System.out.println(obj1.rollNo); // no assigned value so prints 0 for int 
        System.out.println(obj1.age);  // no assigned value so prints 0 for int
    }
}*/

class student{
    String name;
    int rollNo;
    int age;
    char grade;
}
public class introductionToOOps{
    public static void main(String[] args) {
        student obj1 = new student();
        obj1.age=34;
        obj1.name= "Sandeep Singh";  // defined the attribute or method
        obj1.rollNo=32;
        System.out.println(obj1.name);
        System.out.println(obj1.rollNo);
        System.out.println(obj1.age);
        System.out.println(obj1.grade);  // default character used is whitespace
        student obj2 = new student();
        obj2.name= "Sandhyala Karthik"; // created multiple object
        obj2.age=53;
        obj2.rollNo = 3;
        System.out.println(obj2.name);
        System.out.println(obj2.rollNo);
        System.out.println(obj2.age);

    }
}