package global.skymind.solution.fundamental.ex6;

public class Ex6_LogicalOps {

    public static void main(String[] args) {

        /*
        In Java, logical operators can be used in decision making - to check expressions.
        Here, we demonstrate logical operators like "&&", "||" and "!".
        */

        double var1 = 1;
        double var2 = 2;
        double var3 = 3;
        double var4 = 4;

        System.out.println("\n******************** Logical Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3 + ", var4 = " + var4);

        // demonstrating "&&" aka Logical AND
        System.out.println("(var1 == var2) && (var3 == var4) is " + ((var1 == var2) && (var3 == var4)));

        // demonstrating "||" aka Logical OR
        System.out.println("(var1 == var2) || (var3 == var4) is " + ((var1 == var2) || (var3 == var4)));

        // demonstrating "!" aka Logical NOT
        System.out.println("!(var1 > var2) is " + !(var1 > var2));
        System.out.println("!(var1 < var2) is " + !(var1 < var2));
    }

}
