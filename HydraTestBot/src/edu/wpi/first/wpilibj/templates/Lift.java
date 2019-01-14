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
public class Lift {   
    
    private static int delayCounter = 0;
    public static int oneTime = 0;
    
    public static void lift()
    {
        Fire();
        raiseLower();
    }
    
    public static void Fire()
    {
        if(RobotMap.assistStick.getRawButton(RobotMap.FIRE_CATA_BUTTON_JOY) == true)
        {
            fire();
  //          fire2();
            
        }
        if(RobotMap.assistStick.getRawButton(RobotMap.FIRE_RESET_BUTTON_JOY) == true)
        {
            reset();
    //        reset2();
        }
        
    }

    public static void reset() {
        RobotMap.catapultSolenoid.set(DoubleSolenoid.Value.kReverse);
        //RobotMap.liftOpenCloseSolenoidTwo.set(DoubleSolenoid.Value.kReverse);
       // System.out.println("Reset Command Sent");
        RobotMap.cataUp = false;
    }

    public static void fire() {
        RobotMap.catapultSolenoid.set(DoubleSolenoid.Value.kForward);
        //RobotMap.liftOpenCloseSolenoidTwo.set(DoubleSolenoid.Value.kForward);
        //System.out.println("Fire Command Sent");
        RobotMap.cataUp = true;
    }
    
    public static void raiseLower()
    {
        if(RobotMap.assistStick.getRawButton(RobotMap.LIFT_LOWER_BUTTON_JOY) == true)
        {
            fire2();
        }
        if(RobotMap.assistStick.getRawButton(RobotMap.LIFT_RAISE_BUTTON_JOY) == true)
        {
            reset2();
        }
    }

    public static void reset2() {
        RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kReverse);
       // System.out.println("Lift Raise Command Sent");
        RobotMap.liftRaise = true;
    }

    public static void fire2() {
        RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kForward);
        //RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kReverse);
        //System.out.println("Lift Lower Command Sent");
        RobotMap.liftRaise = false;
    }
    
 /*   public static void passThrow()
    {
        if(RobotMap.LeftStick.getRawButton(RobotMap.PASS_THROW_BUTTON_JOY) == true)
        {
            RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kForward);
            if(delayCounter == 0)
            {
                delayCounter++;
                RobotMap.timer.start();
            }
            
            if(RobotMap.timer.get() > RobotMap.PASS_THROW_TIME_DELAY)
            {
                RobotMap.catapultSolenoid.set(DoubleSolenoid.Value.kForward);
            }
        }
        delayCounter = 0;
    }
    */
    
    public static void autoClose()
    {
        RobotMap.catapultSolenoid.set(DoubleSolenoid.Value.kReverse);
        //RobotMap.liftOpenCloseSolenoidTwo.set(DoubleSolenoid.Value.kReverse);
        RobotMap.cataUp = false;
        oneTime++;
    }
    public static void autoRaise()
    {
        RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kReverse);
        RobotMap.liftRaise = true;
    }
    public static void autoOpen()
    {
        RobotMap.catapultSolenoid.set(DoubleSolenoid.Value.kForward);
        RobotMap.cataUp = true;
    }
    
 /*   public static void liftWheels()
    {
        if(RobotMap.assistStick.getRawButton(RobotMap.LIFT_WHEEL_BUTTON_JOY))
        {
        try
        {
            RobotMap.LiftWheelJag.setX(RobotMap.LIFT_WHEEL_SPEED);
        }
        catch(CANTimeoutException ex)
        {
            ex.printStackTrace();
            System.out.println("Error With Lift Wheel Motor");
            
        }
        }
    }
    public static void reverseLiftWheels()
    {
        if(RobotMap.assistStick.getRawButton(RobotMap.LIFT_REVERSE_WHEEL_BUTTON_JOY))
        {
        try
        {
            RobotMap.LiftWheelJag.setX(-1*RobotMap.LIFT_WHEEL_SPEED);
        }
        catch(CANTimeoutException ex)
        {
            ex.printStackTrace();
            System.out.println("Error With Lift Wheel Motor");
            
        }
        }
    }
    */
    
}
