
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
public class BronzeShovelItem extends LaggysMetalExpansionModElements.ModElement {
	@ObjectHolder("laggys_metal_expansion:bronze_shovel")
	public static final Item block = null;
	public BronzeShovelItem(LaggysMetalExpansionModElements instance) {
		super(instance, 56);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ShovelItem(new IItemTier() {
			public int getMaxUses() {
				return 325;
			}

			public float getEfficiency() {
				return 7.5f;
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
				return Ingredient.fromStacks(new ItemStack(BronzeIngotItem.block, (int) (1)));
			}
		}, 1, -3f, new Item.Properties().group(MetalsExpansionItemGroup.tab)) {
		}.setRegistryName("bronze_shovel"));
	}
}
