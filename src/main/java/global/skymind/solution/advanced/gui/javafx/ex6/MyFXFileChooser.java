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
package global.skymind.solution.advanced.gui.javafx.ex6;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class MyFXFileChooser extends Application implements EventHandler<ActionEvent> {

    FileChooser fileChooser;
    Button button;

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {
        /*
        Set up button
         */
        //Instantiate button and set title as "Select File"
        button = new Button("Select File");
        //set button's dimension
        button.setMaxSize(100, 50);
        //add button to components for an action
        button.setOnAction(this);

        /*
        Set up the stage
         */
        //Instantiate layout in StackPane
        StackPane layout = new StackPane();
        //add button on layout
        layout.getChildren().addAll(button);

        //Instantiate scene, add layout on scene and set Scene's dimension
        Scene scene = new Scene(layout, 340, 100);

        //set stage's title
        primaryStage.setTitle("Basic File Chooser");
        //add scene on stage
        primaryStage.setScene(scene);
        //add icon on stage
        primaryStage.getIcons().add(new Image("gui/icon.png"));
        //show the stage
        primaryStage.show();
    }

    //action performed after button was clicked
    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button){
            //Instantiate fileChooser
            fileChooser = new FileChooser();
            //create a pop up window dialog with response
            File response = fileChooser.showOpenDialog(null);
            //print out the path selected on window dialog
            if (response != null){
                System.out.println("Path:\n" + response.getAbsoluteFile().getAbsolutePath());
            }
        }
    }
}
