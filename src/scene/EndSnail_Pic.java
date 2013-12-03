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
public class EndSnail_Pic extends Scene {
    
/**
 * Creates a new EndSnail_Pic Object
 */
    boolean eventOn;
    
    
    public EndSnail_Pic(SceneFrame frame) {
        
        
        super("FirstPanel", frame);
        
        isAlive=true;
        sceneframe.setTextArea("First Time Viewing This\n Scene");
        
        try {
            
                image = (new ImageIcon(getClass().getResource("/resources/SnailAlive.JPG"))).getImage();
                image2 = (new ImageIcon(getClass().getResource("/resources/SnailDead.JPG"))).getImage();
            
                

            
            
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
        

    }
    
    @Override
    public void initControlButtons(){
    }
    
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(false, true, false, false);
        if(isAlive==false)
            sceneframe.updateDirections(true, true, false, false);
            

    }

    
   
    
    
    
    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
        if ((image != null)||(image2!= null)) {
            if(isAlive==true){
            boolean val = g.drawImage(image, 0, 0, 400, 300, this);
            } else if (isAlive ==false){
                boolean val = g.drawImage(image2, 0, 0, 400, 300, this);
            }
        } else {
            System.out.println("Image not found");
        }
        
               
    }         
    
    @Override
    public void displayEvents(){
        
    }
    @Override
    public void setImage(){
        isAlive=false;
        
    }
    private javax.swing.JButton keyButton;
    
        
   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
