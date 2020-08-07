package me.NerdBot;
import com.oopsjpeg.osu4j.exception.OsuAPIException;
import me.NerdBot.commands.F;
import me.NerdBot.commands.Hello;
import me.NerdBot.commands.osu;
import me.NerdBot.utils.Builder;
import me.NerdBot.utils.CommandParser;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;
import javax.security.auth.login.LoginException;
import me.NerdBot.creds;
import net.dv8tion.jda.api.entities.Activity;
import net.dv8tion.jda.api.entities.ChannelType;
import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.entities.MessageChannel;
import net.dv8tion.jda.api.events.message.MessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

public class NerdBot extends ListenerAdapter {
    static Builder builder = new Builder();
    public static void main(String[] args) throws LoginException {
        JDA jda = JDABuilder.createDefault(creds.token).setActivity(Activity.playing("with fire")).build();
        jda.addEventListener(new NerdBot());
        builder.addCommand(new Hello());
        builder.addCommand(new osu());
        builder.addCommand(new F());
    }
    @Override
    public void onMessageReceived(MessageReceivedEvent event)
    {
        Message msg = event.getMessage();
        System.out.println("Received: " + msg.getContentRaw());
        if (msg.getContentRaw().charAt(0) == '>' && msg.getContentRaw().length() != 1) {
            builder.addEvent(event);
            try {
                builder.sendOut();
            } catch (OsuAPIException e) {
                e.printStackTrace();
            }
        }
    }
}
