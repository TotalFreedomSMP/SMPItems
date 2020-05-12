package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class ShovelL extends CustomItem
{
    public ShovelL()
    {
        super("Shovel!", Material.IRON_SHOVEL, Rarity.RARE);
        super.addLoreLine("&f4 Efficiency")
        super.addEnchant(Enchantment.DIG_SPEED, 4);
        super.applyMetaToStack();
    }
}