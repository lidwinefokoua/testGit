package org.calma.testgit;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class LandscapeApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Paysage  JavaFX");

        // Créer un canevas pour dessiner
        Canvas canvas = new Canvas(800, 600);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        // Dessiner le paysage
        drawLandscape(gc);

        // Créer un groupe et ajouter le canevas
        Group root = new Group();
        root.getChildren().add(canvas);

        // Créer la scène
        Scene scene = new Scene(root, 800, 600);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void drawLandscape(GraphicsContext gc) {
        // Dessiner le ciel
        gc.setFill(Color.CYAN);
        gc.fillRect(0, 0, 800, 400);

        // Dessiner le sol
        gc.setFill(Color.GREEN);
        gc.fillRect(0, 400, 800, 200);

        // Dessiner un soleil
        gc.setFill(Color.YELLOW);
        gc.fillOval(650, 50, 80, 80);

        // Dessiner des montagnes
        gc.setFill(Color.BROWN);
        gc.fillPolygon(new double[]{100, 200, 300}, new double[]{400, 200, 400}, 3);
        gc.fillPolygon(new double[]{250, 350, 450}, new double[]{400, 150, 400}, 3);
        gc.fillPolygon(new double[]{400, 500, 600}, new double[]{400, 250, 400}, 3);

        // Dessiner des arbres
        gc.setFill(Color.SADDLEBROWN);
        gc.fillRect(100, 350, 20, 50);
        gc.fillRect(150, 350, 20, 50);
        gc.fillRect(200, 350, 20, 50);

        gc.setFill(Color.FORESTGREEN);
        gc.fillOval(90, 320, 60, 60);
        gc.fillOval(140, 320, 60, 60);
        gc.fillOval(190, 320, 60, 60);

        // Dessiner un lac
        gc.setFill(Color.DEEPSKYBLUE);
        gc.fillOval(300, 450, 200, 100);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
