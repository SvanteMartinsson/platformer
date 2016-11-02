import java.awt.Color;
import java.awt.Graphics;

/**
 * 
 * @author Svante Martinsson
 * Things that all AliveObjects have in common
 */
public abstract class AliveObjects {
	
	protected int hp;
	protected int velX;
	protected int velY;
	protected int x;
	protected int y;
	protected Color color;
	protected int width;
	protected int height;
	
	public abstract void update();
	public abstract void render(Graphics g);
	
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getVelX() {
		return velX;
	}
	public void setVelX(int velX) {
		this.velX = velX;
	}
	public int getVelY() {
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
