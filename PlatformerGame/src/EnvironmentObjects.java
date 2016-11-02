import java.awt.Graphics;

public abstract class EnvironmentObjects {
	
	protected int x;
	protected int y;
	protected int width;
	protected int height;
	
	public abstract void render(Graphics g);
	public abstract void update();
	
}
