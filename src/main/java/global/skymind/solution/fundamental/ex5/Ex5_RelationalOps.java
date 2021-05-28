package global.skymind.solution.fundamental.ex5;

public class Ex5_RelationalOps {

    public static void main(String[] args) {

        /*
        In Java, the relationship between two operands can be checked using relational
        operators. Here, we demonstrate relational operators like "==", "!=", "<",
        ">", ">=" and "<=".
        */

        double var1 = 1;
        double var2 = 1;

        System.out.println("\n******************** Relational Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2);

        // demonstrating "==" aka equal
        System.out.println("var1 == var2 is " + (var1 == var2));

        // demonstrating "!=" aka not equal
        System.out.println("var1 != var2 is " + (var1 != var2));

        // demonstrating "<" aka less than
        System.out.println("var1 < var2 is " + (var1 < var2));

        // demonstrating ">" aka greater than
        System.out.println("var1 > var2 is " + (var1 > var2));

        // demonstrating "<=" aka less than or equal to
        System.out.println("var1 <= var2 is " + (var1 <= var2));

        // demonstrating ">=" aka greater than or equal to
        System.out.println("var1 >= var2 is " + (var1 >= var2));
    }

}
