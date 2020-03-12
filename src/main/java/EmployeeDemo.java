/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author johnk
 */
public class EmployeeDemo {
    public static void main(String[] args) {
        
        Employee susan = new Employee("Susan Meyers",47899,"Accounting","Vice President");
        Employee mark = new Employee("Mark Jones", 39119, "IT", "Programmer");
        Employee joy = new Employee("Joy Rogers", 81774, "Manufacturing", "Engineer");
        
        System.out.println(susan.getIdNumber() + ", " 
                + susan.getName() + ", " 
                + susan.getDepartment() + ", "
                + susan.getPosition());
     
         System.out.println(mark.getIdNumber() + ", " 
                + mark.getName() + ", " 
                + mark.getDepartment() + ", "
                + mark.getPosition());
         
          System.out.println(joy.getIdNumber() + ", " 
                + joy.getName() + ", " 
                + joy.getDepartment() + ", "
                + joy.getPosition());
    }
}
