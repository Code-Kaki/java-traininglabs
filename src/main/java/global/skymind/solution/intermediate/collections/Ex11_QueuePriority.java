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

public class Ex11_QueuePriority {
    public static void main(String args[]){
        //Creating Queue
        PriorityQueue<String> queue = new PriorityQueue<String>();

        //Adding object to Queue
        queue.add("KFC");
        queue.add("McDonald's");
        queue.add("Mary Brown");
        queue.add("Texas Chicken");
        System.out.println("head:"+queue.element());
        System.out.println("head:"+queue.peek());

        //Traversing Queue through Iterator
        System.out.println("iterating the queue elements:");
        Iterator itr = queue.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
        
        //Removing object in Queue
        queue.remove();
        queue.poll();
        System.out.println("after removing two elements:");
        Iterator<String> itr2 = queue.iterator();
        while(itr2.hasNext()){
            System.out.println(itr2.next());
        }
    }
}
