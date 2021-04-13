import com.sun.xml.internal.messaging.saaj.soap.impl.HeaderImpl;

import java.util.Scanner;

/*14. Write a Java program to print the area and perimeter of a rectangle. Test Data:
        Width = 5.5 Height = 8.5
        Expected Output:
        Area is 5.6 * 8.5 = 47.60
        Perimeter is 2 * (5.6 + 8.5) = 28.20
         */
public class AreaofRectangleQ14 {//class
    public static void main(String[] args) {//main method
        float w, d, area, perimeter;//datatype, variable
        Scanner rec = new Scanner(System.in);//scanner object
        System.out.println("Enter the width of the Rectangle");//print statement
        w = rec.nextFloat();//variable datatype token
        System.out.println("Enter the height of the Rectangle");//print statement
        d = rec.nextFloat();//variable datatype token
        perimeter = 2 * (w + d);//variable
        System.out.println("Perimeter of Rectangle is:   "+ perimeter);//print statement
        area = w * d;//variale
        System.out.println("Area of the Rectangle is:  " + area);//final print statement

    }


}
