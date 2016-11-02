import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends AliveObjects{

	private double gravity = 1.02;
	
	Handler handler;
	
	/**
	 * Setup for the player
	 * @param x x-cordinate
	 * @param y y-cordinate
	 * @param color Color of the player
	 * @param width width of the player
	 * @param height height of the player
	 */
	public Player(int x, int y, Color color, int width, int height, Handler handler, ID id){
		this.x = x;
		this.y = y;
		this.velX = velX;
		this.velY = velY;
		this.color = color;
		this.width = width;
		this.height = height;
		this.handler = handler;
		this.id = id;
		velY = 1;
	}
	
	/**
	 * Updates the player
	 */
	public void update() {
		collision();
		x += velX;
		y += velY;
		velY *= gravity;
	}
	
	public void collision(){
		for(int i = 0; i<handler.envObjects.size(); i++){
			EnvironmentObjects object = handler.envObjects.get(i);
			if(getBounds().intersects(object.getBounds()) && object.id == ID.Env){
				
				/*
				 *  Denna if-elsen ska fixas senare,
				 *  den ska g�ra att om man hoppar och f�r n�got i huvudet ska 
				 *  man fall och om man landar p� n�got ska man inte �ka igenom
				 */
				if(velY>0){
					velY = 0;
				}else{
					velY = 0;
				}
				
				
			}
		}
	}

	/**
	 * Renders the player
	 */
	public void render(Graphics g) {
		
		g.setColor(color);
		g.fillRect(x, y, width, height);
	}
	
	/**
	 * This method returns a rectangle around the player which will help with collision
	 */
	public Rectangle getBounds(){
		return new Rectangle(x, y, width, height);
		
	}

}
