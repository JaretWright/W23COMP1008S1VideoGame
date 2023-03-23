package com.example.w23comp1008s1videogame;

import javafx.animation.AnimationTimer;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;

public class GameBoardController {

    @FXML
    private AnchorPane anchorPane;

    @FXML
    private Button startButton;

    @FXML
    void startGame(ActionEvent event) {
        startButton.setVisible(false);

        Canvas canvas = new Canvas(1000,800);
        GraphicsContext gc = canvas.getGraphicsContext2D();

        //get Image objects
        Image shipImage = new Image(getClass().getResourceAsStream("images/ship.png"));
        Image background = new Image(getClass().getResourceAsStream("images/space.png"));

        //Create a Sprite that we can draw on our canvas
        Sprite ship = new Sprite (0,500,100,70,10,shipImage);

        AnimationTimer timer = new AnimationTimer() {
            @Override
            public void handle(long now) {
                gc.drawImage(background,0,0,1000,800);
                ship.draw(gc);
                ship.moveRight();
            }
        };
        timer.start();
        anchorPane.getChildren().add(canvas);

    }

}
