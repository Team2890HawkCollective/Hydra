/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.DoubleSolenoid;
/**
 *
 * @author matthewheins
 */
public class Lift {/*
    
    
    public static void lift()
    {
        openClose();
        raiseLower();
    }
    public static void openClose()
    {
        if(RobotMap.moveStick.getRawButton(RobotMap.LIFT_OPEN_BUTTON_JOY) == true)
        {
            open();
        }
        if(RobotMap.moveStick.getRawButton(RobotMap.LIFT_CLOSE_BUTTON_JOY) == true)
        {
            close();
        }
        
    }

    public static void close() {
        RobotMap.liftOpenCloseSolenoid.set(DoubleSolenoid.Value.kReverse);
        //RobotMap.liftOpenCloseSolenoidTwo.set(DoubleSolenoid.Value.kReverse);
        System.out.println("Lift Close Command Sent");
        RobotMap.liftOpen = false;
    }

    public static void open() {
        RobotMap.liftOpenCloseSolenoid.set(DoubleSolenoid.Value.kForward);
        //RobotMap.liftOpenCloseSolenoidTwo.set(DoubleSolenoid.Value.kForward);
        System.out.println("Lift Open Command Sent");
        RobotMap.liftOpen = true;
    }
    
    public static void raiseLower()
    {
        if(RobotMap.moveStick.getRawButton(RobotMap.LIFT_LOWER_BUTTON_JOY) == true)
        {
            RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kForward);
            //RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kReverse);
            System.out.println("Lift Lower Command Sent");
            RobotMap.liftRaise = false;
        }
        if(RobotMap.moveStick.getRawButton(RobotMap.LIFT_RAISE_BUTTON_JOY) == true)
        {
            RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kReverse);
            System.out.println("Lift Raise Command Sent");
            RobotMap.liftRaise = true;
        }
    }
    public static void passThrow()
    {
        if(RobotMap.moveStick.getRawButton(RobotMap.PASS_THROW_BUTTON_JOY) == true)
        {
            RobotMap.liftRaiseLowerSolenoid.set(DoubleSolenoid.Value.kForward);
            delayCounter++;
            if(delayCounter > 75)
            {
                RobotMap.liftOpenCloseSolenoid.set(DoubleSolenoid.Value.kForward);
            }
        }
        delayCounter = 0;
    }
          
    */
}
