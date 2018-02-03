package org.usfirst.frc.team5119.robot.commands;

import org.usfirst.frc.team5119.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class MoveMast extends Command {
double _speed = 0;
boolean isDone;
    public MoveMast(double speed) {
        // Use requires() here to declare subsystem dependencies
        requires(Robot.mastSubsystem);
        _speed = speed;
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.mastSubsystem.move(_speed);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	if (_speed > 0) {
    		isDone = Robot.mastSubsystem.isAtTop();
    	}else {
    		isDone = Robot.mastSubsystem.isAtOrigin();
    	}
        return isDone;
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.mastSubsystem.move(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	Robot.mastSubsystem.move(0);
    }
}
