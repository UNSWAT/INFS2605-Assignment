/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infs2605tutorialweek6;

import javafx.application.Application;
import javafx.geometry.Rectangle2D;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/**
 *
 * @author adriantsoi
 */
public class Question1DisplayImages extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane flowPane = new FlowPane();
        flowPane.setPrefSize(400, 600);

        // simple displays ImageView the image as is
        ImageView iv1 = new ImageView(new Image("file:a6c.png"));
        
        iv1.setFitHeight(100);
        iv1.setPreserveRatio(true);
        

        flowPane.getChildren().add(iv1);

        Scene scene = new Scene(flowPane);

        stage.setTitle("ImageView");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();

    }

    public static void main(String[] args) {
        Application.launch(args);
    }

}
