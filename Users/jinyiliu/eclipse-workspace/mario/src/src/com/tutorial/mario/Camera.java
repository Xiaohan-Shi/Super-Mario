package com.tutorial.mario;

import com.tutorial.entity.Entity;

public class Camera {
	public int x,y;

	
	public void tick(Entity player) {
		setX(-player.getX() + Game.WIDTH/2);
		setY(-player.getY() + Game.HEIGHT/2);//Game.getFrameWidth doesn't work
	}
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
}
