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

public class Ex18_Recursion {
    public static void main(String[] args) {

        Ex18_Recursion recursionTool = new Ex18_Recursion();

        //Demonstrate what a triangular number is
        //Triangular numbers can be visualized as triangles
        //Equals itself plus every number before it to 1
        //TN of 5 = 5+4+3+2+1

        recursionTool.calculateSquaresToPrint(10);

        System.out.println("\nTriangular Number: " + recursionTool.getTriangularNum(3) + "\n");
        System.out.println("GET TRIANGULAR NUMBER");
        System.out.println("Recursion Triangular Number: " + recursionTool.getTriangularNumR(6));
        System.out.println("\nGET FACTORIAL");
        System.out.println("Factorial: " + recursionTool.getFactorial(3));
    }

    //Calculate triangular number not using recursion
    public int getTriangularNum(int number){
        int triangularNumber = 0;
        while(number > 0){
            triangularNumber = triangularNumber + number;
            number--;
        }
        //If number equals 3, you find TN by adding 3+2+1 = 6
        return triangularNumber;
    }

    //Calculate triangular number using recursion
    public int getTriangularNumR(int number){
        //Every recursive method must have a condition that leads to the method no longer making another method call on itself. This is known as the base case
        System.out.println("Method " + number);
        if(number == 1){
            System.out.println("Returned 1");
            return 1;
        } else {
            int result = number + getTriangularNumR(number - 1);
            System.out.print("Return " + result);
            System.out.println(" : " + number + " + getFactorial(" + number + " - 1)");
            return result;
        }
    }

    //Returns the factorial of a number factorial(3) = 3 * 2 * 1
    public int getFactorial(int number){
        System.out.println("Method " + number);
        if(number == 1){
            System.out.println("Returned 1");
            return 1;
        } else {
            int result = number * getFactorial(number - 1);
            System.out.print("Return " + result);
            System.out.println(" : " + number + " * getFactorial(" + number + " - 1)");
            return result;
        }
    }

    // USED TO DEMONSTRATE TRIANGULAR NUMBERS --------------------

    //Draws the number of squares that are passed in horizontally
    public void drawSquares(int howManySquares){
        for(int i = 0; i < howManySquares; i++)
            System.out.print(" --  ");
        System.out.println();
        for(int i = 0; i < howManySquares; i++)
            System.out.print("|" + howManySquares + " | ");
        System.out.println();
        for(int i = 0; i < howManySquares; i++)
            System.out.print(" --  ");
        System.out.println("\n");
    }

    //Outputs the number of squares to print to represent a triangle
    public void calculateSquaresToPrint(int number){
        for(int i = 1; i <= number; i++){
            for(int j = 1; j < i; j++){
                drawSquares(j);
            }
            System.out.println("Triangular Number: " + calcTriangularNum(i));
        }
    }
    public double calcTriangularNum(int number){
        return .5 * number * (1 + number);
    }
}