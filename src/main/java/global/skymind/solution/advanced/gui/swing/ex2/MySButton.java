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
package global.skymind.solution.advanced.gui.swing.ex2;

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
         */

        //Instantiate button
        JButton button = new JButton();
        //set up the centroid and dimension of button
        button.setBounds(90, 65, 300, 300);
        //add button to the components for an action event
        button.addActionListener(this);
        //use lambda expression to print "Hello User!"
        button.addActionListener(e -> System.out.println("Hello User!"));
        //set button's title to "Click me"
        button.setText("Click me");
        //hide text focus on button
        button.setFocusable(false); //to hide border around the text in button
        //set up the font
        button.setFont(new Font("Comic Sans", Font.BOLD, 45));

        /*
        Set up the frame
         */

        //add button into the frame
        this.add(button);
        //Instantiate icon
        ImageIcon icon = new ImageIcon("src/main/resources/gui/icon.png");
        //add icon to frame
        this.setIconImage(icon.getImage());
        //set exit condition to the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set window's title
        this.setTitle("Click the button");
        //set frame size (width 500, height 500)
        this.setSize(500, 500);
        //set frame layout (null)
        this.setLayout(null);
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
