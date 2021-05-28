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
package global.skymind.training.fundamental.ex1;

/**
 * This is the way to write Javadoc - or in Python terms: docstring
 *
 * @author YuenHern Yu
 */

/*
In this example, we will show some common practices in writing Java code
This is also one way to write block comments in Java
 */

//This is a way to write inline comments in Java

public class Ex1_CommonPractices1 {

    /*
    1: Declaring class variables

    Class variables are inside the class, but outside constructors and methods
    Common Practice 2: Variable names should be nouns, starting with lowercase letter
     */
    final private static String helloJava = "Hello Java!"; //this is a static class variable

    static double staticRandD = 123.45;
    double nonStaticRandD = 543.21;

    public String randStr = "Str"; //this is a non-static class variable
    final public static double PI_CONST = 3.142; //this is a constant
    public int randInt;

    /*
    2: Declaring an empty constructor
     */
    public Ex1_CommonPractices1() {
        /*
        Characteristics of a constructor:
        1. A constructor has only access modifier
        2. A constructor has the same name as its class
        3. A constructor does not have a return type
         */
    }

    /*
    3.1: Declaring another constructor with inputs
     */
    public Ex1_CommonPractices1(int randInteger, double randDouble, String randString) {

        System.out.println("==========================Before assignment=====================");
        System.out.println("randInt before assignment: " + randInt);
        System.out.println("nonStaticRandD before assignment: " + nonStaticRandD);
        System.out.println("randStr before assignment: " + randStr);

        //Assign randInteger to randInt
        //ENTER YOUR CODE HERE

        //Assign randDouble to nonStaticRandD
        //ENTER YOUR CODE HERE TO ASSIGN randDouble TO nonStaticRandD

        //Assign randString to randStr using "this" keyword
        //The "this" keyword is an instance reference
        //ENTER YOUR CODE HERE USING this.randStr
    }

    /*
    4.1: Defining a Getter method

    Due to encapsulation in OOP, variables are normally hidden from direct access
    from an external class using the "private" access modifier.
    Therefore, Getter methods are defined to access the variables while maintaining
    the encapsulation principle.

    Try: Access the variable helloJava without using the getHelloJava() method from
    M1_CommonPractices2.java
     */
    public static String getHelloJava() {
        return helloJava;
    }

    /*
    5.1: Defining a Setter method

    Variables are be set during class instantiation using constructors with input
    arguments. However, if in any circumstances that the user might need to change
    any variables (permitted by author), Setter methods enables this.
     */
    public static void setRandD(double randomDouble) {
        staticRandD = randomDouble;
    }

}

class Ex1_CommonPractices2 {

    public static void main(String[] args) {

        //2.1: Instantiating an empty constructor without any input arguments
        Ex1_CommonPractices1 testInstance1 = new Ex1_CommonPractices1();

        //3.1: Instantiating a constructor with input arguments
        //Note: There is one space between the comma and the next input argument, always
        Ex1_CommonPractices1 testInstance2 = new Ex1_CommonPractices1(1, 2.2, "Hi");

        //3.2: Print out all the assigned variables
        System.out.println("=======================After assignment==========================");
        System.out.println("randInt after assignment: " + testInstance2.randInt);
        System.out.println("nonStaticRandD after assignment: " + testInstance2.nonStaticRandD);
        System.out.println("randStr after assignment: " + testInstance2.randStr);
        System.out.println("=================================================================");

        //4.2: Accessing class attributes using Getter method
        //Uncomment subsequent line and see what is the error
//        System.out.println(Ex1_CommonPractices1.helloJava);
        System.out.println("Variable helloJava: " + /* ENTER YOUR CODE HERE TO GET THE VARIABLE */);

        //5.2: Altering class attributes using Setter method
        System.out.println("staticRandD before Setter: " + Ex1_CommonPractices1.staticRandD);
        Ex1_CommonPractices1.setRandD(1000);
        System.out.println("staticRandD after Setter: " + /* ENTER YOUR CODE HERE TO ACCESS staticRandD */);

        //6: Access the pi constant
        System.out.println("Constant pi: " + /* ENTER YOUR CODE HERE TO ACCESS THE CONSTANT */);

    }
}
