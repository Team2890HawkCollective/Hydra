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
     
        /*
        CANJaguar has a method called getPosition that will return the current position of the encoder or *POTENTIOMETER*
        */
        try 
        {
           RobotMap.frontLeftDriveMotor = new CANJaguar(RobotMap.FRONT_LEFT_MOTOR_JAG);
           RobotMap.frontRightDriveMotor = new CANJaguar(RobotMap.FRONT_RIGHT_MOTOR_JAG);
           RobotMap.rearLeftDriveMotor = new CANJaguar(RobotMap.REAR_LEFT_MOTOR_JAG);
           RobotMap.rearRightDriveMotor = new CANJaguar(RobotMap.REAR_RIGHT_MOTOR_JAG);
           RobotMap.gyro = new Gyro(RobotMap.GYRO_CHANNEL);
          // RobotMap.LiftWheelJag = new CANJaguar(RobotMap.LIFT_WHEEL_JAG);
        }
        catch (CANTimeoutException g){
            System.out.print("\n\nCAN ERROR CAUGHT!!!!!");
            g.printStackTrace();
        }
        
        RobotMap.mecanumDrive = new RobotDrive(
          RobotMap.frontLeftDriveMotor,
          RobotMap.rearLeftDriveMotor,
          RobotMap.frontRightDriveMotor,
          RobotMap.rearRightDriveMotor);
        
        
        RobotMap.LeftStick = new Joystick(RobotMap.MOVEMENT_INPUT_PORT);
        //RobotMap.xboxMover = new XboxControllers(RobotMap.MOVEMENT_INPUT_PORT);
        RobotMap.RightStick = new Joystick(RobotMap.ROTATION_INPUT_PORT);
        RobotMap.assistStick = new Joystick(RobotMap.ASSIST_INPUT_PORT);
        //RobotMap.xboxRotator = new XboxControllers(RobotMap.ROTATION_INPUT_PORT);
                
        printCounter = 0;  
        //int autoCounter = 0;
    }
    

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Autonomous.autoFire();
        Autonomous.autoMove();
        PressureSwitch.autoSwitch();

    }
    
    public void operatorControl()
    {
        //if (printCounter % 10 == 0)
        //    System.out.println("Gyro Angle = " + RobotMap.gyro.getAngle());
        
        
        RobotMap.mecanumDrive.mecanumDrive_Cartesian(
                RobotMap.LeftStick.getX(),
                //RobotMap.xboxMover.getRightStickY() * RobotMap.SENSITIVITY,
                RobotMap.LeftStick.getY() * RobotMap.SENSITIVITY,
                //RobotMap.xboxMover.getLeftStickY() * RobotMap.SENSITIVITY,
                RobotMap.RightStick.getY(),
                //RobotMap.xboxMover.getLeftStickX() * RobotMap.SENSITIVITY,
                0.0);
                //RobotMap.gyro.getAngle()// + RobotMap.INVERT_GYRO);
        
                
        
        //RobotMap.mecanumDrive.tankDrive(RobotMap.LeftStick.getY() * -1, RobotMap.RightStick.getY());
        }
    
    public void resetGyro()
    {
        if(RobotMap.LeftStick.getRawButton(RobotMap.GYRO_RESET_BUTTON_JOY) == true)
                RobotMap.gyro.reset();
        /*if(RobotMap.xboxMover.getA() == true)
                RobotMap.gyro.reset();
        
        
        */
    }
    
    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        operatorControl();
        resetGyro();
        //DriverCompensator.drive();

        PressureSwitch.autoSwitch();
        Lift.lift();
        //Lift.liftWheels();
        //Lift.reverseLiftWheels();
        
        
        
    }

    
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
