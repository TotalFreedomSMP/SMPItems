package me.totalfreedom.smpitems.item;

import me.totalfreedom.smpitems.util.Groups;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;

public class Axe extends CustomItem
{
    public Axe()
    {
        super("Axe!", Groups.VANILLA_AXES, Rarity.RARE, ItemType.MELEE);
        super.addLoreLine("&b+150% Speed");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, 0.5, AttributeModifier.Operation.ADD_SCALAR);
        super.applyMetaToStack();
    }
}