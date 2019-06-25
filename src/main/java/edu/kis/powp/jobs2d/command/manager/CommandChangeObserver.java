package edu.kis.powp.jobs2d.command.manager;

import edu.kis.powp.jobs2d.features.CommandsFeature;
import edu.kis.powp.observer.Subscriber;

public class CommandChangeObserver  implements Subscriber {
    @Override
    public void update() {
        if(CommandHistory.logMode)
            CommandHistory.addEntry(CommandsFeature.getDriverCommandManager().getCommandList(),CommandsFeature.getDriverCommandManager().getCommandName());
    }
}
