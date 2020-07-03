package me.totalfreedom.smpitems.mob;

import me.totalfreedom.smpitems.item.FreedomSword;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.entity.EntityType;
import org.bukkit.inventory.ItemStack;
import org.bukkit.potion.PotionEffect;
import org.bukkit.potion.PotionEffectType;

public class TubbyStray extends CustomMob
{
    public TubbyStray()
    {
        super(EntityType.STRAY, ChatColor.LIGHT_PURPLE + "Tubby Stray");
        super.setHoldableItem(new FreedomSword());
        super.setHelmet(new ItemStack(Material.IRON_HELMET));
        super.setChestplate(new ItemStack(Material.CHAINMAIL_CHESTPLATE));
        super.setLeggings(new ItemStack(Material.IRON_LEGGINGS));
        super.setBoots(new ItemStack(Material.CHAINMAIL_BOOTS));
        super.addPotionEffect(new PotionEffect(PotionEffectType.SPEED, 9999999, 5));
        super.addPotionEffect(new PotionEffect(PotionEffectType.HEALTH_BOOST, 9999999, 2));
    }
}