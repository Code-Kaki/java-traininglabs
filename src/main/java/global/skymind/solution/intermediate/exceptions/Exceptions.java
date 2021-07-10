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

import java.io.*;

/*
===============================
Type of Built-in Java Exception
===============================

01. ArithmeticException
02. ArrayIndexOutOfBoundsException
03. ClassNotFoundException
04. FileNotFoundException
05. IOException
06. InterruptedException
07. NoSuchFieldException
08. NoSuchMethodException
09. NullPointerException
10. NumberFormatException
11. RuntimeException
12. StringIndexOutOfBoundsException
 */

public class Exceptions {
    public int divideBy0(int a, int b) throws ArithmeticException {
        return a / b;
    }

    public int indexOutOfRange(int[] arr) throws IndexOutOfBoundsException {
        return arr[99];
    }

    public String noClassFound(String classname) throws ClassNotFoundException {
        return Class.forName(classname).toString();
    }

    public void readInvalidFile(String filename) throws FileNotFoundException {
        FileReader reader = new FileReader(filename);
    }
}
