package com.mgames;

import com.mgames.entities.Entity;
import com.mgames.util.Flake;
import org.newdawn.slick.*;
import org.newdawn.slick.state.BasicGameState;
import org.newdawn.slick.state.StateBasedGame;

import java.util.ArrayList;

/**
 * Created by mikael on 2017-07-02.
 */
public class Level1 extends BasicGameState {
    //Flake flake = new Flake();
    ArrayList<Flake> flakes = new ArrayList<>();

    public Level1(int Level1) {

    }

    public int getID() {
        return 1;
    }

    public void init(GameContainer gc, StateBasedGame sbc) throws SlickException {
        //ArrayList<Flake> flakes = new ArrayList<>();
        for (int i = 0; i < 75; i++) {
            Flake flake = new Flake();
            flake.init();
            this.flakes.add(flake);

        }

    }

    public void render(GameContainer gc, StateBasedGame sbg, Graphics g) throws SlickException {
        g.setColor(Color.white);
        g.fillRect(0, 500, 800, 100);
        for (Flake flake : this.flakes) {
            g.fillOval(flake.x, flake.y, flake.width, flake.height);

        }

    }

    public void update(GameContainer gc, StateBasedGame sbg, int delta) throws SlickException {
        Input input = gc.getInput();
        for (Flake flake : this.flakes) {
            flake.update(gc, delta);
        }


        if (input.isKeyDown(Input.KEY_ESCAPE)) {
            System.exit(0);
        }

    }

}

