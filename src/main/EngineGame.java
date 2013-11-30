/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import scene.DoorPane;
import scene.Scene;
import scene.ForestPanel;
import java.awt.Toolkit;
import java.awt.Dimension;
import java.awt.Window;

/**
 *
 * @author Cah
 */
public class EngineGame {
    
    private DoorPane DoorScene;
    private ForestPanel Forest;
        
    private SceneFrame sceneframe;
    private Scene currentScene;
    
    private static int WIDTH = 1280;
    private static int HEIGHT = 800;
        
    public EngineGame(){
       // Toolkit tool = Toolkit.getDefaultToolkit();
        //Dimension dim = tool.getScreenSize();
        
        sceneframe = new SceneFrame();
        sceneframe.dispose();
        //sceneframe.setType(Window.Type.NORMAL);
        //sceneframe.setSize(WIDTH, HEIGHT);        
        sceneframe.setVisible(true);   
        sceneframe.jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
              
                if (sceneframe.currentIdx==1){
                    sceneframe.setTextArea("This is working");
                }
                else if (sceneframe.currentIdx==0){
                    sceneframe.setTextArea("This is working better");
                }

                    
                
            }
        });
}
       

   public void addSceneCards() {       
       currentScene = new ForestPanel(sceneframe);
       sceneframe.addScene(currentScene, 0);
       currentScene = new DoorPane(sceneframe);
       sceneframe.addScene(currentScene, 1);
       sceneframe.displayScene(1);       
       
    }
}
