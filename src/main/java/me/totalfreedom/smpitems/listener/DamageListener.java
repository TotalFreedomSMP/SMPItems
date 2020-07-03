package me.totalfreedom.smpitems.listener;

import java.util.Random;
import me.totalfreedom.smpitems.SMPItems;
import me.totalfreedom.smpitems.item.Sham;
import me.totalfreedom.smpitems.item.VampireFang;
import me.totalfreedom.smpitems.item.WitherAxe;
import me.totalfreedom.smpitems.util.SUtil;
import org.bukkit.entity.LivingEntity;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageByEntityEvent;
import org.bukkit.event.entity.EntityDamageEvent;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class DamageListener implements Listener
{
    private SMPItems plugin;

    public DamageListener(SMPItems plugin)
    {
        this.plugin = plugin;
    }

    @EventHandler
    public void onEntityDamage(EntityDamageByEntityEvent e)
    {
        if (!(e.getDamager() instanceof LivingEntity) || !(e.getEntity() instanceof LivingEntity))
        {
            return;
        }

        LivingEntity damager = (LivingEntity)e.getDamager();
        LivingEntity damaged = (LivingEntity)e.getEntity();

        if (damager.getEquipment() == null)
        {
            return;
        }

        if (SUtil.isItemValid(damager.getEquipment().getItemInMainHand(), new WitherAxe()) && !damaged.hasPotionEffect(PotionEffectType.WITHER))
        {
            damaged.addPotionEffect(new PotionEffect(PotionEffectType.WITHER, 100, 2));
        }

        if (SUtil.isItemValid(damager.getEquipment().getItemInMainHand(), new VampireFang()))
        {
            damager.setHealth(damager.getHealth() + 1);
        }

        if (SUtil.isItemValid(damaged.getEquipment().getItemInMainHand(), new Sham()) || SUtil.isItemValid(damaged.getEquipment().getItemInOffHand(), new Sham()))
        {
            if (e.getCause() == EntityDamageEvent.DamageCause.FALL)
            {
                return;
            }
            Random random = new Random();
            if (random.nextInt(2) == 1)
            {
                e.setCancelled(true);
                damaged.sendMessage(SUtil.color("&eBlocked damage and regenerated 1 health!"));
                damaged.setHealth(damaged.getHealth() + 1);
            }
        }
    }
}