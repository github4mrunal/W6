/*
4. Write a Java programme using the following steps.
4.1 Declare two instance and two static variables.
4.2 Declare one instance method.
4.3 Declare one static method.
4.4 Call all four instance and static variables into both instance and static methods inside the  print statement.
4.5 Declare the Main method.
4.6 Call both instance and static methods into the Main method and run the programme.
*/
public class StaticInstance2Q4 {

    String name = "J";// instance variable
    String name1 = "A";// 2nd instance variable
    static String name3 = "V";// static variable
    static String name4 = "A";//2nd  static variable

    void a1(){// instance method
        System.out.println(name);//calling instance variable
        System.out.println(name1);//calling instance variable
        StaticInstance2Q4 mp = new StaticInstance2Q4();// object creation
        System.out.println(mp.name3);//calling static variable
        System.out.println(mp.name4);//calling static variable



    }

    static void a2(){//static method
        StaticInstance2Q4 mm = new StaticInstance2Q4();// object creation
        System.out.println(mm.name);//calling instance variable
        System.out.println(mm.name1);//calling instance variable
        System.out.println(name3);//calling static variable
        System.out.println(name4);//calling static variable

            }

    public static void main(String[] args) {//main method
        StaticInstance2Q4 mp1 = new StaticInstance2Q4();//creating object
        mp1.a1(); //calling instance method
        a2();// calling static method
    }
}
