package scene;

import Animations.BoxShape;
import Animations.MoveableShape;
import Animations.ShapeIcon;
import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.awt.Image;
import javax.swing.ImageIcon;
//import javax.swing.JPanel;
import javax.swing.JButton;
import main.SceneFrame;
import java.awt.Cursor;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.Timer;

/**
 *
 * @author Group 7
 */
public class RightTurn_Pic3 extends Scene {
    
/**
 * Creates a new RightTurn_Pic3 Object
 */
    public RightTurn_Pic3(SceneFrame frame) {
        super("FirstPanel", frame);

        
        
        try {

            image = (new ImageIcon(getClass().getResource("/resources/RightTurn_Pic3.JPG"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
        

    }
    
    /**
     * Overrides the function initControlButtons.
     */
    @Override
    public void initControlButtons(){
  
    }
    /**
     * Overrides the function updateDirectionButtons.
     */
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(false, true, false, true);
    }
    
    /**
     * Overrides the function updateSceneText.
     */
    @Override
    public void updateSceneText(){
        sceneframe.updateSceneText("This is the second scene.");
    }
    

    
    /**
     * Overrides the function painComponent.
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
    
    /**
     * Overrides the function displayEvents.
     */
    @Override
    public void displayEvents(){
        
    }
        
   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}