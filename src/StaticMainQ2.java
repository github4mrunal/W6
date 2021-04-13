/* 2. Write a Java programme using the following steps.
2.1 Declare two static variables
2.2 Declare one static method
2.3 Call both static variables into the static method inside the print statement. 2.4 Declare the Main method.
2.5 Call the static method into the Main method and Run the programme.
*/

public class StaticMainQ2 {//2.1 class
    static String name = "Hello";//static variable
    static String name1 = "World";//static variable


    static void m1(){// 2.2static method
        System.out.println(name);//calling static method
        System.out.print(name1);// calling static method

    }

    public static void main(String[] args) {//2.3 main method
       // System.out.print(name);//calling static method into main method
        //System.out.println(name1);//calling static method into main method
        m1();//2.4calling static method
    }
}