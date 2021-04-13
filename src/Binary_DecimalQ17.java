import java.util.Scanner;

/*17. Write a Java program to convert a decimal number to binary number.  Input Data:
      Input a Decimal Number : 5
      Expected Output
      Binary number is: 101
 */
public class Binary_DecimalQ17 {//class
    public static void main(String[] args) {//main method

        Scanner sc=new Scanner(System.in);//Object created in Scanner
        System.out.println("Enter a decimal number");//Print statement
        int n=sc.nextInt();// Datatype token
        int  bin[]=new int[100];//arrays syntax
        int i = 0;//datatype value
        while(n > 0)//loop syntax
        {
            bin[i++] = n%2;
            n = n/2;
        }
        System.out.print("Binary number is : ");//Print statement
        for(int j = i-1;j >= 0;j--)//loop syntax
        {
            System.out.print(bin[j]);//Print statement
        }
    }
}
