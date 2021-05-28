package global.skymind.solution.fundamental.ex13;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex13_WhileLoop {

    public static void main(String[] args) {

        /*
        We learnt about for and for-each loop previously and used it to print out each element in an array.
        Remember that we wrote a conditional to check the input before we print out n elements.
        Now what if we want to print each element in an array without specifying the condition to stop?
        That's where while loop comes in.
         */

        // Let's use another example - number of jobs posted on Indeed for each programming language in 2020
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
        Iterator<String> iterator = progLangJobs.iterator();
        // Let's write a while loop to print each element
        while (iterator.hasNext()) // This .hasNext() method returns a boolean (true or false) if next element is present
            System.out.println(iterator.next());

    }

}
