package me.NerdBot;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import javax.security.auth.login.LoginException;
import me.NerdBot.creds;

public class Main {
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault(creds.token).build();

    }
}
