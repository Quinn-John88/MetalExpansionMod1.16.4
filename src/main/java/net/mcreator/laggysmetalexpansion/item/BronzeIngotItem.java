
package net.mcreator.laggysmetalexpansion.item;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Rarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item;
import net.minecraft.block.BlockState;

import net.mcreator.laggysmetalexpansion.itemgroup.MetalsExpansionItemGroup;
import net.mcreator.laggysmetalexpansion.LaggysMetalExpansionModElements;

@LaggysMetalExpansionModElements.ModElement.Tag
public class BronzeIngotItem extends LaggysMetalExpansionModElements.ModElement {
	@ObjectHolder("laggys_metal_expansion:bronze_ingot")
	public static final Item block = null;
	public BronzeIngotItem(LaggysMetalExpansionModElements instance) {
		super(instance, 18);
	}

	@Override
	public void initElements() {
		elements.items.add(() -> new ItemCustom());
	}
	public static class ItemCustom extends Item {
		public ItemCustom() {
			super(new Item.Properties().group(MetalsExpansionItemGroup.tab).maxStackSize(64).rarity(Rarity.COMMON));
			setRegistryName("bronze_ingot");
		}

		@Override
		public int getItemEnchantability() {
			return 0;
		}

		@Override
		public int getUseDuration(ItemStack itemstack) {
			return 0;
		}

		@Override
		public float getDestroySpeed(ItemStack par1ItemStack, BlockState par2Block) {
			return 1F;
		}
	}
}
