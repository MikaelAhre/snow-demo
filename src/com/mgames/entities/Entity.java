package com.mgames.entities;

import com.mgames.util.Box;
import org.newdawn.slick.*;

/**
 * Created by mikael on 2017-07-02.
 */
public abstract class Entity extends Box {

    //public Image image;
    public Color color;

    public Entity(){
        init();
    }

    public abstract void init();

    public void render(GameContainer gc, Graphics g) {

    }


    public abstract void update(GameContainer gc, int delta);
}
