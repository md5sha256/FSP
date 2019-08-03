package com.gmail.andrewandy.firstspigotplugin;

import org.bukkit.plugin.java.JavaPlugin;
import util.Common;

import java.util.logging.Level;

public final class FirstSpigotPlugin extends JavaPlugin {

    private static FirstSpigotPlugin instance;

    @Override
    public void onEnable() {
        instance = this;
        Common.setPlugin(this);
        Common.setLogPrefix("&e[FirstSpigotPlugin]");
    }

    @Override
    public void onDisable() {
        instance = null;
        Common.log(Level.INFO, "&eGoodbye! Plugin will now disable.");
    }

    public static FirstSpigotPlugin getInstance() {
        return instance;
    }
}
