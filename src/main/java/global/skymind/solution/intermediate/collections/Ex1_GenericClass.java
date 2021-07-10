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

package global.skymind.solution.intermediate.collections;

/*Like C++, we use <> to specify parameter types in generic class creation. To create objects of generic class, we use following syntax.

To create an instance of generic class:
    BaseType <Type> obj = new BaseType <Type>()

    Note: In Parameter type we can not use primitives like 'int','char' or 'double'.

A Simple Java program to show working of user defined Generic classes*/

// We use < > to specify Parameter type
public class Ex1_GenericClass<T> {

    // An object of type T is declared
    T obj;
    Ex1_GenericClass(T obj) {  this.obj = obj;  }  // constructor
    public T getObject()  { return this.obj; }
}

// Driver class to test above
class Main
{
    public static void main (String[] args)
    {
        // instance of Integer type
        Ex1_GenericClass <Integer> iObj = new Ex1_GenericClass<Integer>(1);
        System.out.println(iObj.getObject());

        // instance of String type
        Ex1_GenericClass <String> sObj =
                new Ex1_GenericClass<String>("Generic Class");
        System.out.println(sObj.getObject());
    }
}