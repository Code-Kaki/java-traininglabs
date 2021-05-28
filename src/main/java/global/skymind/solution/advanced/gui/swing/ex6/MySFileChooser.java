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
package global.skymind.solution.advanced.gui.swing.ex6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MySFileChooser extends JFrame implements ActionListener {

    JButton button;

    //main() method to execute program
    public static void main(String[] args) {
        MySFileChooser myFileChooser = new MySFileChooser();
        myFileChooser.start();
    }

    //start() method to set up the features
    public void start(){

        /*
        Set up the button
         */

        //Instantiate button and set title to "Select File"
        button = new JButton("Select File");
        //add button to the components for an action event
        button.addActionListener(this);
        //hide text focus on button
        button.setFocusable(false);

        /*
        Set up the frame
         */

        //set layout to GridBagLayout()
        this.setLayout(new GridBagLayout());
        //add button to GridBagConstraints()
        this.add(button, new GridBagConstraints()); //automatically align to middle
        //set window's title
        this.setTitle("File Chooser");
        //Instantiate icon
        ImageIcon icon = new ImageIcon("src/main/resources/gui/icon.png");
        //add icon to frame
        this.setIconImage(icon.getImage());
        //set frame size (width 320, height 125)
        this.setSize(320, 125);
        //set exit condition to the frame
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //set window show up in the middle of screen
        this.setLocationRelativeTo(null);
        //set frame visibility (true)
        this.setVisible(true);
    }

    //Action performed after button was clicked
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button){

            JFileChooser fileChooser = new JFileChooser();
            //open current path
            fileChooser.setCurrentDirectory(new File("."));
            //select file to open
            int response = fileChooser.showOpenDialog(null);
            //print out the selected path on runtime
            if (response == JFileChooser.APPROVE_OPTION){
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file); //print out path
            }
        }
    }
}
