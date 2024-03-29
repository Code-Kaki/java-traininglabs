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
package global.skymind.solution.advanced.gui.javafx.ex3;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.image.Image;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class MyFXTextBox extends Application implements EventHandler<ActionEvent> {

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {
        //Instantiate label and set label's title as "Write Something."
        Label label = new Label("Write Something.");

        //Instantiate text and set text's title as "Write here."
        TextArea text = new TextArea("Write here.");

        /*
        Set up the button
         */
        //Instantiate button and title as "Submit"
        Button button = new Button("Submit");
        //add button to the components for an action and
        //use lambda expression to print the input text by user
        button.setOnAction(e -> System.out.println(text.getText()));

        /*
        Set up the stage
         */
        //Instantiate layout in VBox (vertical box)
        VBox layout = new VBox();
        //set padding for the layout
        layout.setPadding(new Insets(20)); //gap around TextBox
        //add label, text and button on layout
        layout.getChildren().addAll(label,text, button);

        //Instantiate scene, add layout on scene and set Scene's dimension
        Scene scene = new Scene(layout, 420, 200);
        //set stage's title
        primaryStage.setTitle("Basic TextBox");
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

    }
}
