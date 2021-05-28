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
