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
package global.skymind.training.intermediate.oop.demo.demo04_abstraction.interfaceDemo;

interface simpleInterface{ //interface keyword is used to create one
    public void method1();
    public void method2();

    /*
     * If written in full, these methods should be
     * public abstract void method1();
     * public abstract void method2();
     * */
}

public class InterfaceDemo implements simpleInterface{

    public void method1() {
        System.out.println("This is an implementation of method 1");
    }

    public void method2() {
        System.out.println("This is an implementation of method 2");
    }

    public static void main(String[] args) {

        // There are no constructors in an interface as it is not something we use to create instance of classes

        simpleInterface test = new InterfaceDemo();
        test.method2();
    }
}
