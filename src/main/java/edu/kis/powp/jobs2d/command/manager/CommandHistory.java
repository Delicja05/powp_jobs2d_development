package edu.kis.powp.jobs2d.command.manager;

import edu.kis.powp.jobs2d.command.DriverCommand;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class CommandHistory {
    public static boolean logMode = true;
    static List<CommandHistoryEntry> historyEntries = new ArrayList<CommandHistoryEntry>();
    static DefaultListModel listModel;

     public static void addEntry(List<DriverCommand> commands, String name){
         historyEntries.add(new CommandHistoryEntry(commands,name));
         listModel.add(listModel.getSize(),name);
        
     }
     public static String[] getEntryNames(){
         List<String> names = new ArrayList<>();
         for (CommandHistoryEntry e : historyEntries){
             names.add(e.name);
         }
         return (String[]) names.toArray();
     }

    public static void setListModel(DefaultListModel model) {
        listModel =  model;
    }

    public static List<DriverCommand> getCommandsFromList(int index){
        return historyEntries.get(index).commands;
    }

    public static String getCommandsNameFromList(int index){
        return historyEntries.get(index).name;
    }

    static class CommandHistoryEntry{
         List<DriverCommand> commands;
         String name;
         CommandHistoryEntry(List<DriverCommand> commands, String name){
             this.commands=commands;
             this.name=name;
         }
     }
}
