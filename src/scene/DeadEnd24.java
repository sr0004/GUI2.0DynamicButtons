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
public class DeadEnd24 extends Scene {

    Boolean eventOn;

/**
 * Creates a new DeadEnd24 Object
 */
    public DeadEnd24(SceneFrame frame) {
        super("DeadEnd24", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/DeadEnd_24.jpg"))).getImage();
        } catch (Exception e) {
            System.out.println("There is no image by that name");
        }
        
    }
    
    /**
     * Overrides the function initControlButtons.
     */
    @Override
    public void initControlButtons() {
        
    }
    
    /**
     * Overrides the function displayEvents.
     */
    @Override
    public void displayEvents() {
    }
    
    /**
     * Overrides the function paintComponents.
     */
    @Override
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