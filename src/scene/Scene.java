package scene;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Image;
import main.SceneFrame;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;

/**
 * Abstract class describing the scene object
 * @author sra0004
 */

public abstract class Scene extends JPanel {

    public Image image;
    public Image image2;
    public boolean isClosed, isAlive, isDark;

    

    
   
    //public BufferedImage yeah;
    private String sceneName;
    public SceneFrame sceneframe;
    
    private static final int IMG_WIDTH = 400;
    private static final int IMG_HEIGHT = 300;

    public Scene(String cn, SceneFrame frame) {
        
        setName(cn);
        this.setSize(IMG_WIDTH, IMG_HEIGHT);
        //this.setBorder(null);
        this.setBackground(Color.WHITE);
        sceneframe = frame;
    }
    
    /**
     * BufferedImaged resizes images and draws them for each scene.
     */
    public static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose(); 
        
	return resizedImage;
    }
    
    /**
     * setFrameRef sets an instance of jFrame = to a predefined frame.
     */
    public void setFrameRef(SceneFrame frame){
        sceneframe = frame;
    }
    
    /**
     * Gets the name for each Scene card.
     */
    public String getCardName() {
        return sceneName;
    }
    
    /**
     * Set the image variable in scenes with multiple possible images.
     */
    public void setImage(){
    }
    
    /**
     * Updates the jFrames item buttons.
     */
    public void updateButtons(){
        
    }
    
    /**
     * enables or disables direction buttons based on the scene.
     */
    public void updateDirectionButtons(){
    
    }
    
    /**
     * Updates jTextPanel1 for each unique scene.
     */
    public void updateSceneText(){
        
    }
        

 public abstract void initControlButtons();
 public abstract void displayEvents();
  
 // public abstract void implementControlButtons();
}