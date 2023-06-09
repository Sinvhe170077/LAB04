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
public class Vase extends Item{
    public int height;
    public String material;
    
    public Vase() {
    }

    public Vase(int height, String material) {
        this.height = height;
        this.material = material;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
    public void outputVase() {
       output();
        System.out.println("Height: " + height);
        System.out.println("Material: " +material );
          
    }
    public void inputVase() {
        Scanner sc=new Scanner(System.in);
        boolean ok=true;
        while(ok)
        try{
             input();
             height=sc.nextInt();
             sc.nextLine();
             material=sc.nextLine();
             if(value<=0||creator==""){
                 throw new Exception();
             }
             ok=false;
        }catch(Exception e){
            ok=true;
        }
      
    }
    
    
}
