/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example;

import java.util.Scanner;

public class ColorRange {

    public static void main(String args[]) {
        
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Enter the wavelength");
        
        double range = sc.nextDouble();
        
        
        if ( range >= 380 && range <450){
            
            System.out.println("The color is red");
            
        }else if ( range >= 450 && range <495){
            
            System.out.println("The color is blue");
            
        }else if ( range >= 495 && range < 570){
            
            System.out.println("The color is green");
            
        }else if ( range >= 570 && range < 590){
            
            System.out.println("The color is yellow");
            
        }else if ( range >= 590 && range < 620){
            
            System.out.println("The color is orange");
            
        }else if ( range >= 620 && range < 750){
            
            System.out.println("Tge color is red");
        }else{
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
        }
    }
