package scene;
import main.SceneFrame;
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
public class DungeonHall extends Scene {
    Timer t;
/**
 * Creates a new ForestScene Object
 */
    public DungeonHall (SceneFrame frame) {
        super("ThirdPanel", frame);
        
        try {
            //BufferedImage origImage = ImageIO.read(getClass().getResource("/resources/ForestPath.jpg"));
           //int type = origImage.getType() == 0? BufferedImage.TYPE_INT_ARGB : origImage.getType();
            //image = super.resizeImage(origImage, type);
            //ImageIO.write(resizedimage, "jpg", new File("/resources/ForestPath2.jpg"));
            image = (new ImageIcon(getClass().getResource("/resources/DungeonHallPic.JPG"))).getImage();
        } catch (Exception e) {/*How to handle?*/
        }
        
        this.initControlButtons(); //Change to init
    }
    
    @Override
    public void initControlButtons(){
       this.setLayout(null);
              
       JButton doorButton = new JButton("");
       doorButton.setBounds(240, 95, 105, 105);
       doorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doorButtonActionPerformed(evt);
            }
        });
       doorButton.setOpaque(false);
       doorButton.setContentAreaFilled(false);
       doorButton.setBorderPainted(false);
       doorButton.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
       this.add(doorButton);

    }
        private void doorButtonActionPerformed(java.awt.event.ActionEvent evt) {                                        
             sceneframe.setTextArea("Test Message");
              sceneframe.displayScene(2);
    } 
    
    

    
    
    
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        //Graphics2D g2 = (Graphics2D) g;
        if (image != null) {
            boolean val = g.drawImage(image, 0, 0, 400, 300, this);            
        } else {
            System.out.println("Image not found");
        }
               
    }         
    
    @Override
    public void displayEvents(){
        
    }
        
    private static final int ICON_WIDTH = 400;
   private static final int ICON_HEIGHT = 100;
   private static final int CAR_WIDTH = 100;
}