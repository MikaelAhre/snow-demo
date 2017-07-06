package com.mgames;

/**
 * Created by mikael on 2017-07-02.
 */
import org.newdawn.slick.*;
import org.newdawn.slick.state.*;
import org.lwjgl.input.Mouse;

public class MainMenu extends BasicGameState {

    public MainMenu(int startMenu) {
    }

    public int getID() {
        return 0;
    }

    public void init(GameContainer gc, StateBasedGame sbg) throws SlickException {

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.drawString("Play",(400-5),(300-20) );
        g.drawString("Exit",(400-5),(300 + 20) );
    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        int posX = Mouse.getX();
        int posY = Mouse.getY();
        if((posX > 397 && posX < 435) && (posY < 320 && posY > 296)) {
            if (input.isMouseButtonDown(0))
                sbg.enterState(1);
        }
        if((posX > 397 && posX < 435) && (posY < 275 && posY > 261)) {
            if (input.isMouseButtonDown(0))
                System.exit(0);
        }

        System.out.println("X: " + posX + " " + " Y: " + posY);
        //play button

    }
}
