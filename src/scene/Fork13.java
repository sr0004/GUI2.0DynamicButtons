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
public class Fork13 extends Scene {

    Boolean eventOn;

/**
 * Creates a new Fork23 Object
 */
    public Fork13(SceneFrame frame) {
        super("Fork13", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/Fork_Pic13.jpg"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons();
        
    }
    @Override
    public void initControlButtons() {
        
    }
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