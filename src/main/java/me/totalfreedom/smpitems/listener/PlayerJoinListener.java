package me.totalfreedom.smpitems.listener;

import me.totalfreedom.smpitems.SMPItems;
import me.totalfreedom.smpitems.util.SUtil;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;

public class PlayerJoinListener implements Listener
{
    private SMPItems plugin;

    public PlayerJoinListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e)
    {
        Player player = e.getPlayer();

        if (!player.hasPlayedBefore())
        {
            player.sendMessage(SUtil.color("&6SMPItems \u00BB &eFor more information about SMPItems, you can visit the wiki: https://smp.totalfreedom.me/w/index.php?title=Main_Page"));
        }
    }
}