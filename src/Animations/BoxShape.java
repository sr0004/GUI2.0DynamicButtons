/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Animations;

/**
 *
 * @author Seymore
 */

import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;


public class BoxShape implements MoveableShape {
    
       public BoxShape(int x, int y, int width)
   {
      this.x = x;
      this.y = y;
      this.width = width;
   }

   public void translate(int dx, int dy)
   {
      x += dx;
      y += dy;
   }
   
      public void draw(Graphics2D g2)
   {
      Rectangle2D.Double body
            = new Rectangle2D.Double(x, y + width / 6, 
                  width - 1, width / 6);
      g2.draw(body);
   }
   private int x;
   private int y;
   private int width;
}
