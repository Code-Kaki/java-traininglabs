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
import java.util.*;
//Simple program to show how Vector works

public class Ex9_Vector {
    public static void main(String args[]) {
        //Creating Vector
        Vector<String> fruits = new Vector<String>();

        //Adding object in Vector
        fruits.add("rambutan");
        fruits.add("mangoesteen");
        fruits.add("jackfruit");
        fruits.remove("mangoesteen");
        fruits.add("mango");
        System.out.println(fruits);
        System.out.println("mangoesteenis exist? " + fruits.contains("mangoesteen"));

        //Traversing Vector through Iterator
        Iterator<String> itr = fruits.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        //Alternative to traverse through the Vector
        //Traverse using for loop
        /*for (intindex = 0; index < fruits.size(); index++) {
            System.out.println(fruits.get(index));
        }

        //Traverse using simplified loop
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        //Traverse using enumeration
        Enumeration<String> enumFruit = fruits.elements();
        while (enumFruit.hasMoreElements()) {
            System.out.println(enumFruit.next());
        }*/
    }
}