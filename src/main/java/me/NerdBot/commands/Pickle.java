package me.NerdBot.commands;

import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;

import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.Random;

public class Pickle implements Command {
    static String keyword = "pickle";
    public void run(CommandExecutor exec) {
        DecimalFormat df = new DecimalFormat("##.##");
        df.setRoundingMode(RoundingMode.DOWN);
        Random random = new Random();
        System.out.println("message received");
        if (exec.mentions.size() > 1) {
            exec.sendMessage("That's too many pickles! //");
        }
        else if (exec.mentions.size() == 0) {
            random.setSeed(exec.event.getAuthor().getIdLong());
            exec.sendMessage("**" + exec.event.getAuthor().getName() + "**'s pickle is " + df.format(Double.valueOf(random.nextInt(50))/1.17) + " cm long!");
        }
        else {
            random.setSeed(exec.mentions.get(0).getIdLong());
            exec.sendMessage("**" + exec.mentions.get(0).getEffectiveName() + "**'s pickle is " + df.format(Double.valueOf(random.nextInt(50))/1.17) + " cm long!");
        }
    }
    public String getKeyword() {
        return keyword;
    }
}