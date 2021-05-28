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
package global.skymind.solution.fundamental.ex6;

public class Ex6_LogicalOps {

    public static void main(String[] args) {

        /*
        In Java, logical operators can be used in decision making - to check expressions.
        Here, we demonstrate logical operators like "&&", "||" and "!".
        */

        double var1 = 1;
        double var2 = 2;
        double var3 = 3;
        double var4 = 4;

        System.out.println("\n******************** Logical Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2 + ", var3 = " + var3 + ", var4 = " + var4);

        // demonstrating "&&" aka Logical AND
        System.out.println("(var1 == var2) && (var3 == var4) is " + ((var1 == var2) && (var3 == var4)));

        // demonstrating "||" aka Logical OR
        System.out.println("(var1 == var2) || (var3 == var4) is " + ((var1 == var2) || (var3 == var4)));

        // demonstrating "!" aka Logical NOT
        System.out.println("!(var1 > var2) is " + !(var1 > var2));
        System.out.println("!(var1 < var2) is " + !(var1 < var2));
    }

}
