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
package global.skymind.training.intermediate.exceptions;

import java.io.FileReader;

public class Ex_1 {
    public static void main(String[] args) {
        /*
        You have learned how to handle various kind of Java Exception and in this exercise,
        you are going to have a practice on how Java Exception. Just as a reminder, you can
        use try-catch clause to handle exception. If you manage to complete all todolist,
        your program should execute without any errors.
         */

        System.out.println("=====================================");
        System.out.println("||             Question 1          ||");
        System.out.println("=====================================");

        // Let's start with reading a file
        // Note that you will not find the file for sure
        String filename = "Unknown.txt";

        // Uncomment and run the following code

//        try {
//            FileReader reader = new FileReader(filename);
//        } catch (/*TODO(ENTER correct exception handling class here)*/) {
//            System.out.println(filename + " is not found");
//        }

        /*
        This is second part of the question
        In this section, you are required to read the 10th character in the array
        Of course, you notice that there are no 10th char in the array
        Therefore, you need to handle the exception to prevent Java runs into error
        Tips: Use the try-catch block as above
        */

        char[] arr = {'a', 'b', 'c'};

        System.out.println(arr[10]);
    }
}
