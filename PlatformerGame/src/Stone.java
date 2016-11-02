import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Stone extends EnvironmentObjects{
	
	public Stone(int x, int y, int width, int height, ID id){
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.id = id;
	}
	
	public void render(Graphics g) {
		g.setColor(Color.gray);
		g.fillRect(x, y, width, height);
		
	}

	public void update() {
		
	}

	public Rectangle getBounds() {
		return new Rectangle(x, y, width, height);
	}

}
