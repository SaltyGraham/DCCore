package com.Jacksonnn.DCCore.Guides;

import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class BendingGuideCommand implements CommandExecutor {
    @Override
    public boolean onCommand(@NotNull CommandSender commandSender, @NotNull Command command, @NotNull String s, @NotNull String[] strings) {
        if (commandSender instanceof Player)
            giveGuide((Player)commandSender);
        return true;
    }

    public static void giveGuide(Player player) {
        Bukkit.dispatchCommand(Bukkit.getConsoleSender(), "give " + player.getName() + " written_book{display:{Name:'[{\"text\":\"DC\",\"italic\":false,\"bold\":true,\"color\":\"blue\"},{\"text\":\" \",\"color\":\"dark_purple\"},{\"text\":\"Bending\",\"color\":\"dark_green\"},{\"text\":\" \",\"color\":\"dark_purple\"},{\"text\":\"Quickstart\",\"color\":\"red\"},{\"text\":\" \",\"color\":\"dark_purple\"},{\"text\":\"Guide\",\"color\":\"#a6d5cc\"}]',Lore:['[{\"text\":\"Get started with bending!\",\"italic\":false}]']},title:\"\",author:\"DarkcrestMC\",pages:['[\"\",{\"text\":\"\\\\n \\\\u0020 \"},{\"text\":\"\\\\u2b16\",\"color\":\"blue\"},{\"text\":\" \\\\u2b18\",\"color\":\"red\"},{\"text\":\" Bending \",\"color\":\"reset\"},{\"text\":\"\\\\u2b17\",\"color\":\"dark_green\"},{\"text\":\" \\\\u2b19\",\"color\":\"#A6D5CC\"},{\"text\":\"\\\\n \\\\u0020 Quickstart Guide\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"pg 2\",\"underlined\":true,\"clickEvent\":{\"action\":\"change_page\",\"value\":2}},{\"text\":\" \\\\u2014 Super-Quick Guide\\\\n\",\"color\":\"reset\"},{\"text\":\"pg 3\",\"underlined\":true,\"clickEvent\":{\"action\":\"change_page\",\"value\":3}},{\"text\":\" \\\\u2014 Choosing an Element\\\\n\",\"color\":\"reset\"},{\"text\":\"pg 4\",\"underlined\":true,\"clickEvent\":{\"action\":\"change_page\",\"value\":4}},{\"text\":\" \\\\u2014 Viewing Moves\\\\n\",\"color\":\"reset\"},{\"text\":\"pg 5\",\"underlined\":true,\"clickEvent\":{\"action\":\"change_page\",\"value\":5}},{\"text\":\" \\\\u2014 How to use Moves\\\\n\",\"color\":\"reset\"},{\"text\":\"pg 6\",\"underlined\":true,\"clickEvent\":{\"action\":\"change_page\",\"value\":6}},{\"text\":\" \\\\u2014 Binding Moves\",\"color\":\"reset\"}]','[\"\",{\"text\":\" \\\\u0020Get Started Super \\\\u0020 \\\\u0020 \\\\u0020 \\\\u0020 \\\\u0020 Quick!\",\"color\":\"dark_aqua\"},{\"text\":\"\\\\n\\\\n1. \",\"color\":\"reset\"},{\"text\":\"/bending choose (element)\",\"bold\":true},{\"text\":\"\\\\n2. \",\"color\":\"reset\"},{\"text\":\"/bending display (element)\",\"bold\":true},{\"text\":\"\\\\n3. \",\"color\":\"reset\"},{\"text\":\"/bending help (moveName)\",\"bold\":true},{\"text\":\"\\\\n4. \",\"color\":\"reset\"},{\"text\":\"/bending bind (moveName)\",\"bold\":true},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"***Read on for more details!***\",\"bold\":true,\"color\":\"dark_aqua\"}]','[\"\",{\"text\":\" \\\\u0020Choose an Element\",\"color\":\"dark_aqua\"},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\u2022 /bending choose (element)\",\"bold\":true},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\u2022 \",\"bold\":true},{\"text\":\"Shortened: \",\"color\":\"reset\"},{\"text\":\"/b ch (element)\",\"bold\":true},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\u2022 \",\"bold\":true},{\"text\":\"Ex: /b ch earth\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\" \\\\u0020 \\\\u0020 \\\\u0020water\",\"color\":\"blue\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\" \\\\u0020 \\\\u0020 \\\\u0020earth\",\"color\":\"dark_green\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\" \\\\u0020 \\\\u0020 \\\\u0020 fire\",\"color\":\"red\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\" \\\\u0020 \\\\u0020 \\\\u0020 air\",\"color\":\"#A6D5CC\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\" \\\\u0020 \\\\u0020 \\\\u0020 chi\",\"color\":\"gold\"}]','[\"\",{\"text\":\" View Available Moves\",\"color\":\"dark_aqua\"},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\u2022 /bending display (element)\",\"bold\":true},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\u2022 \",\"bold\":true},{\"text\":\"Shortened: \",\"color\":\"reset\"},{\"text\":\"/b d (element)\",\"bold\":true},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\u2022 \",\"bold\":true},{\"text\":\"Ex: /b d earth\\\\nThis is a list of moves that you can bind. Be sure to also use the commands displayed at the bottom to see Combos and Passives!\",\"color\":\"reset\"}]','[\"\",{\"text\":\" Learn About Moves & \\\\u0020 \\\\u0020 How to Use Them\",\"color\":\"dark_aqua\"},{\"text\":\"\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\u2022 /bending help (moveName)\\\\n\\\\u2022 \",\"bold\":true},{\"text\":\"Shortened: \",\"color\":\"reset\"},{\"text\":\"/b h (moveName)\\\\n\\\\u2022 \",\"bold\":true},{\"text\":\"Ex: /b h EarthBlast\\\\nThis command shows a description of the move and how to use it. Look at the moves and decide which ones you want!\",\"color\":\"reset\"}]','[\"\",{\"text\":\" \\\\u0020 \\\\u0020 \\\\u0020Bind Moves\",\"color\":\"dark_aqua\"},{\"text\":\"\\\\n\\\\n\",\"color\":\"reset\"},{\"text\":\"\\\\u2022 /bending bind (moveName)\\\\n\\\\u2022 \",\"bold\":true},{\"text\":\"Shortened: \",\"color\":\"reset\"},{\"text\":\"/b b (moveName)\\\\n\\\\u2022 \",\"bold\":true},{\"text\":\"Ex: /b b EarthBlast\\\\n\\\\nChoose the hotbar slot you want to bind a move to and use this command. Try it out and have some fun!\",\"color\":\"reset\"}]']} 1");
    }
}