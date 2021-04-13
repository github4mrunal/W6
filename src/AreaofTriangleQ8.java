import java.util.Scanner;

//8. Write a program to calculate the area of a triangle
// A= 12bh
public class AreaofTriangleQ8 {//class

    public static void main(String[] args) {//main method
        Scanner Tri = new Scanner(System.in);//object created
        System.out.println("Enter the number to measure area of Triangle");//print statement
        float radius = Tri.nextFloat();//datatype declared
        float height = Tri.nextFloat();//datatype declared
        float area = ( radius*height) / 2 ;// formula

            System.out.println("Area of Triangle is: "+area);//print statement
        }
}


