package me.totalfreedom.smpitems.item;

import me.totalfreedom.smpitems.util.Groups;
import org.bukkit.enchantments.Enchantment;

public class ShovelL extends CustomItem
{
    public ShovelL()
    {
        super("Shovel!", Groups.VANILLA_SHOVELS, Rarity.RARE, ItemType.TOOLS);
        super.addLoreLine("&a&oEfficiency 4");
        super.addEnchant(Enchantment.DIG_SPEED, 4);
        super.applyMetaToStack();
    }
}