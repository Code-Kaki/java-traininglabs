package global.skymind.solution.fundamental;

import java.util.ArrayList;

public class Ex16_DoWhileLoop {

    public static void main(String[] args) {
        /*
        We learnt about while loop previously and used it to print out each elements in an array.
        Remember that in while loop, conditionals are checked first before a statement is executed.
        Now what if we want to execute the statement at least once, until the condition is not fulfilled?
        That's where do-while loop comes in.
         */

        // Let's use the previous example - number of jobs posted on Indeed for each programming language in 2020
        // Link: https://www.northeastern.edu/graduate/blog/most-popular-programming-languages/
        ArrayList<String> progLangJobs = new ArrayList<>();

        // Add a few elements
        progLangJobs.add("Python - 19,000 jobs");
        progLangJobs.add("JavaScript - 24,000 jobs");
        progLangJobs.add("Java - 29,000 jobs");
        progLangJobs.add("C# - 18,000 jobs");
        progLangJobs.add("C - 8,000 jobs");
        progLangJobs.add("C++ - 9,000 jobs");
        progLangJobs.add("Go - 1,700 jobs");
        progLangJobs.add("R - 1,500 jobs");
        progLangJobs.add("Swift - 1,800 jobs");
        progLangJobs.add("PHP - 7,000 jobs");

        // We use iterator here to use its .hasNext() method (don't worry about it)
        int printCounter4While = 0;
        int printCounter4DoWhile = 0;

        // Let's try printing the first element using a while loop
        System.out.println("============While loop=================");
        while (printCounter4While < 0) {
            System.out.println(progLangJobs.get(printCounter4While));
            printCounter4While++;
        }

        // Let's use a do-while loop to do the same thing
        System.out.println("============Do While loop=================");
        do {
            System.out.println(progLangJobs.get(printCounter4DoWhile));
            printCounter4DoWhile++;
        } while (printCounter4DoWhile < 0);

        /*
        Do you notice the difference? What did you managed to observe in this example?
         */


    }

}
