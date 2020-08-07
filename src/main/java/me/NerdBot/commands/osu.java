package me.NerdBot.commands;
import com.oopsjpeg.osu4j.GameMode;
import com.oopsjpeg.osu4j.OsuUser;
import com.oopsjpeg.osu4j.backend.*;
import com.oopsjpeg.osu4j.exception.OsuAPIException;
import com.oopsjpeg.osu4j.util.*;
import me.NerdBot.utils.Command;
import me.NerdBot.utils.CommandExecutor;
import me.NerdBot.creds;

import java.net.MalformedURLException;

public class osu implements Command {
    static String keyword = "osu";
    public void run(CommandExecutor exec) throws OsuAPIException {
        try {
            Osu osu = Osu.getAPI(creds.osutoken);
            System.out.println("message received, checking " + exec.args[1]);
            OsuUser user = osu.users.query(new EndpointUsers.ArgumentsBuilder(exec.args[1]).setMode(GameMode.STANDARD).build());
            exec.sendMessage(user.getUsername() + "(" + user.getID() + ")");
            exec.sendMessage(user.getURL().toString());
            exec.sendMessage("Rank: #" + user.getRank());
            exec.sendMessage("Performance: #" + user.getRank() + " (" + user.getPP() + "pp)");
            exec.sendMessage("Total Score: " + user.getTotalScore());
        }
        catch (OsuAPIException f) {
            exec.sendMessage("Error was thrown: did you enter a correct username?");
        }
        catch (ArrayIndexOutOfBoundsException e) {
            exec.sendMessage("No username was found.");
        }
        catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }
    public String getKeyword() {
        return keyword;
    }
}