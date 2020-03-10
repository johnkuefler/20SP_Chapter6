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
    
    private double length;
    private double width;
     
    public Rectangle(double len, double wid) {
        if (len <= 0 || wid <=0) {
            // this is an error
        }
        
        this.length = len;
        this.width = wid;
    }
    
    public Rectangle(double lenAndWid) {
        this.length = lenAndWid;
        this.width = lenAndWid;
    }
    
    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }
    
    
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
        double area = this.length * this.width;
        
        return area;
    }
}
