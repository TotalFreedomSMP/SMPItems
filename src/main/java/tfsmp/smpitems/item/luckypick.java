package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class luckypick extends CustomItem
{
    public luckypick()
    {
        super(ChatColor.GOLD + "Lucky Pick", Groups.VANILLA_PICKAXES, Rarity.LEGENDARY);
        super.addLoreLine("&f10 Fortune");
        super.addEnchant(Enchantment.LOOT_BONUS_BLOCKS, 10);
        super.applyMetaToStack();
    }
}