package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class dahoe extends CustomItem
{
    public dahoe()
    {
        super("da hoe", Material.IRON_HOE, Rarity.UNCOMMON);
        super.addLoreLine("&f5 Unbreaking")
        super.addEnchant(Enchantment.DURABILITY, 5);
        super.applyMetaToStack();
    }
}