package me.totalfreedom.smpitems.item;

import org.bukkit.Material;

public class Flux extends CustomItem
{
    public Flux()
    {
        super("Flux", Material.BEACON, Rarity.PEARLESCENT, ItemType.OTHER);
        super.addLoreLine("&dAbility: Heal Pool");
        super.addLoreLine("&760s Cooldown");
        super.applyMetaToStack();
    }
}