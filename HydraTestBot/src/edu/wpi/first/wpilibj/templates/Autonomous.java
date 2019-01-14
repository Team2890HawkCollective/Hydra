/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and fire the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.DriverStation;

/**
 *
 * @author Matthew Heins
 */
public class Autonomous {
    private static int timerStartOne = 0;
   

    public static void autoMove()
    {
        if(RobotMap.timer.get() < RobotMap.AUTO_MOVE_CUTOFF)
            RobotMap.mecanumDrive.mecanumDrive_Cartesian(RobotMap.AUTO_SPEED_X, RobotMap.AUTO_SPEED_Y, 0.0, 0.0);
        
    }
       
    public static void autoFire()
    {
        if(timerStartOne == 0)
            {
                RobotMap.timer.start();
                timerStartOne++;
            }
        if (RobotMap.timer.get() > RobotMap.FIRE_TIMER_DELAY)
        {
            Lift.fire();
            //Lift.fire2();
        }
        else
            {
            Lift.reset();
            //Lift.reset2();
                    }
    }
  /*  public static void autoLoadFire() {
        if (DriverStation.getInstance().getDigitalIn(RobotMap.DRIVER_STATION_DIGITAL_INPUT) == true)
        {
            Kicker.autoReload();
        }
        if(timerStartOne == 0)
            {
                RobotMap.timer.start();
                timerStartOne++;
            }
        if(RobotMap.timer.get() > RobotMap.FIRE_TIMER_DELAY)
        {
            Lift.autoClose();
            
            if(RobotMap.timer.get() > RobotMap.LIFT_CLOSE_RAISE_TIME_DELAY)
            {
                Lift.autoRaise();
                autoMove();
            }
            if(RobotMap.timer.get() > RobotMap.LIFT_RAISE_OPEN_TIME_DELAY)
            {
                Lift.autoOpen();
            }
            if(RobotMap.timer.get() > RobotMap.LIFT_OPEN_KICKER_FIRE_TIME_DELAY)
            {
                Kicker.autoFire();
            }
            
        } 
    }   */
    
    
}
