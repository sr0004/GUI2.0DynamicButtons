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
public class LockedDoor12 extends Scene {

    Boolean eventOn;

/**
 * Creates a new Fork23 Object
 */
    public LockedDoor12(SceneFrame frame) {
        super("LockedDoor12", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/LockedDoor_12.jpg"))).getImage();
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