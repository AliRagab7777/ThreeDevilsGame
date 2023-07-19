/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.threedevilsgame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;

import javax.imageio.ImageIO;

import java.io.File;

public class ImageObject implements GameObject{
    private static final int MAX_MSTATE = 1;
    // an array of sprite images that are drawn sequentially
    private BufferedImage[] ArrImage = new BufferedImage[MAX_MSTATE];
    File F ;
    private int x;
    private int y;
    private boolean visible;
    private int type;
	
    public ImageObject(int posX, int posY, String path){
        this(posX, posY, path, 0);
    }
	
    public ImageObject(int posX, int posY, String imagePath, int type){
        this.x = posX;
        this.y = posY;
        this.type = type;
        this.visible = true;
        // create a bunch of buffered images and place into an array, to be displayed sequentially
        try {
            F =new File(imagePath);
            //ArrImage[0] = ImageIO.read(getClass().getClassLoader().getResourceAsStream(imagePath));
            ArrImage[0] = ImageIO.read(F);		//ArrImage[0] = ImageIO.read(getClass().getResourceAsStream(imagePath));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public int getX() {
        return x;
    }

    @Override
    public void setX(int mX) {
        this.x = mX;
    }

    @Override
    public int getY() {
        return y;
    }
    
    @Override
    public void setY(int mY) {
        this.y = mY;
    }

    @Override
    public BufferedImage[] getSpriteImages() {
        return ArrImage;
    }

    @Override
    public int getWidth(){
        return ArrImage[0].getWidth();
    }

    @Override
    public int getHeight() {
        return ArrImage[0].getHeight();
    }

    @Override
    public boolean isVisible() {
        return visible;
    }

    public void setVisible(boolean visible){
        this.visible = visible;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public void draw(Graphics canvas) {
        
    }
}
