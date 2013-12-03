
package main;


import scene.*;

/**
 *
 * @author Cah
 */
public class EngineGame {
    
        
    private SceneFrame sceneframe;
    private Scene currentScene;
    
    private static int WIDTH = 1280;
    private static int HEIGHT = 800;
    /**
     * Creates an instance of EngineGame.
     */   
    public EngineGame(){

        
        sceneframe = new SceneFrame();
        sceneframe.dispose();
        sceneframe.setVisible(true);   

}
       
   /**
    * Adds each scene to sceneframe.
    */
   public void addSceneCards() {       
  
       currentScene = new StartingCell_Pic(sceneframe);
       sceneframe.addScene(currentScene, 0);
       
       currentScene = new RightTurn_Pic3(sceneframe);
       sceneframe.addScene(currentScene, 1);

       currentScene = new Gate_Closed_Chain_Pic6(sceneframe);
       sceneframe.addScene(currentScene, 2);
       
       currentScene = new Fork13(sceneframe);
       sceneframe.addScene(currentScene, 3);
       
       currentScene = new HallwayLeft_Pic15(sceneframe);
       sceneframe.addScene(currentScene, 4);
       
       currentScene = new Fork23(sceneframe);
       sceneframe.addScene(currentScene, 5);
       
       currentScene = new KeyAlcove22(sceneframe);
       sceneframe.addScene(currentScene, 6);
       
       currentScene = new Torch_Pic(sceneframe);
       sceneframe.addScene(currentScene, 7);
       
       currentScene = new LockedDoor12(sceneframe);
       sceneframe.addScene(currentScene, 8);
       
       currentScene = new Fork13Second_13(sceneframe);
       sceneframe.addScene(currentScene, 9);
       
       currentScene = new LongHall_32(sceneframe);
       sceneframe.addScene(currentScene, 10);
       
       currentScene = new Alcove_27(sceneframe);
       sceneframe.addScene(currentScene,11);
       
       currentScene = new DarkRoom_Pic(sceneframe);
       sceneframe.addScene(currentScene, 12);
       
       currentScene = new SnailFar_29(sceneframe);
       sceneframe.addScene(currentScene, 13);
       
       currentScene = new EndSnail_Pic(sceneframe); 
       sceneframe.addScene(currentScene, 14);
       
 
       currentScene = new You_Win(sceneframe);
       sceneframe.addScene(currentScene, 15);
       
              
       
    }
}
