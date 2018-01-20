package org.usfirst.frc.team5119.robot.commands;

import org.usfirst.frc.team5119.robot.Robot;

import edu.wpi.first.wpilibj.command.TimedCommand;

/**
 *
 */
public class TimedDrive extends TimedCommand {
	private double fwdSpd;
	private double trnSpd;

    public TimedDrive(double forwardSpeed, double turnSpeed, double timeout) {
        super(timeout);
        // Use requires() here to declare subsystem dependencies
        requires(Robot.driveSubsystem);
        fwdSpd = forwardSpeed;
        trnSpd = turnSpeed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.driveSubsystem.driveRobot(fwdSpd, trnSpd);
    }

    // Called once after timeout
    protected void end() {
    	Robot.driveSubsystem.driveRobot(0, 0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
