

import java.awt.*;
import java.util.*;

import processing.core.PImage;

public class Mario extends Sprite {

	public static final int MARIO_WIDTH = 40;
	public static final int MARIO_HEIGHT = 60;

	public Mario(PImage img, int x, int y) {
		super(img, x, y, MARIO_WIDTH, MARIO_HEIGHT);
	}

	// METHODS
	public void walk(int dir) {
		// WALK!
	}

	public void jump() {
		// JUMP!
	}

	public void act(ArrayList<Shape> obstacles) 
	{
		boolean freeFall = true;
		for(Shape s : obstacles)
		{
			if(s.contains(this.getCenterX(), this.getMaxY()))
				freeFall = false;
		}
		if(freeFall)
			moveByAmount(0, 1);
		// FALL (and stop when a platform is hit)
	}


}
