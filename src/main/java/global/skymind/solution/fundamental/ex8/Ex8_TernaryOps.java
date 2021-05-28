package global.skymind.solution.fundamental.ex8;

import java.util.Scanner;

public class Ex8_TernaryOps {

    public static void main(String[] args) {

        /*
        In Java, ternary operator is the shorthand for if-then-else statement
        Also called an Elvis operator
        Syntax: variable = Expression ? expression1 : expression2

        E.g.
        If Expression is true, expression1 will be assigned to variable
        If Expression is false, expression2 will be assigned to variable
        */
        System.out.println("\n******************** Ternary Operations ********************");
        double speedLimit = 110; //in km/h

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imagine you are driving your dream car, take a look at the speedometer.");
        System.out.println("And enter your vehicle speed (in km/h): ");
        double speed = scanner.nextDouble();

        String result = (speed > speedLimit) ? "Slow down!" : "You are within speed limit.";
        System.out.println(result);


    }

}
