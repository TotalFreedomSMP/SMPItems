package tfsmp.smpitems.item;

import org.bukkit.enchantments.Enchantment;
import tfsmp.smpitems.util.Groups;

public class Spoon extends CustomItem
{
    public Spoon()
    {
        super("spoon", Groups.VANILLA_SHOVELS, Rarity.LEGENDARY, ItemType.TOOLS);
        super.addLoreLine("&cwait this isn't a spoon?");
        super.addLoreLine("&eEfficiency 20");
        super.addLoreLine("&eUnbreaking 10");
        super.addEnchant(Enchantment.DIG_SPEED, 20);
        super.addEnchant(Enchantment.DURABILITY, 10);
        super.applyMetaToStack();
    }
}