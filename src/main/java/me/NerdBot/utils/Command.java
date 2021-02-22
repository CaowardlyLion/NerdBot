package me.NerdBot.utils;

import java.io.IOException;

public interface Command {
     String getKeyword();
     void run(CommandExecutor exec) throws IOException;
}
