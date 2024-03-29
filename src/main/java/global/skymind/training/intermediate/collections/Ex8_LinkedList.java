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

package global.skymind.training.intermediate.collections;

public class Ex8_LinkedList {
    //Reference to first Link in list
    //The last Link added to the LinkedList
    public Ex8_Linked firstLink;
    Ex8_LinkedList(){
        //Here to show the first Link always starts as null
        firstLink = null;
    }

    //Returns true if LinkList is empty
    public boolean isEmpty(){
        return(firstLink == null);
    }

    public void insertFirstLink(String bookName, int millionsSold){
        Ex8_Linked newLink = new Ex8_Linked(bookName, millionsSold);
        //Connects the firstLink field to the new Link
        newLink.next = firstLink;
        firstLink = newLink;
    }

    public Ex8_Linked removeFirst(){
        Ex8_Linked linkReference = firstLink;
        if(!isEmpty()){
            //Removes the Link from the List
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty LinkedList");
        }
        return linkReference;
    }

    public void display(){
        Ex8_Linked theLink = firstLink;
        //Start at the reference stored in firstLink and keep getting the references stored in next for every Link until next returns null
        while(theLink != null){
            theLink.display();
            System.out.println("Next Link: " + theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }

    public Ex8_Linked find(String bookName){
        Ex8_Linked theLink = firstLink;
        if(!isEmpty()){
            while(theLink.bookName != bookName){
                //Checks if at the end of the LinkedList
                if(theLink.next == null){
                    //Got to the end of the Links in LinkedList without finding a match
                    return null;
                } else {
                    //Found a matching Link in the LinkedList
                    theLink = theLink.next;
                }
            }
        } else {
            System.out.println("Empty LinkedList");
        }
        return theLink;
    }

    public Ex8_Linked removeLink(String bookName){
        Ex8_Linked currentLink = firstLink;
        Ex8_Linked previousLink = firstLink;

        //Keep searching as long as a match isn't made
        while(currentLink.bookName != bookName){
            //Check if at the last Link in the LinkedList
            if(currentLink.next == null){
                //bookName not found so leave the method
                return null;
            } else {
                //We checked here so let's look in the next Link on the list
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }

        if(currentLink == firstLink){
            //If you are here that means there was a match in the reference stored in firstLink in the LinkedList so just assign next to firstLink
            firstLink = firstLink.next;
        } else {
            // If you are here there was a match in a Link other than the firstLink.
            // Assign the value of next for the Link you want to delete to the Link that's next previously pointed to the reference to remove
            System.out.println("FOUND A MATCH");
            System.out.println("currentLink: " + currentLink);
            System.out.println("firstLink: " + firstLink);
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }
}

