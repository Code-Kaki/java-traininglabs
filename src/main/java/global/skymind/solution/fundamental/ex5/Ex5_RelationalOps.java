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
package global.skymind.solution.fundamental.ex5;

public class Ex5_RelationalOps {

    public static void main(String[] args) {

        /*
        In Java, the relationship between two operands can be checked using relational
        operators. Here, we demonstrate relational operators like "==", "!=", "<",
        ">", ">=" and "<=".
        */

        double var1 = 1;
        double var2 = 1;

        System.out.println("\n******************** Relational Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2);

        // demonstrating "==" aka equal
        System.out.println("var1 == var2 is " + (var1 == var2));

        // demonstrating "!=" aka not equal
        System.out.println("var1 != var2 is " + (var1 != var2));

        // demonstrating "<" aka less than
        System.out.println("var1 < var2 is " + (var1 < var2));

        // demonstrating ">" aka greater than
        System.out.println("var1 > var2 is " + (var1 > var2));

        // demonstrating "<=" aka less than or equal to
        System.out.println("var1 <= var2 is " + (var1 <= var2));

        // demonstrating ">=" aka greater than or equal to
        System.out.println("var1 >= var2 is " + (var1 >= var2));
    }

}
