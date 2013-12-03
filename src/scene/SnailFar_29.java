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
public class  SnailFar_29 extends Scene {

    Boolean eventOn;

/**
 * Creates a new SnailFar_29 Object
 */
    public SnailFar_29(SceneFrame frame) {
        super("SnailFar_29", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/SnailFar_29.jpg"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        

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
