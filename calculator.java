import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number :");
        Integer num = sc.nextInt();
        System.out.println("Enter the second number :");
        Integer num2 = sc.nextInt();
        System.out.println("Enter the operator");
        sc.nextLine();
        String operator = sc.nextLine();
        if (operator.equals("+")) {
            System.out.println("The result is "+ (num+num2));
        } else if (operator.equals("-")) {
            System.out.println("The result is "+ (num-num2));

        } else if (operator.equals("*")) {
            System.out.println("The result is "+ (num*num2));

        } else if (operator.equals("/")) {
            System.out.println("The result is " +(num/num2));

        } else if (operator.equals("%")) {
            System.out.println("The result is "+ (num%num2));

        }

    }
}
