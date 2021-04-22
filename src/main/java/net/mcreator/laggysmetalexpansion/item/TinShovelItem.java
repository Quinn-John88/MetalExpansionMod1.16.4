
package net.mcreator.laggysmetalexpansion.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.crafting.Ingredient;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.item.IItemTier;

import net.mcreator.laggysmetalexpansion.itemgroup.MetalsExpansionItemGroup;
import net.mcreator.laggysmetalexpansion.LaggysMetalExpansionModElements;

@LaggysMetalExpansionModElements.ModElement.Tag
public class TinShovelItem extends LaggysMetalExpansionModElements.ModElement {
	@ObjectHolder("laggys_metal_expansion:tin_shovel")
	public static final Item block = null;
	public TinShovelItem(LaggysMetalExpansionModElements instance) {
		super(instance, 36);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 300;
			}

			public float getEfficiency() {
				return 7f;
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
				return Ingredient.fromStacks(new ItemStack(TinIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MetalsExpansionItemGroup.tab)) {
		}.setRegistryName("tin_shovel"));
	}
}
