package me.NerdBot.utils;

import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.util.HashMap;

public class CommandParser extends ListenerAdapter {
    MessageReceivedEvent event;
    CommandExecutor exec;

    public CommandParser(MessageReceivedEvent event) {
        this.event = event;
        exec = new CommandExecutor(event);
    }

    public void parseCommand(HashMap<String, Command> commands) {
        String call = event.getMessage().getContentRaw().split(" ")[0].substring(1);
        System.out.println("I received: " + call + ", Calling " + commands.get(call));
        Command command = commands.get(call);
        command.run(exec);
    }
}

