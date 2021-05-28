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
package global.skymind.training.advanced.gui.javafx.ex2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MyFXButton extends Application implements EventHandler<ActionEvent> {

    Button button;

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {

        /*
        Set up the button
        1. Instantiate button and title as "Click me!"
        2. Set button's dimension
        3. Add button to the components for an action

        Code at line 32
         */
        button = new Button();

        /*
        Set up the stage
        1. Instantiate layout in StackPane
        2. Add button on layout
        3. Instantiate scene, add layout on scene and set Scene's dimension
        4. Set stage's title
        5. Add scene on stage

        Code at line 44
         */
        primaryStage.getIcons().add(new Image("gui/icon.png"));
        primaryStage.show();
    }

    int count = 1;
    //Action performed after button was clicked
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button){
            //print number of button clicked by user
            System.out.println("Hello User " + count +" times");
            count++;
        }
    }
}
