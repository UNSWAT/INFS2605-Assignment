/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infs2605tutorialweek6;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

/**
 *
 * @author adriantsoi
 */
public class DisplayImage extends Application {

    @Override
    public void start(Stage stage) {
        FlowPane flowPane = new FlowPane();
        flowPane.setPrefSize(400, 600);
        
        ImageView iv1 = new ImageView(new Image("file:/users/adriantsoi/NetBeansProjects/INFS2605TutorialWeek6/src/res/dank.png"));
        
        iv1.setFitHeight(100);
        iv1.setPreserveRatio(true);
        
        flowPane.getChildren().add(iv1);
        
        Scene scene = new Scene(flowPane);
        
        stage.setTitle("ImageView");
        stage.setScene(scene);
        stage.sizeToScene();
        stage.show();
                
    }
    
    public static void main (String[]args) {
        Application.launch(args);
    }
    
}
