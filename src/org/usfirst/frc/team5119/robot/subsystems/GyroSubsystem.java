package org.usfirst.frc.team5119.robot.subsystems;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.SPI;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class GyroSubsystem extends Subsystem {
	protected AHRS gyro = new AHRS(SPI.Port.kMXP);
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public double getGyroAngle() {
    	return gyro.getAngle();
    }
    public double getPitch() {
    	return gyro.getPitch();
    }
}

