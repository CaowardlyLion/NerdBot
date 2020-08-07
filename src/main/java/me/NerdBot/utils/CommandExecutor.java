package me.NerdBot.utils;

import net.dv8tion.jda.api.entities.IMentionable;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;

import java.util.List;

public class CommandExecutor {
    public MessageReceivedEvent event;
    public List<IMentionable> mentions;
    public String[] args;
    public MessageChannel channel;
    public CommandExecutor(MessageReceivedEvent e) {
        event = e;
        mentions = e.getMessage().getMentions();
        channel = e.getChannel();
        args = e.getMessage().getContentRaw().split(" ");
    }
    public void sendMessage(String msg) {
        System.out.println("Attempting to send message: " + msg);
        channel.sendMessage(msg).queue();
    }
}
