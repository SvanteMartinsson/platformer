import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Player extends AliveObjects{

	private double gravity = 1.02;

	private int jumpSpeed = 15;
	private float jumpTimer = 0;

	private boolean isJumping;
	private boolean isOnGround = false;
	private boolean canFall = false;
	

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
	}

	/**
	 * Updates the player
	 */
	public void update() {
		collision();
		x += velX;
		y += velY;
		
		
		
		if(isOnGround){
			velY = 0;
		}else if(isOnGround == false){
			if(velY==0){
				velY++;
			}
			velY*=gravity;
		}
	}

	public void collision(){
		for(int i = 0; i<handler.envObjects.size(); i++){
			EnvironmentObjects object = handler.envObjects.get(i);
			if(getBounds().intersects(object.getBounds()) && object.id == ID.Ground){
				isOnGround = true;
				
			}
			
			if(getBounds().intersects(object.getBounds()) && object.id == ID.Env){
				isOnGround = true;
				if(x<object.x && y<object.y){
					velX*=-1;
				}
				if(x>object.x && y>object.y){
					velX*=-1;
				}
			}
			
			if(!getBounds().intersects(object.getBounds()) && object.id == ID.Ground && !getBounds().intersects(object.getBounds()) && object.id == ID.Env){
				isOnGround = false;
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
	
	public void jump(){
		if(canJump){
			velY-=jumpSpeed;
		}
	}
	
	public void falling(){
		System.out.println("In fall method");
		if(canFall){
			System.out.println("In jump");
			velY += jumpSpeed;
		}
	}

}
