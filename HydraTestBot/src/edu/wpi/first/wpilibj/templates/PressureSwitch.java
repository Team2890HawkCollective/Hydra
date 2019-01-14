/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Relay;
/**
 *
 * @author 
 */
public class PressureSwitch 
{
   static int printCounter = 0;
    
  /*  public static void Switch()
    {
        //System.out.println(RobotMap.compressor.getPressureSwitchValue());
        
        //if(RobotMap.compressor.getPressureSwitchValue() == false)
        if(RobotMap.RightStick.getRawButton(RobotMap.COMPRESSOR_ON_BUTTON) == true)
        {
            RobotMap.compressor.setRelayValue(Relay.Value.kOn);
            RobotMap.compressor.start();
            if (printCounter % 10 == 0)
                System.out.println("Compressor On");
            printCounter++;
        }
        else
        {
            RobotMap.compressor.setRelayValue(Relay.Value.kOff);
            RobotMap.compressor.stop();
            if (printCounter % 10 == 0)
                System.out.println("Compressor Off");
            printCounter++;
        }
        //if(RobotMap.compressor.getPressureSwitchValue() == true)
    }
    */
   
    public static void autoSwitch()
    {
        if(RobotMap.compressor.getPressureSwitchValue() == false)
        {
            RobotMap.compressor.setRelayValue(Relay.Value.kOn);
            RobotMap.compressor.start();
            /*if (printCounter % 10 == 0)
                System.out.println("Compressor On");
            printCounter++;*/
        }

        else
        {
            RobotMap.compressor.setRelayValue(Relay.Value.kOff);
            RobotMap.compressor.stop();
            /*if (printCounter % 10 == 0)
                System.out.println("Compressor Off");
            printCounter++;*/
        }
    }
}
