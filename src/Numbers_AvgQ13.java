import java.util.Scanner;

//13. Write a Java program that takes three numbers as input to calculate and
// print the average of the numbers.
public class Numbers_AvgQ13 {//class
    public static void main(String[] args) {//Main method
        Scanner num = new Scanner(System.in);//object

        System.out.println("Input first number");//Print statement
        int num1 = num.nextInt();// variable declaration
        System.out.println("Input second number");//Print statement
        int num2 = num.nextInt();// variable declaration
        System.out.println("Input third number");// Print statement
        int num3 = num.nextInt();// variable declaration

        System.out.println("Average of 3 numbers is:   " +
        (num1 + num2 + num3)/ 3);//Final result calling statement
    }
}
