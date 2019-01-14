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
 * @author j8x6k64q8bf4brf687bw
 */
public class LimitTest {
    
    public static void test(CANJaguar jag)
    {
        try{
            
        
        jag.setX(RobotMap.KICKER_PULLBACK_SPEED);
        }
        catch(CANTimeoutException ex)
        {
            ex.printStackTrace();
            System.out.println("Error!!!!");
        }
    }
    
}
