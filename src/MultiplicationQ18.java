import java.sql.SQLOutput;
import java.util.Scanner;

/*18. Write a Java program to print the sum (addition), multiply, subtract, divide and  remainder of two numbers.
        Test Data:
        Input first number: 125
        Input second number: 24
        Expected Output :
        125 + 24 = 149
        125 - 24 = 101
        125 x 24 = 3000
        125 / 24 = 5
        125 mod 24 = 5
   */
public class MultiplicationQ18 {
    public static void main(String[] args) {
        int mm1, mm2 , add, subtract, mod ,multiply;//variable defined
        int divide;//datatype defined
        Scanner in = new Scanner(System.in);//object defined
        System.out.println("Input first number");//print statement
         mm1 = in.nextInt();//variable defined
        System.out.println("Input second number");//print statement
         mm2 = in.nextInt();//variable defined
        add = mm1 + mm2;//method
        subtract = mm1 - mm2;//method
        multiply = mm1 * mm2;//method
        divide  = mm1 / mm2;//method
        mod = mm1 % mm2;//method

        System.out.println("125 + 24 = " + add);//addition result method calling
        System.out.println("125 - 24 = " + subtract);// subtract result method calling
        System.out.println("125 * 24 = " + multiply);// multiplication method calling
        System.out.println("125 / 24 =  "+ divide);// division method calling
        System.out.println("125 % 24 =  " + mod);//moducles method calling

    }









}
