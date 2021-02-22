package me.NerdBot;
import me.NerdBot.utils.Builder;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import javax.security.auth.login.LoginException;

import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import java.io.IOException;

public class NerdBot extends ListenerAdapter {
    static Builder builder = new Builder();
    static CommandMap commandMap = new CommandMap();
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault(creds.token).setActivity(Activity.playing("with fire")).build();
        jda.addEventListener(new NerdBot());
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        builder.addCommandsAll(commandMap.getMap());
        Message msg = event.getMessage();
        System.out.println("Received: " + msg.getContentRaw());
        try {
            if (msg.getContentRaw().charAt(0) == '>' && msg.getContentRaw().length() != 1) {
                builder.addEvent(event);
                try {
                    builder.sendOut();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        catch (StringIndexOutOfBoundsException c) {

        }
    }
}
