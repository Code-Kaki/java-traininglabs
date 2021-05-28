package global.skymind.solution.fundamental.ex4;

public class Ex4_AssignmentOps {

    public static void main(String[] args) {
        /*
        In Java, the simplest and most common assignment operators are the equal sign "=".
        Here, we demonstrate more advanced assignment operators like "+=", "-=", "*=",
        "/=" and "%=" by combining "=" with arithmetic operators.
        */

        double var1 = 1;
        double var2 = 2;
        double var3 = 2;

        if (var2 != var3) {
            System.out.println("Note: var2 and var3 must be same. Execution halted.");
        } else {
            System.out.println("\n******************** Assignment Operations ********************");
            System.out.println("var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3);
            double var4 = var2;
            double var5 = var3;

            //demonstrating "+=", which means assigning sum of var1 and var2 into var2
            var2 = var2 + var1;
            //above expression is similar to the following shorthand
            var3 += var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "-="
            var2 = var2 - var1;
            //above expression is similar to the following shorthand
            var3 -= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "*="
            var2 = var2 * var1;
            //similar to the following shorthand
            var3 *= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "/="
            var2 = var2 / var1;
            //above expression is similar to the following shorthand
            var3 /= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);

            var2 = var4;
            var3 = var5;
            //demonstrating "%="
            var2 = var2 % var1;
            //above expression is similar to the following shorthand
            var3 %= var1;
            System.out.println("var2 = " + var2 + ", var3 = " + var3);
        }
    }
}
