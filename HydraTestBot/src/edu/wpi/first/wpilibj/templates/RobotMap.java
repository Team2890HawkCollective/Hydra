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
import edu.wpi.first.wpilibj.AnalogPotentiometer;
import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.can.CANTimeoutException;
import edu.wpi.first.wpilibj.DigitalInput;
import edu.wpi.first.wpilibj.AnalogTrigger;
import edu.wpi.first.wpilibj.DriverStation;

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
    public static final int FRONT_LEFT_MOTOR_JAG = 50;//final value should be 50    DONE
    public static final int REAR_LEFT_MOTOR_JAG = 6;//final value should be 6       DONE
    public static final int FRONT_RIGHT_MOTOR_JAG = 30;//final value should be 30   DONE
    public static final int REAR_RIGHT_MOTOR_JAG = 10;//final value should be 10    DONE
    
    
    public static final double FRONT_LEFT_COMPENSATION = 1.0;
    public static final double FRONT_RIGHT_COMPENSATION = 1.0;
    public static final double REAR_LEFT_COMPENSATION = 1.0;
    public static final double REAR_RIGHT_COMPENSATION = 1.0;
    
    
    public static final int MOVEMENT_INPUT_PORT = 1; //
    public static final int ROTATION_INPUT_PORT = 2;
    public static final int ASSIST_INPUT_PORT = 3;
    
    public static final int GYRO_CHANNEL = 2;
    
    public static final double SENSITIVITY = 0.5;
    public static final int INVERT_GYRO = 180;
    
    public static final double AUTO_SPEED_Y = 0.2;
    public static final double AUTO_SPEED_X  = 0;
    public static final double AUTO_ROTATE_VALUE = 0;
    
  //  public static final int FIRE_PNEUMATIC_FORWARD_CHANNEL = 5;//final value should be 
   //  public static final int FIRE_PNEUMATIC_REVERSE_CHANNEL = 6;//placeholder value
    public static final int CATAPULT_PNEUMATIC_FORWARD_CHANNEL = 3;// FINAL IS 3
    public static final int CATAPULT_PNEUMATIC_REVERSE_CHANNEL = 4;//  FINAL IS 4
    
    public static final int LIFT_RAISE_LOWER_PNEUMATIC_FORWARD_CHANNEL = 1;//FINAL IS 1
    public static final int LIFT_RAISE_LOWER_PNEUMATIC_REVERSE_CHANNEL = 2;// FINAL IS 2
    
    public static final int COMPRESSOR_PRESSURE_SWITCH_CHANNEL = 3; //final value should be 3
    public static final int COMPRESSOR_RELAY_CHANNEL = 1; //final value should be 1
    
    public static final int LIFT_WHEEL_JAG = 25;// final value should be 25
    
    public static final int DRIVER_STATION_DIGITAL_INPUT = 1;
    
    public static final double LIFT_WHEEL_SPEED = 0.25; //placeholder
    
    //public static final double PASS_THROW_TIME_DELAY = 0.23748C; //this number is perfectly accurate as of Kyle
    public static final double FIRE_TIMER_DELAY = 2 ; //USED IN AUTONOMOUS
    public static final double AUTO_MOVE_CUTOFF = 5;
    
  /*  public static final double LIFT_CLOSE_RAISE_TIME_DELAY = 1.2 + FIRE_TIMER_DELAY; //this number is accurate as of Gavin
    public static final double LIFT_RAISE_OPEN_TIME_DELAY  = 1.2 + LIFT_CLOSE_RAISE_TIME_DELAY; //this number is accurate as of Gavin
    public static final double LIFT_OPEN_KICKER_FIRE_TIME_DELAY = 0.5 + LIFT_RAISE_OPEN_TIME_DELAY; //this number is accurate as of Eric
    */
    
    
    //Place all Variables here
    
    public static boolean cataUp;
    public static boolean liftRaise;
            
    
    
    
    
    
     //put the constants for button numbers here.
    //All of the buttons below are subject to change based on their programmers
    //ALL BUTTONS EXCEPTING GYRO_RESET ARE ON THE ASSISTING STICK
    //GYRO_RESET IS ON THE LEFT STICK
    
    public static final int GYRO_RESET_BUTTON_JOY = 4;
    //public static final int RELOAD_BUTTON_JOY = 3;
    public static final int LIFT_WHEEL_BUTTON_JOY = 6;
    public static final int LIFT_REVERSE_WHEEL_BUTTON_JOY = 7;
    public static final int LIFT_RAISE_BUTTON_JOY = 3;
    public static final int LIFT_LOWER_BUTTON_JOY = 2;
    public static final int FIRE_RESET_BUTTON_JOY = 5;
    public static final int FIRE_CATA_BUTTON_JOY = 4;
   // public static final int COMPRESSOR_ON_BUTTON = 6;
    //public static final int COMPRESSOR_OFF_BUTTON = 7;
   // public static final int PASS_THROW_BUTTON_JOY = 10;
    
    
    
//  Create instances here!
    
    public static CANJaguar frontLeftDriveMotor;
    public static CANJaguar frontRightDriveMotor;
    public static CANJaguar rearLeftDriveMotor;
    public static CANJaguar rearRightDriveMotor;
    public static CANJaguar limitTestMotor;
    public static RobotDrive mecanumDrive;
    public static Joystick LeftStick, RightStick, assistStick;
    public static Gyro gyro;
    public static CANJaguar LiftWheelJag;
  //  public static CANJaguar kickerPullbackTwo;  Only using one pullback jaguar
    
    
  //public static XboxControllers xboxMover, xboxRotator;
    
    //create all of your objects here.
    public static Timer timer = new Timer();
   // public static DoubleSolenoid firePiston = new DoubleSolenoid(FIRE_PNEUMATIC_FORWARD_CHANNEL,
     //        FIRE_PNEUMATIC_REVERSE_CHANNEL);
    public static DoubleSolenoid catapultSolenoid = new 
            DoubleSolenoid(CATAPULT_PNEUMATIC_FORWARD_CHANNEL,
            CATAPULT_PNEUMATIC_REVERSE_CHANNEL); 
    public static DoubleSolenoid liftRaiseLowerSolenoid = new 
            DoubleSolenoid(LIFT_RAISE_LOWER_PNEUMATIC_FORWARD_CHANNEL,
            LIFT_RAISE_LOWER_PNEUMATIC_REVERSE_CHANNEL);  
    public static Compressor compressor = new Compressor(COMPRESSOR_PRESSURE_SWITCH_CHANNEL,
        COMPRESSOR_RELAY_CHANNEL);
    
    
    
    
    
    
    
        
    
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