package me.totalfreedom.smpitems.item;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class SuperFood extends CustomItem
{
    public SuperFood()
    {
        super("Super Food", Material.GLISTERING_MELON_SLICE, Rarity.LEGENDARY, ItemType.OTHER);
        super.addLoreLine("&cInfinity.");
        super.addLoreLine("&bRestore full hunger!");
        super.addLoreLine("&760s Cooldown");
        super.addEnchant(Enchantment.DURABILITY, 1);
        super.applyMetaToStack();
    }
}