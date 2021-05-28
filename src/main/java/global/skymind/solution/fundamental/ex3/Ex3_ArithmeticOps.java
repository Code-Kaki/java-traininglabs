package global.skymind.solution.fundamental.ex3;

public class Ex3_ArithmeticOps {

    public static void main(String[] args) {

        /*
        In Java, the simplest and most common arithmetic operators are "+", "-", "*",
        "/" and "%".
        */

        double var1 = 1;
        double var2 = 2;

        System.out.println("\n******************** Arithmetic Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2);
        double var3 = 0;

        //demonstrating "+" aka addition
        var3 = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + var3);

        //demonstrating "-" aka subtraction
        var3 = var1 - var2;
        System.out.println(var1 + " - " + var2 + " = " + var3);

        //demonstrating "*" aka multiplication or product
        var3 = var1 * var2;
        System.out.println(var1 + " * " + var2 + " = " + var3);

        //demonstrating "/" aka division
        var3 = var1 / var2;
        System.out.println(var1 + " / " + var2 + " = " + var3);

        //demonstrating "%" aka modulus or remainder
        var3 = var1 % var2;
        System.out.println(var1 + " % " + var2 + " = " + var3);

    }

}
