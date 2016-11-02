import java.awt.Graphics;
import java.awt.Rectangle;

public abstract class EnvironmentObjects {
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	protected ID id;
	
	public abstract void render(Graphics g);
	public abstract void update();
	public abstract Rectangle getBounds();
	
}
