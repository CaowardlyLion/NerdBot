package me.NerdBot.commands;

import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;

public class BrainPower implements Command {
    static String keyword = "brainpower";
    public void run(CommandExecutor exec) {
        System.out.println("message received");
        exec.sendMessage("O-oooooooooo AAAAE-A-A-I-A-U- JO-oooooooooooo AAE-O-A-A-U-U-A- E-eee-ee-eee AAAAE-A-E-I-E-A- JO-ooo-oo-oo-oo EEEEO-A-AAA-AAAA O-oooooooooo AAAAE-A-A-I-A-U- JO-oooooooooooo AAE-O-A-A-U-U-A- E-eee-ee-eee AAAAE-A-E-I-E-A- JO-ooo-oo-oo-oo EEEEO-A-AAA-AAAA  O-oooooooooo AAAAE-A-A-I-A-U- JO-oooooooooooo AAE-O-A-A-U-U-A- E-eee-ee-eee AAAAE-A-E-I-E-A- JO-ooo-oo-oo-oo EEEEO-A-AAA-AAAA-O----------");
    }
    public String getKeyword() {
        return keyword;
    }
}
