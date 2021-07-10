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
import java.util.*;

public class Ex5_Vector {
    public static void main(String args[]){
        Vector<String> v=new Vector<String>();//Creating vector
        v.add("Dr. Pranesh");//Adding object in vector
        v.add("Hidayah");
        v.add("Zul");
        v.add("Hidayah");
        v.add("Yuen");
        //Traversing list through Iterator
        Iterator<String> itr=v.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}

//import java.util.Vector;
//public class DemoVector{
//    public static void main(String args[]) {
//        Vector<String> fruits = new Vector<String>();
//        fruits.add("rambutan");fruits.add("jackfruit"); fruits.add("mangoesteen");
//        System.out.println(fruits);
//        fruits.remove("jackfruit");fruits.add("mango");
//        System.out.println(fruits);
//        System.out.println("mangoesteenis exist? " +
//                fruits.contains("mangoesteen"));
//    }
//}

//traverse using for loop
//import java.util.Vector;
//public class DemoVector2 {
//    public static void main(String[] args) {
//        Vector<String> fruits = new Vector<String>();
//        fruits.add("rambutan");
//        fruits.add("jackfruit");
//        fruits.add("mangoesteen");
//        for (intindex = 0; index < fruits.size(); index++){
//            System.out.println(fruits.get(index));
//        }
//    }
//}
//
////using simplified loop
//import java.util.Vector;
//public class DemoVector2 {
//    public static void main(String[] args) {
//        Vector<String> fruits = new Vector<String>();
//        fruits.add("rambutan");
//        fruits.add("jackfruit");
//        fruits.add("mangoesteen");
//        for (String fruit:fruits){
//            System.out.println(fruit);
//        }
//    }
//}
//
////using enumeration
//import java.util.Vector;
//        Import java.util.Enumeration;
//public class DemoVector2 {
//    public static void main(String[] args) {
//        Vector<String> fruits = new Vector<String>();
//        fruits.add("rambutan"); fruits.add("jackfruit");
//        fruits.add("mangoesteen");
//        Enumeration<String> enumFruit= fruits.elements();
//        while (enumFruit.hasMoreElements()) {
//            System.out.println(enumFruit.next());
//        }
//    }
//}