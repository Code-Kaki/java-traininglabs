package global.skymind.solution.fundamental.ex9;

import java.util.Scanner;

public class Ex9_IfElseStatement {

    public static void main(String[] args) {

        /*
        Consider this problem, how do you translate decision making into a
        language which a computer can understand?

        Consider this, write a simple control flow which output:
         1. an even number as "This is an even number."
         2. an odd number as "This is an odd number."
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int inputInt = scanner.nextInt();

        // you can choose to write this in a good-old if-else statement
        System.out.println("=============Using good-old if-else statement.==============");
        if (inputInt % 2 == 0) {
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }

        // or you can use ternary operator to write this if-else statement
        System.out.println("==================Using an Elvis (or ternary) operator.=============");
        String outputStr = (inputInt % 2 == 0) ? "This is an even number." : "This is an odd number.";
        System.out.println(outputStr);

    }

}
