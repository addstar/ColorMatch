package au.com.addstar.colormatch;

import com.google.common.collect.Maps;
import org.bukkit.ChatColor;
import org.bukkit.DyeColor;


import java.util.Map;

class Utilities {
    private static final Map<DyeColor, ChatColor> dyeChatMap;

    static {
        dyeChatMap = Maps.newHashMap();
        dyeChatMap.put(DyeColor.BLACK, ChatColor.DARK_GRAY);
        dyeChatMap.put(DyeColor.BLUE, ChatColor.DARK_BLUE);
        dyeChatMap.put(DyeColor.BROWN, ChatColor.GOLD);
        dyeChatMap.put(DyeColor.CYAN, ChatColor.AQUA);
        dyeChatMap.put(DyeColor.GRAY, ChatColor.GRAY);
        dyeChatMap.put(DyeColor.GREEN, ChatColor.DARK_GREEN);
        dyeChatMap.put(DyeColor.LIGHT_BLUE, ChatColor.BLUE);
        dyeChatMap.put(DyeColor.LIME, ChatColor.GREEN);
        dyeChatMap.put(DyeColor.MAGENTA, ChatColor.LIGHT_PURPLE);
        dyeChatMap.put(DyeColor.ORANGE, ChatColor.GOLD);
        dyeChatMap.put(DyeColor.PINK, ChatColor.LIGHT_PURPLE);
        dyeChatMap.put(DyeColor.PURPLE, ChatColor.DARK_PURPLE);
        dyeChatMap.put(DyeColor.RED, ChatColor.DARK_RED);
        dyeChatMap.put(DyeColor.SILVER, ChatColor.GRAY);
        dyeChatMap.put(DyeColor.WHITE, ChatColor.WHITE);
        dyeChatMap.put(DyeColor.YELLOW, ChatColor.YELLOW);
    }


    public static ChatColor dyeToChat(DyeColor dclr) {
        if (dyeChatMap.containsKey(dclr))
            return dyeChatMap.get(dclr);
        return ChatColor.MAGIC;
    }

    public static String translate(String raw) {
        return ChatColor.translateAlternateColorCodes('&', raw);
    }
}
