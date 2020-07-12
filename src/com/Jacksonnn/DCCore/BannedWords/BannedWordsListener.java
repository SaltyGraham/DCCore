package com.Jacksonnn.DCCore.BannedWords;

import com.Jacksonnn.DCCore.Configuration.ConfigManager;
import com.Jacksonnn.DCCore.GeneralMethods;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;

import java.util.ArrayList;
import java.util.List;

public class BannedWordsListener implements Listener {
    @EventHandler
    public void onRegularChat(AsyncPlayerChatEvent event) {
        Player player = event.getPlayer();

        bannedWords = ConfigManager.bannedWords.get().getStringList("AntiCurse.bannedWords");

        for (String bannedWord : bannedWords) {
            if (event.getMessage().toUpperCase().contains(bannedWord.toUpperCase()) || player.getName().toUpperCase().contains(bannedWord.toUpperCase()) || player.getDisplayName().toUpperCase().contains(bannedWord.toUpperCase())) {
                if (player.hasPermission("DCCore.AntiCurse.bypass")) {
                    return;
                } else {
                    event.setCancelled(true);
                    event.getPlayer().sendMessage(GeneralMethods.prefix + " Please rethink your choice of words... (check your username, nickname, or chat message!!!)");
                    event.getPlayer().sendMessage(ChatColor.YELLOW + "Banned word used: " + bannedWord);
                }
            }
        }
    }
}
