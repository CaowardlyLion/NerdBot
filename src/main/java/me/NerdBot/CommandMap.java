package me.NerdBot;

import me.NerdBot.commands.F;
import me.NerdBot.commands.Hello;
import me.NerdBot.commands.Pickle;
import me.NerdBot.utils.Command;

import java.util.ArrayList;

public class CommandMap{
    private static ArrayList<Command> map; {
    };
    public CommandMap() {
        map = new ArrayList<>();
        map.add(new F());
        map.add(new Hello());
        map.add(new Pickle());
    }
    public ArrayList<Command> getMap() {
        return map;
    }
}
