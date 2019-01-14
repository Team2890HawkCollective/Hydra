/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
/**
 *
 * @author david marquart
 */
public class LimiterSwitch {
    
    public static boolean isAtLimit()
    {
           
        try
        {
            //System.out.println("CANLimit is being read");
            return RobotMap.kickerPullbackOne.getForwardLimitOK();
            
        }
        catch(CANTimeoutException ex)
        {
            System.out.println("CAN error caught in Limiter method");
            ex.printStackTrace();
        }
        return false;
        
    }
    
}