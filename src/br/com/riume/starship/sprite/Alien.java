package br.com.riume.starship.sprite;

import javax.swing.ImageIcon;

public class Alien extends Sprite {
	
	private Bomb bomb;
	
	public Alien(int x, int y) {
		initAlien(x, y);
	}
	
	private void initAlien(int x, int y) {
		
		this.x = x;
		this.y = y;
		
		bomb = new Bomb(x, y);
		
		var alienImg = "src/images/alien.png";
		var img = new ImageIcon(alienImg);
		
		setImage(img.getImage());
	}
	
	public void act(int direction) {
		this.x += direction;
	}

	public Bomb getBomb() {
		return bomb;
	}

	public void setBomb(Bomb bomb) {
		this.bomb = bomb;
	}
	
	
}
