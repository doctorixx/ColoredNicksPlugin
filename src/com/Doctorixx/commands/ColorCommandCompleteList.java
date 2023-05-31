package com.Doctorixx.commands;


import org.bukkit.ChatColor;

import java.util.*;

public class ColorCommandCompleteList {
    private static Map<String, ChatColor> argsDict = createDict();

    private static Map<String, ChatColor> createDict() {
        if (argsDict == null) {
            argsDict = new HashMap<String, ChatColor>();

            var colorValues = ChatColor.values();

            for (int i = 0; i < colorValues.length; i++) {
                if (colorValues[i].isColor()) {
                    argsDict.put(colorValues[i].name(), colorValues[i]);
                }
            }

        }


        return argsDict;
    }

    public static List<String> getList() {

        List<String> outList = new ArrayList<String>();
        for (var name : getDict().keySet()) {
            outList.add(name);
        }
        return outList;
    }

    public static Map<String, ChatColor> getDict() {
        return argsDict;
    }

}
