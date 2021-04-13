/*
3. Write a Java programme using the following steps.
3.1 Declare one instance and one static variable.
3.2 Declare one instance method.
3.3 Declare one static method.
3.4 Call both instance and static variables into both instance and static methods inside the  print statement.
3.5 Declare the Main method.
3.6 Call both instance and static methods into the Main method and run the programme.

 */
public class Static_InstanceQ3 {//3.1 class
    double x = 10.25;// instance variable
    static double y = 10.50;// static variable

    void m1() {//3.2 instance method
        System.out.println(y);//calling static variable
        System.out.println(x);//calling instance variable
    }

    static void m2() {//3.3 Static method
        System.out.println(y);//calling static variable
        Static_InstanceQ3 obj = new Static_InstanceQ3();//creating object to call instance variable
        System.out.println(obj.x);// calling instance variable


    }

    public static void main(String[] args) {//3.5 Calling main method
        Static_InstanceQ3 obj = new Static_InstanceQ3();//object declared
      //  System.out.println(y);// calling static variable
       // System.out.println(obj.x);// calling instance variable
        obj.m1();// calling instance method
        m2();// calling static method



    }
}