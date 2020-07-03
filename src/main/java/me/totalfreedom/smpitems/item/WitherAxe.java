package me.totalfreedom.smpitems.item;

import me.totalfreedom.smpitems.util.Groups;
import org.bukkit.enchantments.Enchantment;

public class WitherAxe extends CustomItem
{
    public WitherAxe()
    {
        super("Wither Axe", Groups.VANILLA_AXES, Rarity.LEGENDARY, ItemType.MELEE);
        super.addLoreLine("&cThe tip withers...");
        super.addLoreLine("&eEfficiency 10");
        super.addEnchant(Enchantment.DIG_SPEED, 10);
        super.applyMetaToStack();
    }
}