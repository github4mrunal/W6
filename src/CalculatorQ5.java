import java.util.Scanner;//scanner input

/*5. Write a program for a calculator with addition, subtraction, multiplication  and division
 methods all with parameters and use string concatenation methods.
 (Note: Two static and Two instance methods.)
 */
public class CalculatorQ5 {//class
    public static void main(String[] args) {//main method
        float mm1, mm2 , add, subtract, multiply;//variable defined
        float divide;
        Scanner scan1 = new Scanner(System.in);//scanner class object created

        System.out.print("Enter Two Numbers : ");//Print command
        mm1 = scan1.nextFloat();//method of scanner class
        mm2 = scan1.nextFloat();//method of scanner class

        add = mm1 + mm2;//adding functionality of variable
        subtract = mm1 - mm2;// subtract functionality of variable
        multiply = mm1 * mm2;// multiplication functionality of variable
        divide = (float) mm1 / mm2;// division functionality of variable

        System.out.println("Sum = " + add);//addition result method calling
        System.out.println("Difference = " + subtract);// subtract result method calling
        System.out.println("Multiplication = " + multiply);// multiplication method calling
        System.out.println("Division = " + divide);// division method calling

    }
}
