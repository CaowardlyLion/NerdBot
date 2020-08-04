package me.NerdBot.utils;

public interface Command {
     String getKeyword();
     void run(CommandExecutor exec);
}
