/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj.CANJaguar;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Gyro;
//import edu.wpi.first.wpilibj.SmartDashboard;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.can.CANTimeoutException;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around. The Game.
 */

//NOTE FROM RYAN:  I have created this RobotMap in the Iterative version of Chimera
//to be the creation place of EVERYTHING!!!  When using the other classes, please
//create the things that are to go between classes here.  Joysticks, Jaguars, Sensors,
//Command Numbers(I'll explain later), etc. etc.
public class RobotMap {
//    Here you will create the constant variables for all things such as ports, side
//    cars, modules, etc.
    
//  public static final int DIGITAL_SIDE_CAR = 1;
    public static final int FRONT_LEFT_MOTOR_JAG = 30;//final value should be 30
    public static final int REAR_LEFT_MOTOR_JAG = 10;//final value should be 10
    public static final int FRONT_RIGHT_MOTOR_JAG = 8;//final value should be 8
    public static final int REAR_RIGHT_MOTOR_JAG = 6;//final value should be 6
    public static final int MOVEMENT_INPUT_PORT = 1;
    public static final int ROTATION_INPUT_PORT = 2;
    public static final int ASSIST_INPUT_PORT = 3;
    public static final int GYRO_CHANNEL = 2;
    public static final double SENSITIVITY = 0.5;
    public static final int INVERT_GYRO = 180;
    public static final double AUTO_SPEED_Y = 0.5;
    public static final double AUTO_SPEED_X  = 0;
    public static final double AUTO_ROTATE_VALUE = 0;
    
    //Place all Variables here
    
   
            
    
    
     //put the constants for button numbers here.
    //All of the buttons below are subject to change based on their programmers
    
    public static final int GYRO_RESET_BUTTON_JOY = 7;

    
//  Create instances here!
    
    public static CANJaguar frontLeftDriveMotor;
    public static CANJaguar frontRightDriveMotor;
    public static CANJaguar rearLeftDriveMotor;
    public static CANJaguar rearRightDriveMotor;
    public static RobotDrive mecanumDrive;
    public static Joystick moveStick, rotateStick, assistStick;
    public static Gyro gyro;

    
    
  //public static XboxControllers xboxMover, xboxRotator;
    
    //create all of your objects here.
   
    
    
        
    
    //public static CANJaguar kickerPullbackOne
    //    create commands and Command Numbers here.
}


/* Game Plan:
We need 
Mecanum Drive System
        4 Jaguars
        Xbox Controller setup
Kicker
        Pullback Mechanism
        Release Mechanism
        Holder Mechanism
            Pass Hold Position
Lifter
        Sweep around Motion
        Lift Motion
        Position Monitoring if not in view of Camera
Camera
        Transmit Video To Dashboard
        Gimble Controls 


*/