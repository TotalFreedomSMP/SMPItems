package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class OlSturdy extends CustomItem
{
    public OlSturdy()
    {
        super("Ol' Sturdy", Material.BOW, Rarity.UNCOMMON);
        super.addLoreLine("&f5 Unbreaking")
        super.addEnchant(Enchantment.DURABILITY, 5);
        super.applyMetaToStack();
    }
}