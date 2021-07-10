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

public class Ex17_Array {
    private int[] theArray = new int[50]; // Creates an array with 50 indexes
    private int arraySize = 10; // Elements in theArray

    // Fills the Array with random values
    public void generateRandomArray(){
        for(int i = 0; i < arraySize; i++){
            // Random number 10 through 19
            theArray[i] = (int)(Math.random()*10)+10;
        }
    }

    public int[] getTheArray(){
        return theArray;
    }

    public int getArraySize(){
        return arraySize;
    }

    // Prints the Array on the screen in a grid
    public void printArray(){
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++){
            System.out.print("| " + i + " | ");
            System.out.println(theArray[i] + " |");
            System.out.println("----------");
        }
    }

    // Gets value at provided index
    public int getValueAtIndex(int index){
        if(index < arraySize) return theArray[index];
        return 0;
    }

    // Returns true or false if a value is in the Array
    public boolean doesArrayContainThisValue(int searchValue){
        boolean valueInArray = false;
        for(int i = 0; i < arraySize; i++){
            if(theArray[i] == searchValue){
                valueInArray = true;
            }
        }
        return valueInArray;
    }

    // Delete Array row for the index and move elements up
    public void deleteIndex(int index){
        if(index < arraySize){
            // Overwrite the value for the supplied index
            // and then keep overwriting every index that follows
            // until you get to the last index in the array
            for(int i = index; i < (arraySize - 1); i++){
                theArray[i] = theArray[i+1];
            }
            arraySize--;
        }
    }

    public void insertValue(int value){
        if(arraySize < 50){
            theArray[arraySize] = value;
            arraySize++;
        }
    }

    // Linear Search : Every index must be looked at
    public String linearSearchForValue(int value){
        boolean valueInArray = false;
        String indexsWithValue = "";
        System.out.print("The Value was Found in the Following Indexes: ");
        for(int i = 0; i < arraySize; i++){
            if(theArray[i] == value) {
                valueInArray = true;
                System.out.print(i + " ");
                indexsWithValue+= i + " ";
            }
        }
        if(!valueInArray){
            indexsWithValue = "None";
            System.out.print(indexsWithValue);
        }
        System.out.println();
        return indexsWithValue;
    }

    public static void main(String[] args){
        Ex17_Array newArray = new Ex17_Array();
        newArray.generateRandomArray();
        newArray.printArray();
        System.out.println(newArray.getValueAtIndex(3));
        System.out.println(newArray.doesArrayContainThisValue(18));
        newArray.deleteIndex(4);
        newArray.printArray();
        newArray.insertValue(55);
        newArray.printArray();
        newArray.linearSearchForValue(17);
    }
}


