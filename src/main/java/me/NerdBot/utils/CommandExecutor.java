package me.NerdBot.utils;

import net.dv8tion.jda.api.entities.IMentionable;
import net.dv8tion.jda.api.entities.Member;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.entities.Message;

import java.util.List;

public class CommandExecutor {
    public MessageReceivedEvent event;
    public List<Member> mentions;
    public String[] args;
    public MessageChannel channel;
    public CommandExecutor(MessageReceivedEvent e) {
        event = e;
        mentions = e.getMessage().getMentionedMembers();
        channel = e.getChannel();
        args = e.getMessage().getContentRaw().split(" ");
        System.out.println(args);
    }
    public void sendMessage(String msg) {
        System.out.println("Attempting to send message: " + msg);
        channel.sendMessage(msg).queue();
    }
}
