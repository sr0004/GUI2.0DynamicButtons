package scene;


import main.SceneFrame;
import java.awt.Cursor;
import Animations.BoxShape;
import Animations.MoveableShape;
import Animations.ShapeIcon;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.Timer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;

/**
 *
 * @author Group 7
 */
public class KeyAlcove22 extends Scene {

    Boolean eventOn;

/**
 * Creates a new KeyAlcove22 Object
 */
    public KeyAlcove22(SceneFrame frame) {
        super("KeyAlcove22", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/KeyAlcove_22.jpg"))).getImage();
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

       
       keyButton = new JButton("");
       keyButton.setBounds(160, 155, 80, 50);
       keyButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/key.png")));
       keyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                keyButtonActionPerformed(evt);
            }
        });
       keyButton.setOpaque(true);
       keyButton.setContentAreaFilled(false);
       keyButton.setBorderPainted(false);
       keyButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       this.add(keyButton);
    }
    
    /**
     * Defines KeyButton action event.
     */
    
    private void keyButtonActionPerformed (java.awt.event.ActionEvent evt) {                                        
              System.out.println("Pick up key");
              keyButton.setVisible(false);
              sceneframe.frameKeyButton.setEnabled(true);
              
    }
        
    /**
     * Overrides the function displayEvents.
     */
    @Override
    public void displayEvents() {
    }
    
    /**
     * Overrides the function updateDirectionButtons.
     */
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(false, true, false, false);

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
    
    private javax.swing.JButton keyButton;
    
    
}