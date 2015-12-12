package com.broadlyapplicable.shapeicons;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 *
 * @author dbell
 */
public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        VBox mainVbox = new VBox();
        HBox lne1 = new HBox();
        lne1.setPadding(new Insets(40, 40, 40, 40));
        lne1.getChildren().add(ShapeGenerator.getPlayIcon());
        lne1.getChildren().add(ShapeGenerator.getStopIcon());
        mainVbox.getChildren().add(lne1);

        HBox lne2 = new HBox();
        lne2.getChildren().add(ShapeGenerator.getCompletedIcon());
        lne2.getChildren().add(ShapeGenerator.getUpdateIcon());
        mainVbox.getChildren().add(lne2);

        HBox hbox = new HBox(5);
        hbox.getChildren().add(ShapeGenerator.getHalfPause());
        hbox.getChildren().add(ShapeGenerator.getHalfPause());
        mainVbox.getChildren().add(hbox);

        Scene scene = new Scene(mainVbox, 400, 600);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
