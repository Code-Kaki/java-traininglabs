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
//Java program to iterate the elements in an ArrayList

public class Ex6_IterateInList {
    public static void main(String args[])
    {
        //Creating list
        List<String> al = new ArrayList<>();

        //Adding object in list
        al.add("rambutan");
        al.add("mangoesteen");
        al.add(1, "For");

        //Using the Get method and the for loop
        for (int i = 0; i < al.size(); i++) {
            System.out.print(al.get(i) + " ");
        }

        System.out.println();

        //Using the for each loop
        for (String str : al)
            System.out.print(str + " ");
    }
}
