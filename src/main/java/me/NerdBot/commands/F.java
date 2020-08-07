package me.NerdBot.commands;

import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;
import java.util.Random;
import java.util.HashMap;

public class F implements Command {
    static String keyword = "f";
    public void run(CommandExecutor exec) {
        HashMap<Integer, String> emojis = new HashMap<>();
        emojis.put(0, ":heart:");
        emojis.put(1, ":blue_heart:");
        emojis.put(2, ":yellow_heart:");
        emojis.put(3, ":purple_heart:");
        Random random = new Random();
        System.out.println("message received");
        exec.sendMessage(exec.event.getAuthor().getName() + " has paid their respects. " + emojis.get(random.nextInt(4)));
    }
    public String getKeyword() {
        return keyword;
    }
}