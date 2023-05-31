package com.Doctorixx.commands;

import org.bukkit.plugin.java.JavaPlugin;

public class CommandManager {

    private final JavaPlugin plugin;

    public CommandManager(JavaPlugin plugin) {
        this.plugin = plugin;
        initCommands();
    }

    private void initCommands() {
        plugin.getCommand("color").setExecutor(new ColorCommandExecutor());
        plugin.getCommand("color").setTabCompleter(new ColorCommandTabCompleter());
    }

}
