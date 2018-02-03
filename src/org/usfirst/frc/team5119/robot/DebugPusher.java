package org.usfirst.frc.team5119.robot;

import java.lang.reflect.Array;

import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DebugPusher {
	private int frameNumber = 0;
	private int framesBetweenPush = 0;
	private String[] pushKeys = new String[0];
	private double[] pushValues = new double[0];
	
	public DebugPusher (int framesBtwPush) {
		framesBetweenPush = framesBtwPush;
	}
	public void push(String key, double value) {
		pushKeys[pushKeys.length] = key;
		pushValues[pushValues.length] = value;
	}
	public void update() {
		frameNumber ++;
		frameNumber %= framesBetweenPush;
		if(frameNumber == 0) {
			for(int i=0;i<pushKeys.length;i++) {
				SmartDashboard.putNumber(pushKeys[i], pushValues[i]);
			}
		}
	}
}
