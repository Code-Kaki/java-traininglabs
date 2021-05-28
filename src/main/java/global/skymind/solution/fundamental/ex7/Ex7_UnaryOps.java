package global.skymind.solution.fundamental.ex7;

public class Ex7_UnaryOps {

    public static void main(String[] args) {

        /*
        In Java, unary operators are used with one operand.
        Here, we demonstrate unary operators like "+", "-", "++", "--" and "!".
        */

        double var1 = 1;
        boolean var2 = true;

        System.out.println("\n******************** Unary Operations ********************");
        System.out.println("var1 is " + var1 + ", var2 is " + var2);

        // "+" aka unary plus demonstration is skipped as numbers are positive by default
        System.out.println(" (+) aka unary plus demonstration is skipped as numbers are positive by default");

        // demonstrate "-" aka unary minus
        System.out.println("-var1 is" + -var1);

        // demonstrate "++" aka increment operator
        System.out.println("++var1 is " + ++var1);
        System.out.println("var1++ before increment is " + var1++);
        System.out.println("var1++ after increment is " + var1);

        // demonstrate "--" aka decrement operator
        System.out.println("--var1 is " + --var1);
        System.out.println("var1-- before decrement is " + var1--);
        System.out.println("var1-- after decrement is " + var1);

        // demonstrate "!" aka logical complement operator which inverts value of boolean
        System.out.println("!var2 is " + !var2);


    }

}
