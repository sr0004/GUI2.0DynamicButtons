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
public class  Fork13Second_13 extends Scene {

    Boolean eventOn;

/**
 * Creates a new Fork13Second_13 Object
 */
    public Fork13Second_13(SceneFrame frame) {
        super("Fork13_Second", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/Fork13_Second.jpg"))).getImage();
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
     * Overrides the function updatedirectionButtons.
     */
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(false, true, true, true);

    }
    
    /**
     * Overrides the function paintComponent.
     */
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
