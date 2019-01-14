/*
 * To change this template, choose Tools | Templates
 * and fire the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
/**
 *
 * @author Matthew Heins
 */
public class Kicker {
    /*
    
    static int pistonTrigger = 0;
    public static int oneTime = 0;
    //is in RobotMap
    
    public static void reload()
    {
        if(RobotMap.RightStick.getRawButton(RobotMap.RELOAD_BUTTON_JOY) == true)
        {
           
           /* if(pistonTrigger == 0)
            {
            movePistonIn();
            pistonTrigger++;
            }                       This was when we had the shoot and reload functions mapped to the same button
             */   
    /*
            if(LimiterSwitch.isAtLimit() == true)//change end condition to be determined by the Limit reader test one says true
            {
                try {
                    RobotMap.LiftWheelJag.setX(RobotMap.LIFT_WHEEL_SPEED);
                   // RobotMap.kickerPullbackTwo.setX(RobotMap.LIFT_WHEEL_SPEED);  Only using one pullback Jaguar
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
                   RobotMap.LiftWheelJag.setX(0);
                 //  RobotMap.kickerPullbackTwo.setX(0);   Only using one pullback Jaguar
               }
               catch (CANTimeoutException eq){
                   System.out.println("KICKER DUN BROAKT'ED");
                   eq.printStackTrace();
               }
               movePistonOut();
            }
        }
        pistonTrigger = -20;
    }
    
    public static void fire()
    {
        if(RobotMap.cataUp == false)
            Lift.fire();
        if(RobotMap.RightStick.getRawButton(RobotMap.LIFT_WHEEL_BUTTON_JOY) == true)
            movePistonIn();
    }
    public static void autoFire()
    {
//        movePistonIn();
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
    public static void autoReload()
    {
        if(oneTime == 0)
        {
            if(LimiterSwitch.isAtLimit() == true)//change end condition to be determined by the Limit reader test one says true
            {
                try {
                    RobotMap.LiftWheelJag.setX(RobotMap.LIFT_WHEEL_SPEED);
                   // RobotMap.kickerPullbackTwo.setX(RobotMap.LIFT_WHEEL_SPEED);  Only using one pullback Jaguar
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
                   RobotMap.LiftWheelJag.setX(0);
                 //  RobotMap.kickerPullbackTwo.setX(0);   Only using one pullback Jaguar
               }
               catch (CANTimeoutException eq){
                   System.out.println("KICKER DUN BROKEDED");
                   eq.printStackTrace();
               }
               oneTime++;
            }
        }
        
    }*/
}