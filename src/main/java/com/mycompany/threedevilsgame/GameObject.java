/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.threedevilsgame;

/**
 *
 * @author LENOVO
 */
public interface GameObject {
    /** setter/getter for X position*/
    int getX();
    void setX(int x);
    /** setter/getter for Y position*/
    int getY();
    void setY(int y);
    /** @return	 object width   */
    int getWidth();
    /** @return	 object height  */
    int getHeight();
    /** @return	 object visible or not */
    boolean isVisible();
    /** @return	 object movement frames */
    java.awt.image.BufferedImage[] getSpriteImages();
        
    public void draw(java.awt.Graphics canvas);    
}
