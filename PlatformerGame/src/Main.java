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
		this.addKeyListener(new KeyInput(handler));
		handler.addObject(new Player(200, 0, Color.green, 32, 75, handler, ID.Player));
		handler.addEnv(new Stone(0, 600, 900, 30, ID.Env));
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
			 long lastTime = System.nanoTime();
		        double amountOfTicks = 60.0;
		        double ns = 1000000000 / amountOfTicks;
		        double delta = 0;
		        long timer = System.currentTimeMillis();
		        int frames = 0;
		        while(isRunning)
		        {
		                    long now = System.nanoTime();
		                    delta += (now - lastTime) / ns;
		                    lastTime = now;
		                    while(delta >=1)
		                            {
		                                update();
		                                delta--;
		                            }
		                            if(isRunning)
		                                render();
		                            frames++;
		                            
		                            if(System.currentTimeMillis() - timer > 1000)
		                            {
		                                timer += 1000;
		                               // System.out.println("FPS: "+ frames);
		                                frames = 0;
		                            }
		        }
		                
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
		handler.updateObjects();
	}

}
