package qu.quEnchantments.util;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.entity.EntityType;
import net.minecraft.tag.TagKey;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.World;
import net.minecraft.world.dimension.DimensionType;
import qu.quEnchantments.QuEnchantments;

public class ModTags {

    public static final TagKey<Enchantment> WEAPON_DAMAGE_ENCHANTMENTS = TagKey.of(Registry.ENCHANTMENT_KEY, new Identifier(QuEnchantments.MOD_ID, "weapon_damage_enchantments"));
    public static final TagKey<Enchantment> WEAPON_ASPECT_ENCHANTMENTS = TagKey.of(Registry.ENCHANTMENT_KEY, new Identifier(QuEnchantments.MOD_ID, "weapon_aspect_enchantments"));
    public static final TagKey<Enchantment> ARMOR_FEET_WALKER_ENCHANTMENTS = TagKey.of(Registry.ENCHANTMENT_KEY, new Identifier(QuEnchantments.MOD_ID, "armor_feet_walker_enchantments"));

    public static final TagKey<EntityType<?>> NIGHTBLOOD_IMMUNE_ENTITIES = TagKey.of(Registry.ENTITY_TYPE_KEY, new Identifier(QuEnchantments.MOD_ID, "nightblood_immune_entities"));

}
