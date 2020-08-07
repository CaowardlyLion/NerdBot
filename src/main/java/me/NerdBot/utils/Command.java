package me.NerdBot.utils;

import com.oopsjpeg.osu4j.exception.OsuAPIException;

public interface Command {
     String getKeyword();
     void run(CommandExecutor exec);
}
