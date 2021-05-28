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
package global.skymind.solution.fundamental.ex15;

import java.util.ArrayList;
import java.util.Iterator;

public class Ex15_BreakContinueStatement {

    public static void main(String[] args) {

        /*
        We learnt about loops previously and used it to print out each element in an array.
        Loops iterate through the array in a sequential manner, until the condition is not fulfilled,
        and without skipping any elements.
        Now what if we want to stop the loop using another condition which is not specified in the
        start of the loop? What if we want to skip certain elements?
        That's where break and continue statement comes in.
         */

        // Let's use another example - Top 17 Tech Skills in Demand in 2021
        // Link: https://www.comptia.org/blog/top-it-skills-in-demand
        ArrayList<String> top17TechSkillsbyComptia = new ArrayList<>();

        top17TechSkillsbyComptia.add("1. Machine Learning");
        top17TechSkillsbyComptia.add("2. Artificial Intelligence");
        top17TechSkillsbyComptia.add("3. Cloud Computing");
        top17TechSkillsbyComptia.add("4. Data Science");
        top17TechSkillsbyComptia.add("5. Programming Language");
        top17TechSkillsbyComptia.add("6. Cybersecurity");
        top17TechSkillsbyComptia.add("7. Big Data");
        top17TechSkillsbyComptia.add("8. Soft Skills");
        top17TechSkillsbyComptia.add("9. Automation");
        top17TechSkillsbyComptia.add("10. Structured Query Language (SQL)");
        top17TechSkillsbyComptia.add("11. Data Analytics");
        top17TechSkillsbyComptia.add("12. Linux");
        top17TechSkillsbyComptia.add("13. Mobile App");
        top17TechSkillsbyComptia.add("14. Software Development");
        top17TechSkillsbyComptia.add("15. UX Design");
        top17TechSkillsbyComptia.add("16. Business Analysis");
        top17TechSkillsbyComptia.add("17. Virtual Reality");


        breakStatement(top17TechSkillsbyComptia);

//        continueStatement(top17TechSkillsbyComptia);

    }

    private static void breakStatement(ArrayList arrayList) {

        // Here we use break statement to terminate the loop if it is a null element

        arrayList.add(5, null); // add a null element, you may change the index

        Iterator iterator = arrayList.iterator();

        while (iterator.hasNext()) {

            Object currentElement = iterator.next();

            if (currentElement == null) // we terminate the while loop if the element is a null
                break;

            System.out.println(currentElement);
        }
        
    }

    private static void continueStatement(ArrayList arrayList) {

        // Here, we use continue statement to skip a turn / iteration

        for (int i = 0; i < arrayList.size(); i++) {

            if (i % 2 != 0) { // we skip this turn or iteration if the index is odd
                continue;
            }
            System.out.println(arrayList.get(i));

        }

    }

    /*
    Do you get the difference between break and continue statement?
     */

}
