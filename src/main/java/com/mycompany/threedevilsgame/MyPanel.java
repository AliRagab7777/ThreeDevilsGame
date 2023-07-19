
package com.mycompany.threedevilsgame;

import java.awt.Graphics;
import java.util.ArrayList;
import javax.swing.JPanel;


public class MyPanel extends JPanel implements DrawingEngine{

    private ArrayList<ImageObject> objs = new ArrayList<ImageObject>();
    
    @Override
    public void paintComponent(Graphics g){
      super.paintComponent(g);
        for(ImageObject s: objs){
            g.drawImage(s.getSpriteImages()[0], s.getX(), s.getY(), this);
        }
    }
    
    @Override
    public void addObject(ImageObject shape) {
        objs.add(shape);
    }

    @Override
    public void removeObject(ImageObject shape) {
        objs.remove(shape);
    }

    @Override
    public ImageObject[] getObjects() {
        return objs.toArray(new ImageObject[objs.size()]);
    }
    
    @Override
    public void refresh(Graphics canvas) {
        repaint();
    }
}
