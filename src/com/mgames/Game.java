package com.mgames;

import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.state.StateBasedGame;

/**
 * Created by mikael on 2017-07-02.
 */
public class Game extends StateBasedGame {

    public static final String gameName = "Open Space Invaders";
    public static final int startMenu = 0;
    public static final int level1 = 1;

    public Game(String gameName){
        super(gameName);
        this.addState(new MainMenu(startMenu));
        this.addState(new Level1(level1));
    }

    public void initStatesList(GameContainer gc) throws SlickException{
        this.getState(startMenu).init(gc, this);
        this.getState(level1).init(gc, this);
        this.enterState(level1);
    }
    public static void main(String[] args){
        AppGameContainer agc;
        try{
            agc = new AppGameContainer(new Game(gameName));
            agc.setMaximumLogicUpdateInterval(1);
            agc.setSmoothDeltas(true);
            agc.setDisplayMode(800, 600, false);
            agc.setVSync(true);
            agc.start();
        } catch (SlickException e){
            e.printStackTrace();
        }

    }
}
