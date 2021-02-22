package me.NerdBot.commands;

import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;

public class Help implements Command {
    static String keyword = "help";
    public void run(CommandExecutor exec) {
        exec.sendMessage("Yo. This is a bot written by Eric, it's stupid, it's funny, it only has like 8 commands: Brainpower, Copypasta, F, Hello, Help, Whoareyou, Pickle, and Uwuify!");
    }
    public String getKeyword() {
        return keyword;
    }
}
