package me.NerdBot.commands;

import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;

import java.util.Arrays;

public class Uwuify implements Command {
    static String keyword = "uwuify";
    public void run(CommandExecutor exec) {
        System.out.println("message received");
        if (exec.args.length == 1) {
            exec.sendMessage("I need something to uwu, uwu!");
        }
        else {
            Boolean firstWord = true;
            StringBuilder sb = new StringBuilder();
            String[] args = Arrays.copyOfRange(exec.args, 1, exec.args.length);
            for (String s : args) {
                String temp = s.toLowerCase();
                temp = temp.replaceAll("r", "w");
                temp = temp.replaceAll("l", "w");
                if (temp.equals("the")) {
                    temp = "da";
                }
                if (firstWord) {
                    sb.append(temp.charAt(0) + "- ");
                    firstWord = false;
                }
                sb.append(temp);
                sb.append(" ");
            }
            sb.append("uwu");
            System.out.println(sb);
            exec.sendMessage(sb.toString());
        }
    }
    public String getKeyword() {
        return keyword;
    }
}
