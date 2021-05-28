/*
 * Copyright (c) 2020-2021 Skymind Education Group Sdn. Bhd.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.

 * SPDX-License-Identifier: Apache-2.0
 */
package global.skymind.training.fundamental.ex14;

import java.util.ArrayList;

public class Ex14_DoWhileLoop {

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

        // define a counter
        int printCounter4While = 0;
        int printCounter4DoWhile = 0;

        // Let's try printing the first element using a while loop
        System.out.println("============While loop=================");
        while (printCounter4While < 0) {
            System.out.println(/* ENTER YOUR CODE HERE */);
            printCounter4While++;
        }

        // Let's use a do-while loop to do the same thing
        System.out.println("============Do While loop=================");
        do {
            System.out.println(progLangJobs.get(printCounter4DoWhile));
            printCounter4DoWhile++;
        } while (/* ENTER YOUR CODE HERE */);

        /*
        Do you notice the difference? What did you managed to observe in this example?
         */


    }

}
