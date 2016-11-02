import java.awt.Color;
import java.awt.Graphics;

public class Player extends AliveObjects{

	
	
	/**
	 * Setup for the player
	 * @param x x-cordinate
	 * @param y y-cordinate
	 * @param color Color of the player
	 * @param width width of the player
	 * @param height height of the player
	 */
	public Player(int x, int y, Color color, int width, int height){
		this.x = x;
		this.y = y;
		this.velX = velX;
		this.velY = velY;
		this.color = color;
		this.width = width;
		this.height = height;
	}
	
	/**
	 * Updates the player
	 */
	public void update() {
		
		
	}

	/**
	 * Renders the player
	 */
	public void render(Graphics g) {
		
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}

}
