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
package global.skymind.training.advanced.gui.swing.ex2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MySButton extends JFrame implements ActionListener {

    //main() method to execute program
    public static void main(String[] args) {
        MySButton mySButton = new MySButton();
        mySButton.start();
    }

    //start() method to set up the features
    public void start() {

        /*
        Set up the button
        1. Instantiate button and set title as "Click me"
        2. Set button's bound
        3. Add button to components for an action
        4. Use lambda expression to print out "Hello User!"
        5. Hide text focus on button (Optional)
        6. Set up font type (Optional)

        Code at line 32
         */

        JButton button = new JButton();


        /*
        Set up the frame
        1. Use "this" keyword to refer the current object (JFrame) in start() method
        2. Add button to the frame
        3. Set frame's title
        4. Set default close operation
        5. Set frame's size
        6. Set frame's layout to null

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

    //Action performed after button was clicked
    @Override
    public void actionPerformed(ActionEvent e) {
    }
}
