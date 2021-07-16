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
package global.skymind.training.intermediate.exceptions;

public class Ex_3 {
    public static void main(String[] args) {
        System.out.println("\n=====================================");
        System.out.println("||             Question 3          ||");
        System.out.println("=====================================");

        /*
        In this question, you are required to fill in the correct answer.
        Read through the code and put answers on a, b and c respectively.
        Uncomment all the code and run.
        */

        int x = 10;
        int y = 15;
//        int a = // TODO(Put your answer here)
//        int b = // TODO(Put your answer here)
//        int c = // TODO(Put your answer here)

        int ans = 0;

        try {
            ans = x + y;

//            if (ans == a) {
//                System.out.println("Answer(a) is right");
//            } else {
//                System.out.println("Answer(a) is wrong");
//            }

            // Purposely throw the exception
            throw new RuntimeException("Exception Occurs");
        } catch(RuntimeException ex) {

            ans += 8;

//            if (ans == b) {
//                System.out.println("Answer(b) is right");
//            } else {
//                System.out.println("Answer(b) is wrong");
//            }

        } finally {

            ans /= 3;

//            if (ans == c) {
//                System.out.println("Answer(c) is right");
//            } else {
//                System.out.println("Answer(c) is wrong");
//            }

        }
    }
}
