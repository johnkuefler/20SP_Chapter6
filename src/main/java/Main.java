
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author johnk
 */
public class Main {

    public static void main(String[] args) {
       
        Student myStudent = new Student("0123456");
        myStudent.setFirstName("John");
        
        myStudent.enrollInClass("Introduction to Programming");
        myStudent.enrollInClass(240);

        
        
        Rectangle myRectangle = new Rectangle(5, 10);
              
        double area = myRectangle.getArea();
        
        
        Rectangle myRectangle2 = new Rectangle();
        Rectangle myRectangle3 = new Rectangle();

        double sqFootage = getSqFootageOfHouse(myRectangle, myRectangle2, myRectangle3);
    }
    
    
    public static double getSqFootageOfHouse(Rectangle room1, 
            Rectangle room2, 
            Rectangle room3) {
        
        double area1 = room1.getArea();
        double area2 = room2.getArea();
        double area3 = room3.getArea();
        
        return area1+area2+area3;
        
    }

}
