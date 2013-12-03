package scene;


import main.SceneFrame;
import java.awt.Cursor;
import java.awt.Graphics;
import javax.swing.ImageIcon;
import javax.swing.Timer;
import main.SceneFrame;
import scene.Scene;

/**
 *
 * @author Group 7
 */
public class LockedDoor12 extends Scene {

    Boolean eventOn;
    

/**
 * Creates a new LockedDoor12 Object
 */
    public LockedDoor12(SceneFrame frame) {
        super("LockedDoor12", frame);
        isClosed=true;
        
        
        try {            
            image = (new ImageIcon(getClass().getResource("/resources/LockedDoor_12.JPG"))).getImage();
            image2 = (new ImageIcon(getClass().getResource("/resources/OpenDoor_12.JPG"))).getImage();
        } catch (Exception e) {
            System.out.println("There is no image by that name");
        }
        
        this.initControlButtons(); //Change to init        

    }
    
    /**
     * Overrides the function initControlButtons.
     */
    @Override
    public void initControlButtons() {
        
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
        if(isClosed==false)
            sceneframe.updateDirections(true, true, false, false);

    }
    
    /**
     * Overrides the function paintComponent.
     */
    @Override
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
     * Overrides the function SetImage.
     */
        @Override
        public void setImage(){
        isClosed=false; 
        }
}