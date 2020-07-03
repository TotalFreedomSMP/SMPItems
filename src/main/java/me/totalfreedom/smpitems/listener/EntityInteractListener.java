package me.totalfreedom.smpitems.listener;

import me.totalfreedom.smpitems.SMPItems;
import me.totalfreedom.smpitems.item.MagicalSaddle;
import me.totalfreedom.smpitems.util.SUtil;
import org.bukkit.entity.Entity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerInteractEntityEvent;

public class EntityInteractListener implements Listener
{
    private SMPItems plugin;

    public EntityInteractListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityInteract(PlayerInteractEntityEvent e)
    {
        if (SUtil.isItemValid(e.getPlayer().getInventory().getItemInMainHand(), new MagicalSaddle()) ||
                SUtil.isItemValid(e.getPlayer().getInventory().getItemInOffHand(), new MagicalSaddle()))
        {
            Entity entity = e.getRightClicked();
            entity.addPassenger(e.getPlayer());
        }
    }
}