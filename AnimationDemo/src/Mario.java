

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
		moveByAmount(2*dir, 0);
		
	}

	public void jump() {
		// JUMP!
		super.moveByAmount(0, -10);
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
