package net.mcreator.laggysmetalexpansion.procedures;

import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.world.BlockEvent;
import net.minecraftforge.common.MinecraftForge;

import net.minecraft.world.World;
import net.minecraft.world.IWorld;
import net.minecraft.util.math.BlockPos;
import net.minecraft.item.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.Entity;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.block.Blocks;

import net.mcreator.laggysmetalexpansion.item.UraniumIngotItem;
import net.mcreator.laggysmetalexpansion.item.TinIngotItem;
import net.mcreator.laggysmetalexpansion.item.NickleIngotItem;
import net.mcreator.laggysmetalexpansion.item.CopperIngotItem;
import net.mcreator.laggysmetalexpansion.enchantment.SmeltingEnchantment;
import net.mcreator.laggysmetalexpansion.block.UraniumOreBlock;
import net.mcreator.laggysmetalexpansion.block.TinOreBlock;
import net.mcreator.laggysmetalexpansion.block.NickleOreBlock;
import net.mcreator.laggysmetalexpansion.block.CopperOreBlock;
import net.mcreator.laggysmetalexpansion.LaggysMetalExpansionModElements;
import net.mcreator.laggysmetalexpansion.LaggysMetalExpansionMod;

import java.util.Random;
import java.util.Map;
import java.util.HashMap;

@LaggysMetalExpansionModElements.ModElement.Tag
public class AutoSmeltingProcedureProcedure extends LaggysMetalExpansionModElements.ModElement {
	public AutoSmeltingProcedureProcedure(LaggysMetalExpansionModElements instance) {
		super(instance, 148);
		MinecraftForge.EVENT_BUS.register(this);
	}

	public static void executeProcedure(Map<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			if (!dependencies.containsKey("entity"))
				LaggysMetalExpansionMod.LOGGER.warn("Failed to load dependency entity for procedure AutoSmeltingProcedure!");
			return;
		}
		if (dependencies.get("x") == null) {
			if (!dependencies.containsKey("x"))
				LaggysMetalExpansionMod.LOGGER.warn("Failed to load dependency x for procedure AutoSmeltingProcedure!");
			return;
		}
		if (dependencies.get("y") == null) {
			if (!dependencies.containsKey("y"))
				LaggysMetalExpansionMod.LOGGER.warn("Failed to load dependency y for procedure AutoSmeltingProcedure!");
			return;
		}
		if (dependencies.get("z") == null) {
			if (!dependencies.containsKey("z"))
				LaggysMetalExpansionMod.LOGGER.warn("Failed to load dependency z for procedure AutoSmeltingProcedure!");
			return;
		}
		if (dependencies.get("world") == null) {
			if (!dependencies.containsKey("world"))
				LaggysMetalExpansionMod.LOGGER.warn("Failed to load dependency world for procedure AutoSmeltingProcedure!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		double x = dependencies.get("x") instanceof Integer ? (int) dependencies.get("x") : (double) dependencies.get("x");
		double y = dependencies.get("y") instanceof Integer ? (int) dependencies.get("y") : (double) dependencies.get("y");
		double z = dependencies.get("z") instanceof Integer ? (int) dependencies.get("z") : (double) dependencies.get("z");
		IWorld world = (IWorld) dependencies.get("world");
		if (((((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY)).isEnchanted())) {
			if (((EnchantmentHelper.getEnchantmentLevel(SmeltingEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 1)) {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TinOreBlock.block.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(TinIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CopperOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(CopperIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == NickleOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(NickleIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == UraniumOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(UraniumIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.IRON_ORE.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.IRON_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GOLD_ORE.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.GOLD_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.NETHER_GOLD_ORE.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.GOLD_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 3, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
			if (((EnchantmentHelper.getEnchantmentLevel(SmeltingEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 2)) {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TinOreBlock.block.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(TinIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CopperOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(CopperIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == NickleOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(NickleIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == UraniumOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(UraniumIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.IRON_ORE.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.IRON_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GOLD_ORE.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.GOLD_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.NETHER_GOLD_ORE.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.GOLD_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 2, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
			if (((EnchantmentHelper.getEnchantmentLevel(SmeltingEnchantment.enchantment,
					((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY))) == 3)) {
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == TinOreBlock.block.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(TinIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == CopperOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(CopperIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == NickleOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(NickleIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == UraniumOreBlock.block.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(UraniumIngotItem.block, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.IRON_ORE.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.IRON_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.GOLD_ORE.getDefaultState().getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.GOLD_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
				if (((world.getBlockState(new BlockPos((int) x, (int) y, (int) z))).getBlock() == Blocks.NETHER_GOLD_ORE.getDefaultState()
						.getBlock())) {
					if (world instanceof World && !world.isRemote()) {
						ItemEntity entityToSpawn = new ItemEntity((World) world, (x + 0.5), (y + 0.5), (z + 0.5),
								new ItemStack(Items.GOLD_INGOT, (int) (1)));
						entityToSpawn.setPickupDelay((int) 10);
						world.addEntity(entityToSpawn);
					}
					{
						ItemStack _ist = ((entity instanceof LivingEntity) ? ((LivingEntity) entity).getHeldItemMainhand() : ItemStack.EMPTY);
						if (_ist.attemptDamageItem((int) 1, new Random(), null)) {
							_ist.shrink(1);
							_ist.setDamage(0);
						}
					}
					world.destroyBlock(new BlockPos((int) x, (int) y, (int) z), false);
				}
			}
		}
	}

	@SubscribeEvent
	public void onBlockBreak(BlockEvent.BreakEvent event) {
		Entity entity = event.getPlayer();
		IWorld world = event.getWorld();
		Map<String, Object> dependencies = new HashMap<>();
		dependencies.put("xpAmount", event.getExpToDrop());
		dependencies.put("x", event.getPos().getX());
		dependencies.put("y", event.getPos().getY());
		dependencies.put("z", event.getPos().getZ());
		dependencies.put("px", entity.getPosX());
		dependencies.put("py", entity.getPosY());
		dependencies.put("pz", entity.getPosZ());
		dependencies.put("world", world);
		dependencies.put("entity", entity);
		dependencies.put("event", event);
		this.executeProcedure(dependencies);
	}
}
