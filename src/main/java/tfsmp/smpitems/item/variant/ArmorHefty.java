package tfsmp.smpitems.item.variant;

import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.attribute.AttributeModifier;

public class ArmorHefty extends Variant
{
    public ArmorHefty()
    {
        super("Hefty");
        super.addAttribute(Attribute.GENERIC_MOVEMENT_SPEED, -0.2);
        super.addAttribute(Attribute.GENERIC_MAX_HEALTH, 6);
        super.addAttribute(Attribute.GENERIC_ARMOR_TOUGHNESS, 1);
    }
}