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
 * Creates a new Fork23 Object
 */
    public KeyAlcove22(SceneFrame frame) {
        super("KeyAlcove22", frame);        
                eventOn = false; 
                          
        try {
            image = (new ImageIcon(getClass().getResource("/resources/KeyAlcove_22.jpg"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
        
    }
    
    @Override
    public void initControlButtons(){
       this.setLayout(null);

       
       keyButton = new JButton("");
       keyButton.setBounds(100, 210, 80, 50);
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
    
    
    
    private void keyButtonActionPerformed (java.awt.event.ActionEvent evt) {                                        
              System.out.println("Pick up key");
              keyButton.setVisible(false);
              sceneframe.jButton3.setEnabled(true);
              
    }
        
    
    @Override
    public void displayEvents() {
    }
    
    private javax.swing.JButton keyButton;
}