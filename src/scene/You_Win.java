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
public class You_Win extends Scene {

    Boolean eventOn;

/**
 * Creates a new You_Win Object
 */
    public You_Win(SceneFrame frame) {
        super("You_Win", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/YouAWinner.jpg"))).getImage();
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