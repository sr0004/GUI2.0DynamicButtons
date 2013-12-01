package scene;


import main.SceneFrame;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import main.SceneFrame;
import scene.Scene;

/**
 *
 * @author Group 7
 */
public class Fork13 extends Scene {

    Boolean eventOn;

/**
 * Creates a new Fork23 Object
 */
    public Fork13(SceneFrame frame) {
        super("Fork13", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/Fork_13.jpg"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
    }
    @Override
    public void initControlButtons() {
        
    }
    @Override
    public void displayEvents() {
    }
    
}