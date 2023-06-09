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
public class Statue extends Item{
    public int weight;
    public String colour;

    public Statue() {
    }

    public Statue(int weight, String colour) {
        this.weight = weight;
        this.colour = colour;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }
    public void inputStatue() {
   Scanner sc=new Scanner(System.in);
        boolean ok=true;
        while(ok)
        try{
             input();
             weight=sc.nextInt();
             sc.nextLine();
             colour=sc.nextLine();
             if(value<=0||creator==""){
                 throw new Exception();
             }
             ok=false;
        }catch(Exception e){
            ok=true;
        }
    }
    public void outputStatue() {
     output();
        System.out.println("Weight" + weight);
        System.out.println("Colour" + colour);
    }
}
