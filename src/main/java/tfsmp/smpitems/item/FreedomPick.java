package tfsmp.smpitems.item;

import org.bukkit.ChatColor;
import org.bukkit.attribute.Attribute;
import tfsmp.smpitems.util.Groups;

public class FreedomPick extends CustomItem
{
    public FreedomPick()
    {
        super(ChatColor.BLUE + "Freedom Pickaxe", Groups.VANILLA_PICKAXES, Rarity.RARE);
        super.addLoreLine("&f+200% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 2.0);
        super.applyMetaToStack();
    }
}