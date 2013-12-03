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
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
    }
    
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
                        
    
    @Override
    public void displayEvents(){
        
    }
    
    @Override
    public void updateDirectionButtons(){
        sceneframe.updateDirections(true, true, true, false);

    }
       
    
    @Override
    public void initControlButtons(){
      
    }
}

