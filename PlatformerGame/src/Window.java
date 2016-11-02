import java.awt.Dimension;

import javax.swing.JFrame;

public class Window {
	
	/**
	 * Setup for the window
	 * @param game A object that will be used as a canvas
	 * @param title Title that will be displayed as the title of the window
	 * @param width width of the window
	 * @param height height of the window
	 */
	public Window(Main game, String title, int width, int height){
		JFrame window = new JFrame();
		window.setTitle(title);
		window.setSize(new Dimension(width, height));
		window.setDefaultCloseOperation(window.EXIT_ON_CLOSE);
		window.setLocationRelativeTo(null);
		window.add(game);
		window.setVisible(true);
	}
	
}
