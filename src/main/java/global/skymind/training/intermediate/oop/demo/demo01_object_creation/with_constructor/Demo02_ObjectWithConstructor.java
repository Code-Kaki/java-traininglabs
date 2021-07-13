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
package global.skymind.training.intermediate.oop.demo.demo01_object_creation.with_constructor;

class Person{
    String name;
    int age;

    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    void walk(){}
    void eat(){}
    void intro(){
        System.out.println("Hello world! My name is " + name +". I am " + age + " years old. Nice to meet you!");
    }

}

public class Demo02_ObjectWithConstructor {

    public static void main(String[] args) {
        //Create objects of class Person using constructors

        Person p1 = new Person("John", 24);
        p1.intro();

        /**
         * Note:
         * If we have defined a custom constructor in the class,
         * we will not be able to create an object using the default constructor i.e.
         *
         * Person p = new Person();
         *
         * To do so, we would need to also explicitly write the parameter-less constructor
         * */
    }

}
