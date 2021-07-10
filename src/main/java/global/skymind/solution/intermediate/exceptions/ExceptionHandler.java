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
package global.skymind.solution.intermediate.exceptions;

import java.io.FileNotFoundException;

public class ExceptionHandler {

    public static void main(String[] args) {
        builtInExceptions();
        customExceptions();
    }

    /*
    =============================
    = Handle Built-in Exception =
    =============================
     */

    public static void builtInExceptions() {
        Exceptions exceptions = new Exceptions();
        // Handle Exception with try-catch clause
        try {
            System.out.println(exceptions.divideBy0(10, 0));
        } catch (ArithmeticException e) {
            System.out.println(e + "\n");
        }

        try {
            System.out.println(exceptions.indexOutOfRange(new int[]{1, 2, 3}));
        } catch (IndexOutOfBoundsException e) {
            System.out.println(e + "\n");
        }

        try {
            System.out.println(exceptions.noClassFound("Hello World"));
        } catch (ClassNotFoundException e) {
            System.out.println(e + "\n");
        }

        // Handle Exception with try-catch-finally clause
        try {
            exceptions.readInvalidFile("txt");
        } catch (FileNotFoundException e) {
            System.out.println(e + "\n");
        } finally {
            System.out.println("=======================================");
            System.out.println("Example of built-in exceptions end here");
            System.out.println("=======================================\n");
        }
    }

    /*
    =============================
    = Handle Custom Exception   =
    =============================
     */

    public static void customExceptions() {
        CustomExceptions customExceptions = new CustomExceptions();

        // Handle Exception with try-catch clause
        try {
            System.out.println(customExceptions.checkName(""));
        } catch(NameNotFoundException e) {
            System.out.println(e + "\n");
        }

        try {
            System.out.println(customExceptions.isUpperCase("ABcD"));
        } catch (NotUpperCaseException e) {
            System.out.println(e + "\n");
        }

        try {
            System.out.println(customExceptions.isPalindrome("Hello World"));
        } catch (NotPalindromeException e) {
            System.out.println(e + "\n");
        }

        // Handle Exception with try-catch-finally clause
        try {
            System.out.println(customExceptions.isInteger(10.230));
        } catch (NotIntegerException e) {
            System.out.println(e + "\n");
        } finally {
            System.out.println("=====================================");
            System.out.println("Example of custom exceptions end here");
            System.out.println("=====================================");
        }
    }
}
