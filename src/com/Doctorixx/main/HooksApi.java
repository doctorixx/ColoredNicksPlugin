package com.Doctorixx.main;

import net.luckperms.api.LuckPerms;
import net.luckperms.api.LuckPermsProvider;
import net.milkbowl.vault.chat.Chat;
import org.bukkit.plugin.RegisteredServiceProvider;


import static org.bukkit.Bukkit.getServer;

public class HooksApi {

    private static final LuckPerms luckPerms = LuckPermsProvider.get();
    private static final Chat chat = getVaultChatApi();

    private static Chat getVaultChatApi() {
        RegisteredServiceProvider<Chat> rsp = getServer().getServicesManager().getRegistration(Chat.class);
        return rsp != null ? rsp.getProvider() : null;
    }

    public static LuckPerms getLuckPerms() {
        return luckPerms;
    }

    public static Chat getChat() {
        return chat;
    }

}
