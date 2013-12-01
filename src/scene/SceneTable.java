/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package scene;

import main.SceneFrame;
import java.util.ArrayList;

/**
 *
 * @author cah0020
 */
public final class SceneTable {
    private static int[][] scenetable;
   
      //index of the scene row
      
    public SceneTable(){
        scenetable = new int[10][5];
        initTable();
        
    }
    
    public int changeScene(int x, int y){
        return scenetable[x][y];        
    }
    
    public void initTable(){
        //forest: 1 N 2 S 3 E 4 W
        scenetable[0][0] = 1;
        scenetable[0][1] = 1;
        scenetable[0][2] = 1;
        scenetable[0][3] = 1;
        
        scenetable[1][0] = 0;
        scenetable[1][1] = 0;
        scenetable[1][2]  = 0;
        scenetable[1][3] = 0;        
    }
    
}
