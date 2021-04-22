
package net.mcreator.laggysmetalexpansion.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.laggysmetalexpansion.LaggysMetalExpansionModElements;

@LaggysMetalExpansionModElements.ModElement.Tag
public class NickleSwordItem extends LaggysMetalExpansionModElements.ModElement {
	@ObjectHolder("laggys_metal_expansion:nickle_sword")
	public static final Item block = null;
	public NickleSwordItem(LaggysMetalExpansionModElements instance) {
		super(instance, 118);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new SwordItem(new IItemTier() {
			public int getMaxUses() {
				return 250;
			}

			public float getEfficiency() {
				return 6f;
			}

			public float getAttackDamage() {
				return 0f;
			}

			public int getHarvestLevel() {
				return 2;
			}

			public int getEnchantability() {
				return 14;
			}

			public Ingredient getRepairMaterial() {
				return Ingredient.fromStacks(new ItemStack(NickleIngotItem.block, (int) (1)));
			}
		}, 3, -3f, new Item.Properties().group(ItemGroup.COMBAT)) {
		}.setRegistryName("nickle_sword"));
	}
}
