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
package global.skymind.training.intermediate.oop.demo.demo04_abstraction.abstractClassDemo;

abstract class simpleAbstract{ //abstract keyword is used when we want to achieve abstraction this way

    public abstract void method1();

    public void method2(){
        System.out.println("Method 2 is called");
    }

    public simpleAbstract(){
        System.out.println("Abstract classes can have constructors!");
    }

    /*
     * Abstract methods should be declared as abstract.
     * We can have non-abstract methods as well, if this is the case, method implementation have to be written
     * */
}

public class abstractClassDemo  extends simpleAbstract {    //Abstraction is also a way for us to achieve inheritance

    public abstractClassDemo(){
    }

    public void method1() {
        System.out.println("This is an implementation of method 1");
    }

    public static void main(String[] args) {

        simpleAbstract test = new abstractClassDemo();
        test.method1();
        test.method2();
    }
}

