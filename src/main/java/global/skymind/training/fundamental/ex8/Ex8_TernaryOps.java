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
package global.skymind.training.fundamental.ex8;

import java.util.Scanner;

public class Ex8_TernaryOps {

    public static void main(String[] args) {

        /*
        In Java, ternary operator is the shorthand for if-then-else statement
        Also called an Elvis operator
        Syntax: variable = Expression ? expression1 : expression2

        E.g.
        If Expression is true, expression1 will be assigned to variable
        If Expression is false, expression2 will be assigned to variable
        */
        System.out.println("\n******************** Ternary Operations ********************");
        double speedLimit = 110; //in km/h

        Scanner scanner = new Scanner(System.in);
        System.out.println("Imagine you are driving your dream car, take a look at the speedometer.");
        System.out.println("And enter your vehicle speed (in km/h): ");
        double speed = scanner.nextDouble();

//        String result = /* ENTER YOUR CODE HERE */ "Slow down!" /* ENTER YOUR CODE HERE */ "You are within speed limit.";
//        System.out.println(result);


    }

}
