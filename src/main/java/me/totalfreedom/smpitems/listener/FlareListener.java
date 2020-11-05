package me.totalfreedom.smpitems.listener;

import java.util.ArrayList;
import java.util.List;
import me.totalfreedom.smpitems.SMPItems;
import me.totalfreedom.smpitems.item.Flare;
import me.totalfreedom.smpitems.util.SUtil;
import org.bukkit.entity.ArmorStand;
import org.bukkit.entity.EnderDragon;
import org.bukkit.entity.Entity;
import org.bukkit.entity.LivingEntity;
import org.bukkit.entity.Player;
import org.bukkit.entity.Wither;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scheduler.BukkitRunnable;

public class FlareListener implements Listener
{
    private SMPItems plugin;
    private List<Player> flareCooldown = new ArrayList<>();

    public FlareListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onFlarePlace(BlockPlaceEvent e)
    {
        Player player = e.getPlayer();
        ItemStack hand = player.getInventory().getItemInMainHand();
        ItemStack offhand = player.getInventory().getItemInOffHand();
        if (!SUtil.isItemValid(hand, new Flare()) && !SUtil.isItemValid(offhand, new Flare()))
        {
            return;
        }
        e.setCancelled(true);

        if (flareCooldown.contains(player))
        {
            player.sendMessage(SUtil.color("&b&lFLARE &bCurrently on cooldown."));
            return;
        }

        e.getBlock().getWorld().createExplosion(e.getBlock().getLocation(), 2F, false, false);
        int count = 0;
        for (Entity entity : e.getBlock().getWorld().getEntities())
        {
            if (e.getBlock().getLocation().distance(entity.getLocation()) <= plugin.config.getDouble("server.flare_radius") &&
                    !(entity instanceof Player) &&
                    entity instanceof LivingEntity &&
                    !(entity instanceof EnderDragon) &&
                    !(entity instanceof Wither) &&
                    !(entity instanceof ArmorStand))
            {
                ((LivingEntity)entity).setHealth(0.0);
                count++;
            }
        }
        player.sendMessage(SUtil.color("&b&lFLARE &bFlashed and killed " + count + " creatures!"));
        flareCooldown.add(player);
        new BukkitRunnable()
        {
            @Override
            public void run()
            {
                flareCooldown.remove(player);
                player.sendMessage(SUtil.color("&b&lFLARE &bYour ability is ready!"));
            }
        }.runTaskLater(plugin, 20 * 20);
    }
}