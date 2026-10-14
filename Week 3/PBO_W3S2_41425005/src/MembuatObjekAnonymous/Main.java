/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MembuatObjekAnonymous;

package MembuatObjekAnonymous;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        Button button = new Button("Click Me");

        // Objek Anonymous: EventHandler dibuat langsung tanpa nama class,
        // di sinilah "objek anonymous" terjadi.
        button.setOnAction(event -> {
            System.out.println("Tombol diklik!");
        });

        StackPane root = new StackPane();
        root.getChildren().add(button);

        Scene scene = new Scene(root, 300, 200);
        stage.setTitle("Contoh Objek Anonymous - JavaFX");
        stage.setScene(scene);
        stage.show();
    }
}