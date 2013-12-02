package scene;

import java.awt.Color;
import javax.swing.JPanel;
import java.awt.Image;
import main.SceneFrame;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.awt.Graphics2D;


public abstract class Scene extends JPanel {

    public Image image;
    public boolean isOpen;
    public Image image2;
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
    
      public static BufferedImage resizeImage(BufferedImage originalImage, int type){
	BufferedImage resizedImage = new BufferedImage(IMG_WIDTH, IMG_HEIGHT, type);
	Graphics2D g = resizedImage.createGraphics();
	g.drawImage(originalImage, 0, 0, IMG_WIDTH, IMG_HEIGHT, null);
	g.dispose(); 
        
	return resizedImage;
    }
    
    public void setFrameRef(SceneFrame frame){
        sceneframe = frame;
    }

    public String getCardName() {
        return sceneName;
    }

  public abstract void initControlButtons();
  public abstract void displayEvents(int[] buttonArray);
  
 // public abstract void implementControlButtons();
}