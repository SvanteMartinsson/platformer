import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyInput extends KeyAdapter{

	Handler handler;

	public KeyInput(Handler handler){
		this.handler = handler;
	}

	@Override
	public void keyPressed(KeyEvent e) {
		int key = e.getKeyCode();
		for(int i = 0; i<handler.aliveObjects.size(); i++){
			AliveObjects object = handler.aliveObjects.get(i);
			if(object.id == ID.Player){
				if(key == KeyEvent.VK_D){
					object.velX = 2;
				}
				if(key == KeyEvent.VK_A){
					object.velX = -2;
				}
				if(key == KeyEvent.VK_SPACE){
					object.y-=80;
				}
				if(key == KeyEvent.VK_ESCAPE){
					System.exit(0);
				}
					
			}
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		int key = e.getKeyCode();

		for(int i = 0; i<handler.aliveObjects.size(); i++){
			AliveObjects object = handler.aliveObjects.get(i);
			if(object.id == ID.Player){
				if(key == KeyEvent.VK_D){
					object.velX = 0;
				}
				if(key == KeyEvent.VK_A){
					object.velX = 0;
				}
				
			}
		}

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}



}
