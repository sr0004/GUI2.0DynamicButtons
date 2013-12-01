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
    public LongHall_32(SceneFrame frame) {
        super("LongHall_32", frame);        
                          
        try {
            //BufferedImage origImage = ImageIO.read(getClass().getResource("/resources/ForestPath.jpg"));
           //int type = origImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : origImage.getType();
            //image = super.resizeImage(origImage, type);
            //ImageIO.write(resizedimage, "jpg", new File("/resources/ForestPath2.jpg"));
            image = (new ImageIcon(getClass().getResource("/resources/ForestPath.jpg"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
    }
    
       public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
            if (image != null && image2 != null) {               

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
    public void initControlButtons(){
      
    }
}

