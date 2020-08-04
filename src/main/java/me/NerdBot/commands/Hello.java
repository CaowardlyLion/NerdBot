package me.NerdBot.commands;

import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;

public class Hello implements Command {
    static String keyword = "hello";
    public void run(CommandExecutor exec) {
        System.out.println("message received");
        if (exec.mentions.size() > 1) {
            exec.sendMessage("That's too many people to say hi to!");
        }
        else if (exec.mentions.size() == 0) {
            exec.sendMessage("Your hello fades away with no listener...");
        }
        else {
            exec.sendMessage("Hello, " + exec.mentions.get(0).getAsMention());
        }
    }
    public String getKeyword() {
        return keyword;
    }
}