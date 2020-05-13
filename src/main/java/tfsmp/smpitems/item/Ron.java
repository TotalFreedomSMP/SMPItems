package tfsmp.smpitems.item;

import org.bukkit.Material;
import org.bukkit.attribute.Attribute;
import org.bukkit.enchantments.Enchantment;

public class Ron extends CustomItem
{
    public Ron()
    {
        super("pencil", Material.STICK, Rarity.SPECIAL);
        super.addLoreLine("&cron honey");
        super.addAttribute(Attribute.GENERIC_ATTACK_DAMAGE, 0.0);
        super.applyMetaToStack();
    }
}