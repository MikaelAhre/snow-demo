package com.mgames;

import com.mgames.entities.Entity;
import org.newdawn.slick.*;

/**
 * Created by mikael on 2017-07-02.
 */
public class Player extends Entity {


    @Override
    public void init(){
        x = 50;
        y = 50;
        width = 960/5;
        height = 350/5;
        Image image;
        try{
            image = new Image("res/player.png");
        }catch (SlickException e) {

        }

    }

    @Override
    public void update(GameContainer gc, int delta) {


    }
}
