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
import main.SceneFrame;

/**
 *
 * @author Group 7
 */
public class Gate_Closed_Chain_Pic6 extends Scene {
    
/**
 * Creates a new Gate_Closed_Chain_Pic6 Object
 */
    public Gate_Closed_Chain_Pic6(SceneFrame frame) {
        super("FirstPanel", frame);
        isClosed=true;
        
        
        try {

            image = (new ImageIcon(getClass().getResource("/resources/Gate_Closed_Chain_Pic6.JPG"))).getImage();
            image2 = (new ImageIcon(getClass().getResource("/resources/Gate_Open_Chain_Pic6.JPG"))).getImage();
        } catch (Exception e) {
            System.out.println("There is no image by that name");
        }
        
        this.initControlButtons(); //Change to init
        

    }
    
    /**
     * Overrides the function initControlButtons.
     */
    @Override
    public void initControlButtons(){
               this.setLayout(null);

       
       GateButton = new JButton("");
       GateButton.setBounds(310, 20, 30, 150);
       GateButton.setContentAreaFilled(false);
       GateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GateButtonActionPerformed(evt);
            }
        });
       GateButton.setOpaque(false);
       GateButton.setContentAreaFilled(false);
       GateButton.setBorderPainted(false);
       GateButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       this.add(GateButton);
  
    }
    /**
     * Defines GateButton action event.
     */
    private void GateButtonActionPerformed (java.awt.event.ActionEvent evt) {                                        
              System.out.println("Pull Chain");
              isClosed=false;
              sceneframe.repaintScene();
              GateButton.setVisible(false);
              sceneframe.updateDirections(true, true, false, false);
              
              
        }
   
    
    
    /**
     * Overrides the function paintComponent.
     */
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
        if ((image != null)||(image2!= null)) {
            if(isClosed==true){
            boolean val = g.drawImage(image, 0, 0, 400, 300, this);
            } else if (isClosed ==false){
                boolean val = g.drawImage(image2, 0, 0, 400, 300, this);
            }          
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
    
    /**
     * Overrides the function setImage.
     */
    @Override
    public void setImage(){
        isClosed=false;
    }
    
    /**
     * Overrides the function updateDirectionButtons.
     */
    @Override
    public void updateDirectionButtons(){
        if(isClosed==true)
        sceneframe.updateDirections(false, true, false, false);
        else
            sceneframe.updateDirections(true, true, false, false);

    }

        
   private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
   
   private javax.swing.JButton GateButton;
}