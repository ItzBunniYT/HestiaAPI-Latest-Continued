package me.quartz.hestia;

import org.bukkit.ChatColor;
import org.bukkit.plugin.IllegalPluginAccessException;

import java.util.UUID;

public class HestiaAPI {

    public static HestiaAPI instance;

    public String getRank(UUID uuid){
        throw new IllegalPluginAccessException("API is not registered");
    }

    public ChatColor getRankColor(UUID uuid){
        throw new IllegalPluginAccessException("API is not registered");
    }

    public String getRankPrefix(UUID uuid){
        throw new IllegalPluginAccessException("HestiaCore is not found!");
    }

    public String getRankSuffix(UUID uuid){
        throw new IllegalPluginAccessException("HestiaCore is not found!");
    }

    public String getTag(UUID uuid){
        throw new IllegalPluginAccessException("HestiaCore is not found!");
    }

    public String getTagPrefix(UUID uuid){
        throw new IllegalPluginAccessException("HestiaCore is not found!");
    }

    public boolean isStaffChat(UUID uuid){
        throw new IllegalPluginAccessException("HestiaCore is not found!");
    }

    public boolean isAdminChat(UUID uuid){
        throw new IllegalPluginAccessException("HestiaCore is not found!");
    }

    public String getDiscordUserID(UUID uuid){
        throw new IllegalPluginAccessException("HestiaCore is not found!");
    }

    public boolean isVanished(UUID uuid){
        throw new IllegalPluginAccessException("HestiaCore is not found!");
    }
}
