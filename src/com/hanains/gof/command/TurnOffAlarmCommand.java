package com.hanains.gof.command;

public class TurnOffAlarmCommand implements Command {
	private Alarm theAlarm;

	public TurnOffAlarmCommand(Alarm alarm) {
		this.theAlarm = alarm;
	}

	public void execute() {
		theAlarm.turnOff();
	}
}
