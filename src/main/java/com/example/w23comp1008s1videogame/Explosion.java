package com.example.w23comp1008s1videogame;

import javafx.scene.image.Image;

public class Explosion extends Sprite {

    public Explosion(int posX, int posY) {
        super(posX, posY, 100, 100, 0,
                        new Image(Explosion.class.getResourceAsStream("images/explosion.png")));
    }
}
