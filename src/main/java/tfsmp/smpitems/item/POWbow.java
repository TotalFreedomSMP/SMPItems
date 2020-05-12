package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;

public class POWbow extends CustomItem
{
    public POWbow()
    {
        super("POW! Bow", Material.BOW, Rarity.LEGENDARY);
        super.addLoreLine('&c"BOOM!"')
        super.addLoreLine("&f20 Punch")
        super.addEnchant(Enchantment.ARROW_KNOCKBACK, 20);
        super.applyMetaToStack();
    }
}