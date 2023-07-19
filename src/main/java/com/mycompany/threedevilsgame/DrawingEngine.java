/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.threedevilsgame;

/**
 *
 * @author LENOVO
 */
public interface DrawingEngine {
    // manage shapes objects:
    public void addObject(ImageObject shape);
    public void removeObject(ImageObject shape);
    
    // return the created shapes objects:
    public ImageObject[] getObjects();
    
    // redraw all shapes on the canvas:
    public void refresh(java.awt.Graphics canvas);
}
