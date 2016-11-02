import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;

public class Main extends Canvas{
	
	private static final long serialVersionUID = -5029401602585371069L;

	boolean isRunning;
	
	final int WIDTH = 900;
	final int HEIGHT = 650;
	String TITLE = "Platformer";
	
	Handler handler;
	
	
	private BufferStrategy bs;
	
	
	/**
	 * Initilizes everything
	 */
	public Main(){
		isRunning = true;
		handler = new Handler();
		Window window = new Window(this, TITLE, WIDTH, HEIGHT);
		this.createBufferStrategy(3);
		bs = this.getBufferStrategy();
		handler.addObject(new Player(100, 100, Color.green, 32, 75));
		gameLoop();
	}
	
	public static void main(String[] args) {
		new Main();

	}
	
	/**
	 * The game loop
	 */
	public void gameLoop(){
		while(isRunning){
			render();
			update();
		}
	}
	
	/**
	 * Renders everything
	 */
	public void render(){
		Graphics2D g = (Graphics2D) bs.getDrawGraphics();
		
		// Background color
		g.setColor(Color.blue);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		///////////////////////////////////
		
		handler.renderObjects(g);
		
		g.dispose();
		bs.show();
	}
	
	/**
	 * Updates everything
	 */
	public void update(){
		
	}

}
