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

public class Ex16_Map {
    public static void main(String args[]) {
        //Creating Map using HashMap and adding elements
        Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "KFC");
        map.put(4, "McDonald's");
        map.put(2, "Mary Brown");
        map.put(3, "Texas Chicken");

        //Using Map.Entry for Set and Iterator
        Set<Map.Entry<Integer, String>> set = map.entrySet();

        Iterator<Map.Entry<Integer, String>> itr = set.iterator();
        while (itr.hasNext()) {
            Map.Entry e = itr.next();//no need to typecast
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
