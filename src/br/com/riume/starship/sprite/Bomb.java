package br.com.riume.starship.sprite;

import javax.swing.ImageIcon;

public class Bomb extends Sprite {
	
	private boolean destroyed;
	
	public Bomb(int x, int y) {
		initBomb(x, y);
	}
	
	private void initBomb(int x, int y) {
		
		setDestroyed(true);
		
		this.x = x;
		this.y = y;
		
		var bombImg = "src/images/bomb.png";
		var img = new ImageIcon(bombImg);
		setImage(img.getImage());
	}
	
	public void setDestroyed(boolean destroyed) {
		this.destroyed = destroyed;
	}
	
	public boolean isDestroyed() {
		return destroyed;
	}

}
