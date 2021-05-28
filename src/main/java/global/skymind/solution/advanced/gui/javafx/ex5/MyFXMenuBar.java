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
package global.skymind.solution.advanced.gui.javafx.ex5;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class MyFXMenuBar extends Application implements EventHandler<ActionEvent> {

    //Instantiate alert as Information Type
    Alert alert = new Alert(Alert.AlertType.INFORMATION);

    //main() method to launch the program
    public static void main(String[] args) {
        launch(args);
    }

    //start() method to set up the features
    @Override
    public void start(Stage primaryStage) throws Exception {

        /*
        Set up MenuBar
         */
        MenuBar menuBar = new MenuBar(); //Instantiate menuBar
        Menu fileMenu = new Menu("File");   //Instantiate fileMenu and set title as "File"
        Menu editMenu = new Menu("Edit");   //Instantiate editMenu and set title as "Edit"
        Menu helpMenu = new Menu("Help");   //Instantiate helpMenu and set title as "Help"

        MenuItem newItem = new MenuItem("New");     //Instantiate newItem and set title as "New"
        MenuItem openItem = new MenuItem("Open");   //Instantiate openItem and set title as "Open"
        MenuItem saveItem = new MenuItem("Save");   //Instantiate saveItem and set title as "Save"
        MenuItem exitItem = new MenuItem("Exit");   //Instantiate exitItem and set title as "Exit"

        menuBar.getMenus().addAll(fileMenu, editMenu, helpMenu); //add menus on menuBar
        fileMenu.getItems().add(newItem);   //add newItem under fileMenu
        fileMenu.getItems().add(openItem);  //add openItem under fileMenu
        fileMenu.getItems().add(saveItem);  //add saveItem under fileMenu
        fileMenu.getItems().add(exitItem);  //add exitItem under fileMenu

        /*
        TODO:
        1. Add openItem, loadItem, saveItem and exitItem to the components for an action event
        2. Use lambda expression and alert to pop up message dialog for each menu item
            eg. "*You opened a file*"
        3. System.exit(0) for exitItem
         */

        newItem.setOnAction(e -> {
            alert.setHeaderText(null);
            alert.setContentText("*You created a new file*");
            alert.showAndWait();}
        );
        openItem.setOnAction(e -> {
            alert.setHeaderText(null);
            alert.setContentText("*You opened an existing file*");
            alert.showAndWait();}
            );
        saveItem.setOnAction(e -> {
            alert.setHeaderText(null);
            alert.setContentText("*You saved a file*");
            alert.showAndWait();}
            );
        exitItem.setOnAction(e -> System.exit(0));

        /*
        Set up the stage
         */
        //Instantiate layout in BoarderPane
        BorderPane layout = new BorderPane();
        //set menuBar on top of layout
        layout.setTop(menuBar);

        //Instantiate scene, add layout on scene and set Scene's dimension
        Scene scene = new Scene(layout, 420, 300);

        //set stage's title
        primaryStage.setTitle("Basic Menu Bar");
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
