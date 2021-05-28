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
package global.skymind.training.advanced.gui.swing.ex1;

import javax.swing.*;

public class MySFrame extends JFrame {

    //main() method to execute program
    public static void main(String[] args) {
        MySFrame myFrame = new MySFrame();
        myFrame.start();
    }

    //start() method to set up the features
    public void start(){

        /*
        Set up the frame
        1. Use "this" keyword to refer the current object (JFrame) in start() method
        2. Set frame's title
        3. Set default close operation
        4. Set frame's size
        5. Set frame's layout to null

        Code at line 26
         */

        //Instantiate icon
        ImageIcon icon = new ImageIcon("src/main/resources/gui/icon.png");
        //add icon to frame
        this.setIconImage(icon.getImage());
        //set window show up in the middle of screen
        this.setLocationRelativeTo(null);
        //set frame visibility (true)
        this.setVisible(true);
    }
}
