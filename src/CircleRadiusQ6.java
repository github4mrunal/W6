//6. Write a program to enter any radius value of the circle and find out the  area.
// (Formula of Area A=PI*r*r).
import java.util.Scanner;//java utility

public class CircleRadiusQ6 {//class name

public static void main(String[]args){// main method
        double area,radius;//datatype
        Scanner input = new Scanner(System.in);// object created
    System.out.println("Enter the radius of circle");// Print statement
    radius = input.nextDouble();//formula given
 //   input.close();
    area = Math.PI * radius * radius;// circle area formula
    System.out.println("Area of the circle is " +area);// Print statement

        }
    }

