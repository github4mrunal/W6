/*
Write a program to insert any temperature value in degree Fahrenheit and  convert to degree Celsius
((F − 32) × 5/9 = 0°C).
 */
import java.util.Scanner;

public class TemperatureQ7 {//class
    public static void main(String[] args) {//main method

        Scanner Temp = new Scanner(System.in);//scanner object
        System.out.println("Enter the temperature in Fahrenheit");//print statement

        double fahrenheit = Temp.nextDouble();//variable declaration;
        double celsius = (( 5 *(fahrenheit - 32.0)) / 9.0);//variable declaration

        System.out.println(fahrenheit + " degree Fahrenheit is equal to " + celsius + " in Celsius");//print statement

    }
}
