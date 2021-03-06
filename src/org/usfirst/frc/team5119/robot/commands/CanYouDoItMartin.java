package org.usfirst.frc.team5119.robot.commands;

import org.usfirst.frc.team5119.robot.Robot;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class CanYouDoItMartin extends CommandGroup {
	
	//this code seems to make it turn at a near perfect 90 degrees

    public CanYouDoItMartin() {
    	requires(Robot.driveSubsystem);
        // Add Commands here:
        addSequential(new TimedDrive(0.25, 0, 2));
        addSequential(new TimedDrive(0, -0.25, 2));
        addSequential(new TimedDrive(0.25, 0, 2));
        addSequential(new TimedDrive(0, 0, 2));
        // these will run in order.

        // To run multiple commands at the same time,
        // use addParallel()
        // e.g. addParallel(new Command1());
        //      addSequential(new Command2());
        // Command1 and Command2 will run in parallel.

        // A command group will require all of the subsystems that each member
        // would require.
        // e.g. if Command1 requires chassis, and Command2 requires arm,
        // a CommandGroup containing them would require both the chassis and the
        // arm.
    }
}
