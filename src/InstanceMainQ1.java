/*1. Write a Java programme using the following steps.
1.1 Declare two instance variables.
1.2 Declare one instance method.
1.3 Call both instance variables into the instance method inside the print statement. 1.4 Declare the Main method.
1.5 Call the above instance method into the Main method and Run the programme.
*/


public class InstanceMainQ1 {//class
    int a = 10; //Instance variable
    Boolean result = true; // Instance variable

void m1(){// instance method
    System.out.println(a);//calling instance method 1
    System.out.println(true);//calling instance method 2
}

    public static void main(String[] args) {// main method
InstanceMainQ1 obj = new InstanceMainQ1();// object created to call Isntance method
        System.out.println(obj.a);//calling variable a
        System.out.println(obj.result);//calling variable b
        obj.m1();// Calling instance method

    }
}
