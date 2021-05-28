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
package global.skymind.training.fundamental.ex2;

// variables and data types
public class Ex2_VariablesAndDataTypes {

    /*
    1: Primitive Types
    Under primitive data types, we have numeric and non-numeric.
    Let's start with non-numeric types.
    */
    static void NonNumericPrimitive(boolean bool, int charStart,int charEnd) {

        //1.1: Non-numeric

        //boolean
        System.out.println("The accepted boolean value is " + bool);

        //char (character)
        //Hands-on: change the loop statement to i = 0, i<=65535
        for (int i = charStart; i <= charEnd; i++) {
            char c = (char) i;
            System.out.println(c + " = " + i);
        }
    }

    static void NumericPrimitive(byte b, int i, long l, float f, double d) {

        //1.2: Numeric
        //Here, we demonstrate data types of byte, short, int, long, float and double

        //change any value you like, but must start with "0b"
        System.out.println("Byte binary value: " + b);

        //since range of byte is within short, can directly assign byte as short
        System.out.println("Short value: " + (short) b);

        System.out.println("Integer value: " + i);

        System.out.println("Long value: " + l);

        System.out.println("Float value: " + f);

        System.out.println("Double value: " + d);
    }
    /*
    2: Non-primitive Types
    Any other types which are not included in primitive data types
    are known as non-primitive types.
    String, Arrays and other user-defined types are non-primitive.
    */
    static void NonPrimitiveTypes(String str, int[] array) {

        System.out.println("String: " + str);

        System.out.println("Array: " + /* ENTER YOUR CODE HERE TO PRINT OUT THE ARRAY */);
    }

    public static void main(String[] args) {

        NonNumericPrimitive(true, 90, 100);

        NumericPrimitive((byte) 0b1010, 1_234_567, 987_654_321_123_456_789L, 3.1415f, 6.02e23d);

        NonPrimitiveTypes("Hello Skymind!", new int[] {1, 2, 3});

    }
}
