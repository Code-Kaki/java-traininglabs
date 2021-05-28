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
package global.skymind.training.fundamental.ex9;

import java.util.Scanner;

public class Ex9_IfElseStatement {

    public static void main(String[] args) {

        /*
        Consider this problem, how do you translate decision making into a
        language which a computer can understand?

        Consider this, write a simple control flow which output:
         1. an even number as "This is an even number."
         2. an odd number as "This is an odd number."
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");

        int inputInt = scanner.nextInt();

        // you can choose to write this in a good-old if-else statement
        System.out.println("=============Using good-old if-else statement.==============");
        if (/* ENTER YOUR CODE HERE */) {
            System.out.println("This is an even number.");
        } else {
            System.out.println("This is an odd number.");
        }

        // or you can use ternary operator to write this if-else statement
        System.out.println("==================Using an Elvis (or ternary) operator.=============");
        String outputStr = (inputInt % 2 == 0) ? "This is an even number." : "This is an odd number.";
        System.out.println(outputStr);

    }

}
