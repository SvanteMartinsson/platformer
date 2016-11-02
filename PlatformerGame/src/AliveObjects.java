import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

/**
 * 
 * @author Svante Martinsson
 * Things that all AliveObjects have in common
 */
public abstract class AliveObjects {
	
	protected int hp;
	protected double velX;
	protected double velY;
	protected int x;
	protected int y;
	protected Color color;
	protected int width;
	protected int height;
	protected ID id;
	protected boolean jumping;
	
	public abstract Rectangle getBounds();
	public abstract void update();
	public abstract void render(Graphics g);
	public abstract void jump();
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public double getVelX() {
		return velX;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public double getVelY() {
		return velY;
	}
	public void setVelY(int velY) {
		this.velY = velY;
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
