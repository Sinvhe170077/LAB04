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
public class Item {
    protected int value;
    protected String creator;

    public Item() {
    }

    public Item(int value, String creator) {
        this.value = value;
        this.creator = creator;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }
    public Scanner sc = new Scanner(System.in);
    public void input() {
        
                 
            
      
        value = sc.nextInt();
        sc.nextLine();
        creator= sc.nextLine();  
        
        
    }
    public void output() {
        System.out.println(value);
        System.out.println(creator);
    }
    
}
