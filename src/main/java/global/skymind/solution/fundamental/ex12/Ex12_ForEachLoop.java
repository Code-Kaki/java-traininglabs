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
package global.skymind.solution.fundamental.ex12;

import java.util.ArrayList;

public class Ex12_ForEachLoop {

    public static void main(String[] args) {

        /*
        We learnt about for loops previously and used it to print out each element in an array.
        Remember that we wrote a conditional to check the input before we print out n elements.
        Now what if we want to print each element in an array without specifying the condition to stop?
        That's where for-each loop comes in.
         */

        // Let's use similar array defined in the for loop example
        ArrayList<String> marvelRank = new ArrayList<>();

        // Add a few elements
        marvelRank.add("1. Steve Rogers");
        marvelRank.add("2. Tony Stark");
        marvelRank.add("3. Thor");
        marvelRank.add("4. Peter Parker");
        marvelRank.add("5. Natasha Romanoff");
        marvelRank.add("6. King T'Challa");
        marvelRank.add("7. Bruce Banner");
        marvelRank.add("8. Scott Lang");
        marvelRank.add("9. Peggy Carter");
        marvelRank.add("10. Matt Murdock");

        // Let's replace the lengthy for loop with a simpler for-each loop
        for (String element : marvelRank) {
            System.out.println(element);
        }

    }

}
