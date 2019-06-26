package edu.kis.powp.jobs2d.drivers.adapter;

import java.util.List;

import edu.kis.powp.jobs2d.Job2dDriver;
import edu.kis.powp.jobs2d.command.ComplexCommand;
import edu.kis.powp.jobs2d.command.DriverCommand;
import edu.kis.powp.jobs2d.command.OperateToCommand;
import edu.kis.powp.jobs2d.command.SetPositionCommand;

public class DriverRecorder implements Job2dDriver{
	
	private List<DriverCommand> list;
	private String name;
	
	
	public DriverRecorder(List<DriverCommand> list, String name) {
		super();
		this.list = list;
		this.name = name;
	}


	@Override
	public void setPosition(int x, int y) {
		list.add(new SetPositionCommand(x, y));
	}

	@Override
	public void operateTo(int x, int y) {
		list.add(new OperateToCommand(x, y));
	}
	
	public ComplexCommand getList() {
		return new ComplexCommand(list, name);
	}

	@Override
	public String toString() {
		return "Recorder - " + name;
	}
	
	

}
