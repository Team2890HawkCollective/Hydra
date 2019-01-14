/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.AnalogPotentiometer;

/**
 *
 * @author Taylor and Mr. Douglas
 */
public class Potentiometer 
{
    public Potentiometer()
    {
        RobotMap.analogPotentiometer = new AnalogPotentiometer(4);
        System.out.println("Initialized");
    }
    
    public void output()
    {
        System.out.println(RobotMap.analogPotentiometer.get()*100);
    }
    
}
