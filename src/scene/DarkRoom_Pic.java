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
public class DarkRoom_Pic extends Scene {
    
/**
 * Creates a DarkRoom_Pic Object
 */
    public DarkRoom_Pic(SceneFrame frame) {
        
        super("DarkRoom", frame);
        isDark=true;
        sceneframe.setTextArea("First Time Viewing This\n Scene");
        
        try {

            image = (new ImageIcon(getClass().getResource("/resources/DarkRoom.JPG"))).getImage();
            image2 = (new ImageIcon(getClass().getResource("/resources/LitRoom.JPG"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
        

    }
    
    @Override
    public void initControlButtons(){
                       this.setLayout(null);


       SwordButton = new JButton("");
       SwordButton.setVisible(false);
       SwordButton.setBounds(150, 100, 100, 150);
       SwordButton.setContentAreaFilled(false);
       SwordButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Steel_sword_icon.png")));
       SwordButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SwordButtonActionPerformed(evt);
            }
        });
       SwordButton.setOpaque(false);
       SwordButton.setContentAreaFilled(false);
       SwordButton.setBorderPainted(false);
       SwordButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       this.add(SwordButton);
  
    }
    
    private void SwordButtonActionPerformed (java.awt.event.ActionEvent evt) {                                        
              System.out.println("Pick up sword.");
              SwordButton.setVisible(false);
              sceneframe.jButton1.setEnabled(true);
              
        }
    
    public void updateButtons(){
        SwordButton.setVisible(true);
    }
    
  
    
    
   
    
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
        if ((image != null)||(image2!= null)) {
            if(isDark==true){
            boolean val = g.drawImage(image, 0, 0, 400, 300, this);
            } else if (isDark ==false){
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
    
    public void updateDirectionButtons(){
        sceneframe.updateDirections(false, true, false, false);

    }
    
    
    @Override
    public void setImage(){
        isDark=false;
    }
        
   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
   private javax.swing.JButton SwordButton;
}
