/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
/**
 *
 * @author matthewheins
 */
public class Kicker {
    
    static int pistonTrigger = 0;
    //is in RobotMap
    
    public static void reload()
    {
        if(RobotMap.rotateStick.getRawButton(RobotMap.RELOAD_BUTTON_JOY) == true)
        {
            //if(RobotMap.liftOpen == false)
              //  Lift.open();
            if(pistonTrigger == 0)
            {
            movePistonIn();
            pistonTrigger++;
            }
                
            if(LimiterSwitch.isAtLimit() == true)//change end condition to be determined by the Limit reader test one says true
            {
                try {
                    RobotMap.kickerPullbackOne.setX(RobotMap.KICKER_PULLBACK_SPEED);
                    RobotMap.kickerPullbackTwo.setX(RobotMap.KICKER_PULLBACK_SPEED);
                } 
                catch (CANTimeoutException ex) 
                {
                    System.out.println("CAN error caught in Kicker !@#$!");
                    ex.printStackTrace();
                }       
            }
            else
            {
               try {
                   RobotMap.kickerPullbackOne.setX(0);
                   RobotMap.kickerPullbackTwo.setX(0);
               }
               catch (CANTimeoutException eq){
                   System.out.println("KICKER DUN BROKEDED");
                   eq.printStackTrace();
               }
               movePistonOut();
            }
        }
        pistonTrigger = -20;
    }
    
    public static void fire()
    {
        if(RobotMap.rotateStick.getRawButton(RobotMap.FIRE_BUTTON_JOY) == true)
            movePistonIn();
    }
    
    public static void movePistonOut()
    {
        RobotMap.firePiston.set(DoubleSolenoid.Value.kForward);
        System.out.println("Fire Piston move out Command Sent");
    }
    public static void movePistonIn()
    {
        RobotMap.firePiston.set(DoubleSolenoid.Value.kReverse);
        System.out.println("Fire Piston Retract Command Sent");
    }
    public static void stopPiston()
    {
        RobotMap.firePiston.set(DoubleSolenoid.Value.kOff);
        System.out.println("Fire Piston Stop Command Sent");
    }
    
    
    
}
