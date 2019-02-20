/*
 * @Henry Huang
 * AreaOfTriangle.java
 * Feb 19,2019
 * This program is designed to calculate the area of a scalene triangle using
 * either Heron's formula or using trigonometry.
 */
package areaoftriangle;

/**
 *
 * @author HenryHwang
 */

import javax.swing.*;
import java.lang.*;
public class AreaOfTriangle {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
       //Listing all Variables
        double a;
        double b;
        double c;
        double s;
        double p;
        double areaOne;
        double areaTwo;
        double C;
        
        String aStr,bStr,cStr,angleCStr,input;
        
        //Ask user to choose a method for the calculations
        input = JOptionPane.showInputDialog("Please Enter The Method For The Calculations:"
                + "\n‘H' for Heron's Formula or ‘T' for Trigonometry");
        
      
        System.out.println();
        

        //Ask User to input numbers for each requirement
        aStr = JOptionPane.showInputDialog("Please Enter The First Side of The Triangle:");
        bStr = JOptionPane.showInputDialog("Please Enter The Second Side of The Triangle:");
        
        //Convert input from string to double
        a = Double.parseDouble(aStr);
        b = Double.parseDouble(bStr);
        
        //Determine the area with the method User chose
        if (input == "H")
        {   
            angleCStr = JOptionPane.showInputDialog("Please Enter The Third Angle of The Triangle:");
            C = Double.parseDouble(angleCStr);
           
            areaTwo = (a + b + Math.sin(C)) / 2;
            JOptionPane.showMessageDialog(null,"The are of the triangle is " + areaTwo);
            
        }
        if (input == "T")
        {  
            cStr = JOptionPane.showInputDialog("Please Enter The Third Side of The Triangle:");
            c = Double.parseDouble(cStr);
            p = a + b + c;
            s = p / 2;
            areaOne = Math.sqrt(s * (s - a) * (s - b) * (s - c));
            JOptionPane.showMessageDialog(null,"The area of the triangle is " + areaOne);
        }
        
        //System.out.println(areaOne);
        //System.out.println(areaTwo);
        
        
    }
    
}
