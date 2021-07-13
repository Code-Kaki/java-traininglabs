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
package global.skymind.training.intermediate.oop.demo.demo05_polymorphism.OverridingDemo;

    /*
     * Simple demo to illustrate method overriding AKA runtime polymorphism
     * */

class basicClass {

    public void method(){
        System.out.println("Hello world!");
    }
}

public class MethodOverriding extends basicClass{
    public void method(){
        System.out.println("Hello everyone!");
    }

    public static void main(String[] args) {

        basicClass test1 = new basicClass();
        test1.method();

        // If the reference is of the parent class object then the method in parent class will be called

        basicClass test2 = new MethodOverriding();
        test2.method();

        // In this case the parent class reference variable is the child class object, the method in child class will be called
    }
}
