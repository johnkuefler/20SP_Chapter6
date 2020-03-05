/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class Rectangle {
    
    public double length;
    private double width;
    
    public void setLength(double len) {
        this.length = len;
    }
    
    public double getLength() {
        return this.length;
    }
    
    public void setWidth(double w) {
        this.width = w;
    }
    
    public double getWidth() {
        return this.width;
    }
    
    public double getArea() {
        return this.length * this.width;
    }
}
