package com.mgames.util;

/**
 * Created by mikael on 2017-07-02.
 */
public class Box {
    public float x;
    public float y;
    public float width;
    public float height;
    public float speed;

    public Box(){}

    public Box(float x, float y, float width, float height, float speed) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.speed = speed;
    }
    public float getEndX(){
        return (x + width);
    }

    public float getEndY(){
        return (y + height);
    }
    public float getHalfWidth(){
        return (width/2);
    }

    public float getHalfHeight(){
        return (height/2);
    }
    public float getCenterX(){
        return (x + getHalfWidth());
    }

    public float getCenterY(){
        return (y + getHalfHeight());
    }
}
