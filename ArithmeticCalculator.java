import java.util.Scanner;
public class ArithmeticCalculator {
public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        float a;
        float b;
        float result;
        System.out.println("Enter first number : ");
        a=input.nextInt();
        System.out.println("Enter second number : ");
        b=input.nextInt();
        System.out.println("Choose the operation you want to perform: ");
        System.out.println("Choose 1 for ADDITION");
        System.out.println("Choose 2 for SUBTRACTION");
        System.out.println("Choose 3 for MULTIPLICATION");
        System.out.println("Choose 4 for DIVISION");
        int choose;
        choose=input.nextInt();
        switch (choose) {
            case 1:
                result=(a + b);
                System.out.println("Result is" + result);
                break;
            case 2:
                result=(a - b);
                System.out.println("Result is" + result);
                break;
            case 3:
                result=(a * b);
                System.out.println("Result is" + result);
                break;
            case 4:
                if (b > a) {
                    System.out.println("Operation not possible !");
                    break;
                } else {
                    result=a / b;
                    System.out.println("Result is :" + result);
                    break;
                }
        }
    }
}
