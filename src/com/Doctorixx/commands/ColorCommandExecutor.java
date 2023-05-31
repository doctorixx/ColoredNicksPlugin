package com.Doctorixx.commands;




import com.Doctorixx.main.HooksApi;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.loot.LootTables;

import static org.bukkit.Bukkit.getPlayer;

public class ColorCommandExecutor implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender commandSender, Command command, String s, String[] strings) {

        commandSender.sendMessage("");

        if (strings.length != 0) {
            String stringColor = strings[0];
            var dictOfColors = ColorCommandCompleteList.getDict();

            if (dictOfColors.containsKey(stringColor)) {
                HooksApi.getChat().setPlayerPrefix(
                        getPlayer(commandSender.getName()),
                        (dictOfColors.get(stringColor)).toString()
                );

                String okMsg = ChatColor.GREEN + "Color changed to " +
                        (dictOfColors.get(stringColor)).toString() + stringColor + "\n"
                        + ChatColor.YELLOW + "Please Rejoin";


                getPlayer(commandSender.getName()).kickPlayer(okMsg);


            }
            commandSender.sendMessage(ChatColor.RED + "It is not color");

            return true;

        }
        commandSender.sendMessage(ChatColor.RED + "Usage:");
        return false;
    }


}

