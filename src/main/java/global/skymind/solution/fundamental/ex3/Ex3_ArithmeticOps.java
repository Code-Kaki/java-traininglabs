package global.skymind.solution.fundamental.ex3;
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
public class Ex3_ArithmeticOps {

    public static void main(String[] args) {

        /*
        In Java, the simplest and most common arithmetic operators are "+", "-", "*",
        "/" and "%".
        */

        double var1 = 1;
        double var2 = 2;

        System.out.println("\n******************** Arithmetic Operations ********************");
        System.out.println("var1 = " + var1 + ", var2 = " + var2);
        double var3 = 0;

        //demonstrating "+" aka addition
        var3 = var1 + var2;
        System.out.println(var1 + " + " + var2 + " = " + var3);

        //demonstrating "-" aka subtraction
        var3 = var1 - var2;
        System.out.println(var1 + " - " + var2 + " = " + var3);

        //demonstrating "*" aka multiplication or product
        var3 = var1 * var2;
        System.out.println(var1 + " * " + var2 + " = " + var3);

        //demonstrating "/" aka division
        var3 = var1 / var2;
        System.out.println(var1 + " / " + var2 + " = " + var3);

        //demonstrating "%" aka modulus or remainder
        var3 = var1 % var2;
        System.out.println(var1 + " % " + var2 + " = " + var3);

    }

}
