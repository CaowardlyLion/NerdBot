package me.NerdBot.commands;

import me.NerdBot.resources.Pastas;
import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;

import java.io.IOException;
import java.util.Arrays;

public class Copypasta implements Command {
    static String keyword = "copypasta";
    public void run(CommandExecutor exec) throws IOException {
        System.out.println("message received");
        if (exec.args.length == 1) {
            exec.sendMessage("Type in which copypasta you want! (0: kira, 1: brainpower)");
        }
        else {
            StringBuilder sb = new StringBuilder();
            String[] args = Arrays.copyOfRange(exec.args, 1, exec.args.length);
            exec.sendMessage(new Pastas().getPasta(Integer.parseInt(args[0])));
        }
    }
    public String getKeyword() {
        return keyword;
    }
}
