package org.usfirst.frc.team5119.robot.subsystems;

import org.usfirst.frc.team5119.robot.commands.Drive;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class DriveSubsystem extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	protected static final WPI_TalonSRX frontRight = new WPI_TalonSRX(0);
	protected static final WPI_TalonSRX frontLeft = new WPI_TalonSRX(1);
	protected static final WPI_TalonSRX backRight = new WPI_TalonSRX(2);
	protected static final WPI_TalonSRX backLeft = new WPI_TalonSRX(3);
	
	protected static final SpeedControllerGroup rightMotors = new SpeedControllerGroup(frontRight, backRight);
	protected static final SpeedControllerGroup leftMotors = new SpeedControllerGroup(frontLeft, backLeft);
	
	protected static final DifferentialDrive drive = new DifferentialDrive(leftMotors, rightMotors);


	
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new Drive());
    }
    
    public void driveRobot(double fwd, double turn) {
    	drive.arcadeDrive(fwd, turn, false);
    }
    public int getEncoderCount() {
    	return 5;
    }
}

