/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package edu.wpi.first.wpilibj.templates;
import edu.wpi.first.wpilibj.can.CANTimeoutException;

/**
 *
 * @author j8x6k64q8bf4brf687bw
 */
public class DriverCompensator {
    
    public static void drive()
    {
        try
        {
        RobotMap.frontLeftDriveMotor.setX(RobotMap.LeftStick.getY() * RobotMap.FRONT_LEFT_COMPENSATION * -1.0);
        RobotMap.frontRightDriveMotor.setX(RobotMap.RightStick.getY() * RobotMap.FRONT_RIGHT_COMPENSATION);
        RobotMap.rearLeftDriveMotor.setX(RobotMap.LeftStick.getY() * RobotMap.REAR_LEFT_COMPENSATION * -1.0);
        RobotMap.rearRightDriveMotor.setX(RobotMap.RightStick.getY() * RobotMap.REAR_RIGHT_COMPENSATION);
        }
        catch (CANTimeoutException ex)
        {
            System.out.println("Manual Tank Drive CAN ERROR");
            ex.printStackTrace();
        }
        
    }
    
}
