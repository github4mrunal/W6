/*9. Write a Java program that takes a number as input and prints its  multiplication table up to 10.
        Test Data: Input a number: 8

 */

import java.util.Locale;//utility locator
import java.util.Scanner;

public class UpperLowerQ9 {//class

    public static void main(String[] args) {//main method


        Scanner n = new Scanner(System.in);//creating object in scanner class
        System.out.println("Enter name in Upper case: ");//print statment to enter your data
        String name = n.next();//syntax for next string

        String a = name.toLowerCase(Locale.ROOT);//call locale predefine systax for lower cases
        System.out.println(a);// print statement  to display result
    }
}