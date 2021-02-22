package me.NerdBot;

import me.NerdBot.commands.*;
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
        map.add(new BrainPower());
        map.add(new Uwuify());
        map.add(new Kira());
        map.add(new Copypasta());
        map.add(new Help());
    }
    public ArrayList<Command> getMap() {
        return map;
    }
}
