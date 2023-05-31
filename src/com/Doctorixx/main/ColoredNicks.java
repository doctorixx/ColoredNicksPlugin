package com.Doctorixx.main;

import com.Doctorixx.commands.CommandManager;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.logging.Logger;

public class ColoredNicks extends JavaPlugin {

    private Logger logger;

    @Override
    public void onEnable() {
        logger = Bukkit.getLogger();


        new CommandManager(this);

        super.onEnable();


    }

    @Override
    public void onDisable() {
        super.onDisable();
    }


}
