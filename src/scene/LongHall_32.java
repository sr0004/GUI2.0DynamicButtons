/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scene;

import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import main.SceneFrame;

/**
 *
 * @author Henry
 */
public class LongHall_32 extends Scene{
    
    /**
     * Creates a new LongHall_32 object.
     * @param frame 
     */
    public LongHall_32(SceneFrame frame) {
        super("LongHall_32", frame);        
                          
        try {

            image = (new ImageIcon(getClass().getResource("/resources/LongHall_32.jpg"))).getImage();
        } catch (Exception e) {
            System.out.println("There is no image by that name");
        }
        
        this.initControlButtons(); //Change to init
    }
    
    /**
     * Overrides the function paintComponents.
     */
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
            if (image != null) {               

                    boolean val = g.drawImage(image, 0, 0, 400, 300, this);
            }
                else {
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
     * Overrides the function updateDirectionButtons.
     */
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(true, true, true, false);

    }
       
    /**
     * Overrides the function initControlButtons.
     */
    @Override
    public void initControlButtons(){
      
    }
}

