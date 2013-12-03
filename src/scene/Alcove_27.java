package scene;


import main.SceneFrame;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import main.SceneFrame;
import scene.Scene;

/**
 *
 * @author Group 7
 */
public class  Alcove_27 extends Scene {

    Boolean eventOn;

/**
 * Creates a new Alcove_27 Object
 */
    public Alcove_27(SceneFrame frame) {
        super("Alcove_27", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/Alcove_27.jpg"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
    }
    
    /**
     * Overrides the function initControlButtons.
     */
    @Override
    public void initControlButtons() {
        
    }
    /**
     * Overrides the function updateDirectionButtons.
     */
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(false, true, false, false);

    }
    /**
     * Overrides the function displayEvents.
     */
    @Override
    public void displayEvents() {
    }
        public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
        if (image != null) {
            boolean val = g.drawImage(image, 0, 0, 400, 300, this);
        } else {
            System.out.println("Image not found");
        }        
    }  
    
}