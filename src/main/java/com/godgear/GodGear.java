package com.godgear;

import org.bukkit.plugin.java.JavaPlugin;

/**
 * GodGear - A feature-rich Minecraft plugin for Paper Spigot
 * Main plugin class that handles plugin initialization and lifecycle
 */
public class GodGear extends JavaPlugin {

    private static GodGear instance;

    @Override
    public void onEnable() {
        instance = this;
        
        // Log plugin startup
        getLogger().info("╔════════════════════════════════════════╗");
        getLogger().info("║         GodGear Plugin Enabled         ║");
        getLogger().info("║         Version: " + getDescription().getVersion() + "              ║");
        getLogger().info("╚════════════════════════════════════════╝");

        // Save default configuration
        saveDefaultConfig();

        // Register listeners
        registerListeners();

        // Register commands
        registerCommands();

        getLogger().info("GodGear has been successfully loaded!");
    }

    @Override
    public void onDisable() {
        getLogger().info("╔════════════════════════════════════════╗");
        getLogger().info("║         GodGear Plugin Disabled        ║");
        getLogger().info("╚════════════════════════════════════════╝");
    }

    /**
     * Register event listeners
     */
    private void registerListeners() {
        // Register listeners here
        // Example: getServer().getPluginManager().registerEvents(new YourListener(), this);
    }

    /**
     * Register plugin commands
     */
    private void registerCommands() {
        // Register commands here
        // Example: getCommand("godgear").setExecutor(new GodGearCommand());
    }

    /**
     * Get the plugin instance
     */
    public static GodGear getInstance() {
        return instance;
    }
}
