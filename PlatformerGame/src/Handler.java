import java.awt.Graphics;
import java.util.LinkedList;


/**
 * 
 * @author Svante Martinsson
 * 
 * This class handles all the objects in the game
 *
 */
public class Handler {
	
	LinkedList<AliveObjects> aliveObjects = new LinkedList<AliveObjects>();
	LinkedList<EnvironmentObjects> envObjects = new LinkedList<EnvironmentObjects>();
	
	/**
	 * Renders all objects in the aliveObjects list & the envObjects list
	 * @param g
	 */
	public void renderObjects(Graphics g){
		
		for(int i = 0; i<aliveObjects.size(); i++){
			aliveObjects.get(i).render(g);
		}
		
		for(int i = 0; i<envObjects.size(); i++){
			envObjects.get(i).render(g);
		}
	}
	
	/**
	 * Updates all objects in the aliveObjects list & the envObjects list
	 */
	public void updateObjects(){
		for(int i = 0; i<aliveObjects.size(); i++){
			aliveObjects.get(i).update();
		}
		
		for(int i = 0; i<aliveObjects.size(); i++){
			envObjects.get(i).update();
		}
	}
	
	/**
	 * Add objects to the aliveObjects list
	 * @param object Object that will be added to the list.
	 */
	public void addObject(AliveObjects object){
		aliveObjects.add(object);
	}
	
	
	/**
	 * Remove objects from the aliveObjects list
	 * @param object Object that will be removed from the list.
	 */
	public void removeObject(AliveObjects object){
		aliveObjects.remove(object);
	}
	
	/**
	 * Add objects to the envObjects list
	 * @param object Object that will be added to the list.
	 */
	public void addEnv(EnvironmentObjects object){
		envObjects.add(object);
	}
	
	/**
	 * Object that will be removed from the list.
	 * @param object Objects that will be removed from the list
	 */
	public void removeEnv(EnvironmentObjects object){
		envObjects.remove(object);
	}

}
