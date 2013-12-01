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
 * Creates a new ForestScene Object
 */
    public EndSnail_Pic(SceneFrame frame) {
        super("FirstPanel", frame);
        sceneframe.setTextArea("First Time Viewing This\n Scene");
        
        try {
            //BufferedImage origImage = ImageIO.read(getClass().getResource("/resources/ForestPath.jpg"));
           //int type = origImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : origImage.getType();
            //image = super.resizeImage(origImage, type);
            //ImageIO.write(resizedimage, "jpg", new File("/resources/ForestPath2.jpg"));
            image = (new ImageIcon(getClass().getResource("/resources/Door&Vase.JPG"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
        

    }
    
    @Override
    public void initControlButtons(){
  
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
    
    @Override
    public void displayEvents(){
        
    }
        
    private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}
