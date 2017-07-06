package com.mgames.util;

import com.mgames.entities.Entity;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Input;

import java.util.Random;

/**
 * Created by mikael on 2017-07-06.
 */
public class Flake extends Entity {
    static Random randX = new Random();
    static float xSpread = 1000f;
    static Random randY = new Random();
    static float ySpread = -500f;
    static Random randSize = new Random();
    static float flakeSize = 7f;
    static Random randSpeed = new Random();
    static float flakeSpeed = 0.20f;

    @Override
    public void init() {
        x = randX.nextFloat() * (this.xSpread) + 1;
        y = randY.nextFloat() * (this.ySpread) + 0;
        height = randSize.nextFloat() * (this.flakeSize) + 3;
        width = height;
        speed = randSpeed.nextFloat() * (this.flakeSpeed) + 0.03f;

    }

    @Override
    public void update(GameContainer gc, int delta) {
        Input input = gc.getInput();
        if (input.isKeyDown(Input.KEY_SPACE)) {
            y = y;
        } else {
            if (y > 500) {
                y = randY.nextFloat() * (this.ySpread) + 0;
                x = randX.nextFloat() * (this.xSpread) + 1;
            } else y += speed * delta;
        }
    }
}