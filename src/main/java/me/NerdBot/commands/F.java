package me.NerdBot.commands;

import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;

import java.util.Arrays;
import java.util.Random;
import java.util.HashMap;

public class F implements Command {
    static String keyword = "f";
    public void run(CommandExecutor exec) {
        HashMap<Integer, String> emojis = new HashMap<>();
        System.out.println("message received");

        Random random = new Random();
        emojis.put(0, ":heart:");
        emojis.put(1, ":blue_heart:");
        emojis.put(2, ":yellow_heart:");
        emojis.put(3, ":purple_heart:");
        if (exec.args.length == 1) {
            exec.sendMessage("**" + exec.event.getAuthor().getName() + "** has paid their respects " + emojis.get(random.nextInt(4)));
        }
        else {
            StringBuilder sb = new StringBuilder();
            String[] args = Arrays.copyOfRange(exec.args, 1, exec.args.length);
            for (String s : args) {
                sb.append(s);
                sb.append(" ");
            }
            System.out.println(sb);
            exec.sendMessage("**" +exec.event.getAuthor().getName() + "** has paid their respects for " + sb + emojis.get(random.nextInt(4)));
        }
    }
    public String getKeyword() {
        return keyword;
    }
}