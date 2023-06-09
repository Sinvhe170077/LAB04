/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DTO;

import java.util.Scanner;

/**
 *
 * @author Nguyen Van Si
 */
public class Painting extends Item {
    private int height;
    private int width;
    private boolean isWatercolour ;
    private boolean isFramed;

    public Painting() {
    }

    public Painting(int height, int width, boolean isWatercolour, boolean isFramed) {
        this.height = height;
        this.width = width;
        this.isWatercolour = isWatercolour;
        this.isFramed = isFramed;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public boolean isIsWatercolour() {
        return isWatercolour;
    }

    public void setIsWatercolour(boolean isWatercolour) {
        this.isWatercolour = isWatercolour;
    }

    public boolean isIsFramed() {
        return isFramed;
    }

    public void setIsFramed(boolean isFramed) {
     this.isFramed=isFramed;
    }
    public void inputPainting() {
        
       boolean ok=true;
        while(ok)
        try{
             input();
             height=sc.nextInt();
             sc.nextLine();
             width=sc.nextInt();
             isWatercolour=sc.nextBoolean();
             isFramed=sc.nextBoolean();
             if(value<=0||creator==""){
                 throw new Exception();
             }
             ok=false;
        }catch(Exception e){
            ok=true;
        }
    }
    public void outputPainting() {
        output();
        System.out.println("Height" + height);
        System.out.println("Width" +width);
        System.out.println("IsWaterColour : " + isWatercolour);
        System.out.println("IsFramed : " + isFramed);
    }
}
