
package net.mcreator.laggysmetalexpansion.enchantment;

import net.minecraftforge.registries.ObjectHolder;

import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.enchantment.EnchantmentType;
import net.minecraft.enchantment.Enchantment;

import net.mcreator.laggysmetalexpansion.item.UraniumPickaxeItem;
import net.mcreator.laggysmetalexpansion.item.TinPickaxeItem;
import net.mcreator.laggysmetalexpansion.item.SteelPickaxeItem;
import net.mcreator.laggysmetalexpansion.item.NicklePickaxeItem;
import net.mcreator.laggysmetalexpansion.item.CopperPickaxeItem;
import net.mcreator.laggysmetalexpansion.item.BronzePickaxeItem;
import net.mcreator.laggysmetalexpansion.LaggysMetalExpansionModElements;

@LaggysMetalExpansionModElements.ModElement.Tag
public class SmeltingEnchantment extends LaggysMetalExpansionModElements.ModElement {
	@ObjectHolder("laggys_metal_expansion:smelting")
	public static final Enchantment enchantment = null;
	public SmeltingEnchantment(LaggysMetalExpansionModElements instance) {
		super(instance, 147);
	}

	@Override
	public void initElements() {
		elements.enchantments.add(() -> new CustomEnchantment(EquipmentSlotType.MAINHAND).setRegistryName("smelting"));
	}
	public static class CustomEnchantment extends Enchantment {
		public CustomEnchantment(EquipmentSlotType... slots) {
			super(Enchantment.Rarity.RARE, EnchantmentType.BREAKABLE, slots);
		}

		@Override
		public int getMinLevel() {
			return 1;
		}

		@Override
		public int getMaxLevel() {
			return 3;
		}

		@Override
		public boolean canApplyAtEnchantingTable(ItemStack stack) {
			if (stack.getItem() == new ItemStack(TinPickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(BronzePickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(NicklePickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(CopperPickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(SteelPickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(UraniumPickaxeItem.block, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.WOODEN_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.STONE_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.IRON_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.GOLDEN_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.DIAMOND_PICKAXE, (int) (1)).getItem())
				return true;
			if (stack.getItem() == new ItemStack(Items.NETHERITE_PICKAXE, (int) (1)).getItem())
				return true;
			return false;
		}

		@Override
		public boolean isTreasureEnchantment() {
			return false;
		}

		@Override
		public boolean isCurse() {
			return false;
		}

		@Override
		public boolean isAllowedOnBooks() {
			return true;
		}
	}
}
