package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.manager.DriverCommandManager;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.drivers.adapter.DriverRecorder;
import edu.kis.powp.jobs2d.features.CommandsFeature;

public class SelectLoadRecorderCommandOptionListener implements ActionListener {

	private DriverManager driverManager;
	private DriverRecorder driverRecorder;

	public SelectLoadRecorderCommandOptionListener(DriverManager driverManager, DriverRecorder driverRecorder) {
		this.driverManager = driverManager;
		this.driverRecorder = driverRecorder;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		DriverCommandManager manager = CommandsFeature.getDriverCommandManager();
		manager.setCurrentCommand(driverRecorder.getRecorderCommand());
		driverRecorder.getRecorderCommand().execute(driverRecorder);
	}

}
