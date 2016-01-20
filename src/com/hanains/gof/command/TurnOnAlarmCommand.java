package com.hanains.gof.command;

public class TurnOnAlarmCommand implements Command {
	private Alarm theAlarm;

	public TurnOnAlarmCommand(Alarm alarm) {
		this.theAlarm = alarm;
	}

	public void execute() {
		theAlarm.turnOn();
	}
}
