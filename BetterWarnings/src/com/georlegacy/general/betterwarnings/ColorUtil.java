package com.georlegacy.general.betterwarnings;

import org.bukkit.ChatColor;

public class ColorUtil {
	
	public static String color(String string) {
        return ChatColor.translateAlternateColorCodes('&', string);
    }

}