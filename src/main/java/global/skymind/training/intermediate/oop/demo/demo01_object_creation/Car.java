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
package global.skymind.training.intermediate.oop.demo.demo01_object_creation;

public class Car {

    /**
     * Since all cars have 4 wheels, it makes sense to have
     * a static variable that stores this info.*/
    private static int nWheels = 4;
    private String model, colour;
    private int topSpeed;

    public Car(String model, String colour){
        this.model = model;
        this.colour = colour;
    }

    void start(){
        System.out.println("The " + model + " car has started");
    }

    void stop(){
        System.out.println("The " + model + " is not moving");
    }

    static void isFaster(Car a, Car b){
        System.out.println((a.topSpeed > b.topSpeed ? a.model : b.model) + " is faster");
    }

    public static void main(String[] args) {

        Car c1 = new Car("Tesla", "Silver");
        Car c2 = new Car("Mustang", "Red");

        c1.topSpeed = 320;
        c2.topSpeed = 186;

        c1.start();
        c2.stop();

        Car.isFaster(c1, c2);

    }

}