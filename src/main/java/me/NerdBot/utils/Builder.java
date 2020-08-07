package me.NerdBot.utils;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.HashMap;
import java.util.List;

public class Builder {
    private HashMap<String, Command> commands = new HashMap<>();
    MessageReceivedEvent event;
    public void addEvent(MessageReceivedEvent m) {
        event = m;
    }
    public void addCommand(Command command) {
        commands.put(command.getKeyword().toLowerCase(), command);
    }
    public void addCommandsAll(List<Command> collection) {
        for (Command c : collection) {
            addCommand(c);
        }
    }
    public void sendOut() {
        CommandParser parser = new CommandParser(event);
        parser.parseCommand(commands);

    }
}
