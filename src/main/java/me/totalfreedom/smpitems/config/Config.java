package me.totalfreedom.smpitems.config;

import java.io.File;
import me.totalfreedom.smpitems.SMPItems;
import org.bukkit.configuration.file.YamlConfiguration;

public class Config extends YamlConfiguration
{
    private final SMPItems plugin;
    private final File file;

    public Config(SMPItems plugin, String name)
    {
        this.plugin = plugin;
        this.file = new File(plugin.getDataFolder(), name);

        if (!file.exists())
        {
            options().copyDefaults(true);
            plugin.saveResource(name, false);
        }
        load();
    }

    public void load()
    {
        try
        {
            super.load(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public void save()
    {
        try
        {
            super.save(file);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}