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

public class Ex10_DeleteInList {
    // Java program to remove elements
    // in a List
    public static void main(String args[])
    {
        List<String> al = new ArrayList<>();

        al.add("Apple");
        al.add("Orange");
        al.add(1, "For");

        System.out.println(
                "Initial ArrayList " + al);

        al.remove(1);

        System.out.println(
                "After the Index Removal " + al);

        al.remove("Orange");

        System.out.println(
                "After the Object Removal " + al);
    }
}
