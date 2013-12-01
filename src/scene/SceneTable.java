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
        scenetable = new int[20][4];
        initTable();
        
    }
    
    public int changeScene(int x, int y){
        int c = scenetable[x][y]; 
        return c;        
    }
    
    public void initTable(){
        //forest: 0 F 1 B 2 R 3 L
        scenetable[0][0] = 1;
        scenetable[0][1] = -1;
        scenetable[0][2] = -1;
        scenetable[0][3] = -1;
        
        scenetable[1][0] = -1;
        scenetable[1][1] = 0;
        scenetable[1][2] = 2;
        scenetable[1][3] = -1;
        
        scenetable[2][0] = 3;
        scenetable[2][1] = 1;
        scenetable[2][2] = -1;
        scenetable[2][3] = -1;
        
        scenetable[3][0] = -1;
        scenetable[3][1] = 2;
        scenetable[3][2]  = 4;
        scenetable[3][3] = 8;
        
        scenetable[4][0] = 5;
        scenetable[4][1] = 3;
        scenetable[4][2] = -1;
        scenetable[4][3] = -1;
        
        scenetable[5][0] = -1;
        scenetable[5][1] = 4;
        scenetable[5][2]  = 6;
        scenetable[5][3] = 7;
        
        scenetable[6][0] = -1;
        scenetable[6][1] = 5;
        scenetable[6][2] = -1;
        scenetable[6][3] = -1;
        
        scenetable[7][0] = -1;
        scenetable[7][1] = 5;
        scenetable[7][2]  = -1;
        scenetable[7][3] = -1;
        
        scenetable[8][0] = 9;
        scenetable[8][1] = 3;
        scenetable[8][2] = -1;
        scenetable[8][3] = -1;
        
        scenetable[9][0] = -1;
        scenetable[9][1] = 8;
        scenetable[9][2]  = 10;
        scenetable[9][3] = 13;
        
        scenetable[10][0] = 12;
        scenetable[10][1] = 9;
        scenetable[10][2] = -1;
        scenetable[10][3] = 11;
        
        scenetable[11][0] = -1;
        scenetable[11][1] = 10;
        scenetable[11][2]  = -1;
        scenetable[11][3] = -1;
        
        scenetable[12][0] = -1;
        scenetable[12][1] = 10;
        scenetable[12][2] = -1;
        scenetable[12][3] = -1;
        
        scenetable[13][0] = 14;
        scenetable[13][1] = 9;
        scenetable[13][2]  = -1;
        scenetable[13][3] = -1;
        
        scenetable[14][0] = 15;
        scenetable[14][1] = 13;
        scenetable[14][2] = -1;
        scenetable[14][3] = -1;
        
        scenetable[15][0] = -1;
        scenetable[15][1] = -1;
        scenetable[15][2] = -1;
        scenetable[15][3] = -1;
            
    }
    
}
