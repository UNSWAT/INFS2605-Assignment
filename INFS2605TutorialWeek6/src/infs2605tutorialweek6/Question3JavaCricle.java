/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package infs2605tutorialweek6;

import javafx.application.Application;
import javafx.geometry.Point2D;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
/**
 *
 * @author adriantsoi
 */
public class Question3JavaCricle extends Application {

//ADRIAN WAS HERE

     @Override
    public void start(Stage primaryStage) {

        Pane pane = new Pane();
        String[] java = "Welcome to Java".split("");
        Font font = Font.font("Times New Roman", FontWeight.EXTRA_BOLD, 30);

        // http://en.wikipedia.org/wiki/Circle#Equations
        // The equation can be written in parametric form using the
        // trigonometric functions sine and cosine as
        // x = a+r * cos t
        // y = b+r * sin t
        // where t is a parametric variable in the range 0 to 2π,

        Point2D center = new Point2D(200, 200);
        double radius = 100;
        double angle = 0;
        double rotate = 90;
        for (int i = 0; i < java.length; i++, angle += 22, rotate += 22) {
            double x = center.getX() + radius * Math.cos(Math.toRadians(angle));
            double y = center.getY() + radius * Math.sin(Math.toRadians(angle));
            Text text = new Text(x, y,java[i]);
            text.setRotate(rotate);
            text.setFont(font);
            pane.getChildren().add(text);

        }

        Scene scene = new Scene(pane, 400, 400);
        primaryStage.setTitle("Welcome to Java");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public static void main(String[] args) {
        Application.launch(args);
    }
}
