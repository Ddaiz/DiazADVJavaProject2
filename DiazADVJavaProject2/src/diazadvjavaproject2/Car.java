/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package diazadvjavaproject2;

import java.awt.Color;

/**
 *
 * @author Dave
 */
public class Car 
{
    // Member variables of Car
    private String make;
    private String model;
    private Color color;
    private int speed;
    
    // Constructor of car that will accept inputs of make, model, and color, with 
    // default of 0 for speed.
    public Car (String make, String model, Color color)
    {
        this.make = make;
        this.model = model;
        this.color = color;
        speed = 0;
    }
    
    // Get and set methods for make, model, color, and speed.
    public String getMake()
    {
        return make;
    }
    
    public void setMake(String make)
    {
        this.make = make;
    }    
    
    public String getModel()
    {
        return model;
    }
    
    public void setModel(String model)
    {
        this.model = model;
    }    
    
    public Color getColor()
    {
        return color;
    }
    
    public void setColor(Color color)
    {
        this.color = color;
    }        
    
    public int getSpeed()
    {
        return speed;
    }
    
    // The accelerate method will increase the value of speed by 5.
    public void accelerate()
    {
        speed += 5;
    }
    
    // The brake method will decrease the value of speed by 5.    
    public void brake()
    {
        speed -=5;
    }
}
