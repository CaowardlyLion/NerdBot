package me.NerdBot.utils;

import com.oopsjpeg.osu4j.exception.OsuAPIException;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.Collection;
import java.util.HashMap;

public class Builder {
    private HashMap<String, Command> commands = new HashMap<>();
    MessageReceivedEvent event;
    public void addEvent(MessageReceivedEvent m) {
        event = m;
    }
    public void addCommand(Command command) {
        commands.put(command.getKeyword().toLowerCase(), command);
    }
    public void addCommandsAll(Collection<Command> collection) {
        for (Command c : collection) {
            addCommand(c);
        }
    }
    public void sendOut() throws OsuAPIException {
        CommandParser parser = new CommandParser(event);
        parser.parseCommand(commands);

    }
}