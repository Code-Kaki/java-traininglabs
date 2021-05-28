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
package global.skymind.solution.fundamental.ex10;

import java.util.Scanner;

public class Ex10_SwitchStatement {

    public static void main(String[] args) {

        /*
        Now that we have learnt about if-else statement, consider this problem:
        What if there are 5 inputs? 10 inputs? How do you translate multiple decision making into a
        simpler syntax which a computer can understand?

        Consider this, write a simple control flow which output:
         1. "perodua" when the input is"axia", "aruz" and "myvi"
         2. "proton" when the input is "x50", "saga" and "x70"
         3. "toyota" when the input is "camry", " corolla altis" and "hilux"
         3. "honda" when the input is "city", "civic" and "cr-v"

         Note: The inputs are just for reference. You may change as you like.
         */

        Scanner scanner = new Scanner(System.in);
        System.out.println("Specify a car model:");
        String input = scanner.nextLine();

//        ifElseStatement(input); // comment out if not used

//        inefficientSwitchStatement(input); // comment out if not used

//        efficientSwitchStatement(input); //comment out if not used

    }

    private static void ifElseStatement(String input) {

        //Here, we write an if-else statement for the aforementioned control flow.

        System.out.println("=============Using good-old if-else statement.==============");

        if ((input.equals("myvi")) || (input.equals("axia")) || (input.equals("aruz"))) {
            System.out.println("perodua");
        } else if ((input.equals("x50")) || (input.equals("x70")) || (input.equals("saga"))) {
            System.out.println("proton");
        } else if ((input.equals("camry")) || (input.equals("corolla altis")) || (input.equals("hilux"))) {
            System.out.println("toyota");
        } else if ((input.equals("city")) || (input.equals("civic")) || (input.equals("cr-v"))) {
            System.out.println("honda");
        } else {
            System.out.println("Car model not in database. Please enter another model.");
        }

        /*
        Very lengthy right? What are the other methods we can use to replicate this, but
        with a more readable code?
         */

    }

    private static void inefficientSwitchStatement(String input) {

        // Here, we write an inefficient switch statement for the aforementioned control flow.

        System.out.println("=============Using inefficient switch statement.==============");

        String output = null;
        switch (input) {
            case "myvi":
                output = "perodua";
                break;
            case "axia":
                output = "perodua";
                break;
            case "aruz":
                output = "perodua";
                break;
            case "x50":
                output = "proton";
                break;
            case "x70":
                output = "proton";
                break;
            case "saga":
                output = "proton";
                break;
            case "camry":
                output = "toyota";
                break;
            case "corolla altis":
                output = "toyota";
                break;
            case "hilux":
                output = "toyota";
                break;
            case "city":
                output = "honda";
                break;
            case "civic":
                output = "honda";
                break;
            case "cr-v":
                output = "honda";
                break;
            default:
                output = "Error";
        }
        System.out.println(output);

        /*
        Is this method any different from the lengthy if-else statement? Not really, isn't it?
         */

    }

    private static void efficientSwitchStatement(String input) {

        // Here, we write a more efficient switch statement for the aforementioned control flow.

        System.out.println("=============Using efficient switch statement.==============");

        String output = null;
        switch (input) {
            case "myvi":
            case "axia":
            case "aruz":
                output = "perodua";
                break;
            case "x50":
            case "x70":
            case "saga":
                output = "proton";
                break;
            case "camry":
            case "corolla altis":
            case "hilux":
                output = "toyota";
                break;
            case "city":
            case "civic":
            case "cr-v":
                output = "honda";
                break;
            default:
                output = "Error";
        }
        System.out.println(output);
    }

    /*
    Now this is simpler, more readable and easier to debug, don't you think?
     */

}
