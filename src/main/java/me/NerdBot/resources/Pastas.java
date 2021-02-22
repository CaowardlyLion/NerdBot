package me.NerdBot.resources;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

public class Pastas {
    public static HashMap<String, String> pastas = new HashMap<>();
    public static ArrayList index = new ArrayList<String>();
    public Pastas() throws IOException {
        String kira = new BufferedReader(new FileReader("/Users/eric/DiscordBot/NerdBot/src/main/java/me/NerdBot/resources/kira.txt")).readLine();
        String brainpower = new BufferedReader(new FileReader("/Users/eric/DiscordBot/NerdBot/src/main/java/me/NerdBot/resources/brainpower.txt")).readLine();
        pastas.put("kira", kira);
        pastas.put("brainpower", brainpower);
        index.add("kira");
        index.add("brainpower");
    }
    public String getPasta(int select) {
        try {
            return pastas.get(index.get(select));
        }
        catch (ArrayIndexOutOfBoundsException e) {
            return "Pasta not found!";
        }
    }
    public String getPasta(String select) {
        if (pastas.containsKey(select)) {
            return pastas.get(select);
        }
        else {
            return "Pasta not found!";
        }
    }
}
