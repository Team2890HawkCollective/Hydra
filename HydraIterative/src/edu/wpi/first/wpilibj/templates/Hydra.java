/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.AnalogPotentiometer;


/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class Hydra extends IterativeRobot {
    
    int printCounter;
    
    public void robotInit() {
   /*     try
    {
    RobotMap.limitTestMotor = new CANJaguar(30);
    }
    catch(CANTimeoutException ex)
    {
        System.out.println("Error");
        ex.printStackTrace();
    }
        */
        try 
        {
           /*RobotMap.frontLeftDriveMotor = new CANJaguar(RobotMap.FRONT_LEFT_MOTOR_JAG);
           RobotMap.frontRightDriveMotor = new CANJaguar(RobotMap.FRONT_RIGHT_MOTOR_JAG);
           RobotMap.rearLeftDriveMotor = new CANJaguar(RobotMap.REAR_LEFT_MOTOR_JAG);
           RobotMap.rearRightDriveMotor = new CANJaguar(RobotMap.REAR_RIGHT_MOTOR_JAG);
           RobotMap.gyro = new Gyro(RobotMap.GYRO_CHANNEL); */
           RobotMap.kickerPullbackOne = new CANJaguar(RobotMap.KICKER_PULLBACK_JAG_ONE);
           RobotMap.kickerPullbackTwo = new CANJaguar(RobotMap.KICKER_PULLBACK_JAG_TWO);
        }
        catch (CANTimeoutException g){
            System.out.print("\n\nCAN ERROR CAUGHT!!!!!");
            g.printStackTrace();
        }
        
       /* RobotMap.mecanumDrive = new RobotDrive(
          RobotMap.frontLeftDriveMotor,
          RobotMap.rearLeftDriveMotor,
          RobotMap.frontRightDriveMotor,
          RobotMap.rearRightDriveMotor);
        */
        
        RobotMap.moveStick = new Joystick(RobotMap.MOVEMENT_INPUT_PORT);
        //RobotMap.xboxMover = new XboxControllers(RobotMap.MOVEMENT_INPUT_PORT);
        RobotMap.rotateStick = new Joystick(RobotMap.ROTATION_INPUT_PORT);
        RobotMap.assistStick = new Joystick(RobotMap.ASSIST_INPUT_PORT);
        //RobotMap.xboxRotator = new XboxControllers(RobotMap.ROTATION_INPUT_PORT);
        
        //RobotMap.analogPotentiometer = new AnalogPotentiometer(RobotMap.POTENTIOMETER_PORT);
        
        printCounter = 0;  
        //int autoCounter = 0;
    }
    

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        

    }
    
    public void operatorControl()
    {
        //if (printCounter % 10 == 0)
        //    System.out.println("Gyro Angle = " + RobotMap.gyro.getAngle());
        
        RobotMap.mecanumDrive.mecanumDrive_Cartesian(
                RobotMap.moveStick.getX() * RobotMap.SENSITIVITY,
                //RobotMap.xboxMover.getRightStickY() * RobotMap.SENSITIVITY,
                RobotMap.moveStick.getY() * RobotMap.SENSITIVITY,
                //RobotMap.xboxMover.getLeftStickY() * RobotMap.SENSITIVITY,
                RobotMap.rotateStick.getY() * RobotMap.SENSITIVITY,
                //RobotMap.xboxMover.getLeftStickX() * RobotMap.SENSITIVITY,
                RobotMap.gyro.getAngle()/* + RobotMap.INVERT_GYRO*/);
        }
    
    public void resetGyro()
    {
        if(RobotMap.moveStick.getRawButton(RobotMap.GYRO_RESET_BUTTON_JOY) == true)
                RobotMap.gyro.reset();
        /*if(RobotMap.xboxMover.getA() == true)
                RobotMap.gyro.reset();
        
        
        */
    }
    
    
    public void getPotentiometerValue()
    {
            System.out.println(RobotMap.analogPotentiometer.get()*100);
    }
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        //operatorControl();
        //resetGyro();
        Kicker.reload();
        Kicker.fire();
        //PressureSwitch.Switch();
        //PressureSwitch.autoSwitch();
        //Lift.lift();
        //System.out.println(LimiterSwitch.isAtLimit());
        //RobotMap.kickerPullbackOne.set(RobotMap.assistStick.getY());
        //limiterSwitch();
        //LimitTest.test(RobotMap.limitTestMotor);
    }

    public void limiterSwitch() {
        /*if(printCounter % 2 == 0)
        {
        System.out.println(RobotMap.LIMITER_SWITCH.get());
        
        }
    printCounter++;
      */
    }
    
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
