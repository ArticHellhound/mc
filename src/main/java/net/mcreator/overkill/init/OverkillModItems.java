
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.overkill.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.overkill.item.ThalimiteSwordItem;
import net.mcreator.overkill.item.ThalimiteShovelItem;
import net.mcreator.overkill.item.ThalimitePickaxeItem;
import net.mcreator.overkill.item.ThalimiteIngotItem;
import net.mcreator.overkill.item.ThalimiteHoeItem;
import net.mcreator.overkill.item.ThalimiteAxeItem;
import net.mcreator.overkill.item.ShickaxeItem;
import net.mcreator.overkill.item.NitrogyenItem;
import net.mcreator.overkill.item.FanaleItem;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OverkillModItems {
	private static final List<Item> REGISTRY = new ArrayList<>();
	public static final Item THALIMITE_INGOT = register(new ThalimiteIngotItem());
	public static final Item THALIMITE_ORE = register(OverkillModBlocks.THALIMITE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item THALIMITE_BLOCK = register(OverkillModBlocks.THALIMITE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item NITROGYEN_BUCKET = register(new NitrogyenItem());
	public static final Item FANALE = register(new FanaleItem());
	public static final Item SHICKAXE = register(new ShickaxeItem());
	public static final Item THALIMITE_PICKAXE = register(new ThalimitePickaxeItem());
	public static final Item THALIMITE_AXE = register(new ThalimiteAxeItem());
	public static final Item THALIMITE_SWORD = register(new ThalimiteSwordItem());
	public static final Item THALIMITE_SHOVEL = register(new ThalimiteShovelItem());
	public static final Item THALIMITE_HOE = register(new ThalimiteHoeItem());
	public static final Item TRIPS_WOOD = register(OverkillModBlocks.TRIPS_WOOD, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TRIPS_LOG = register(OverkillModBlocks.TRIPS_LOG, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TRIPS_PLANKS = register(OverkillModBlocks.TRIPS_PLANKS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TRIPS_LEAVES = register(OverkillModBlocks.TRIPS_LEAVES, CreativeModeTab.TAB_DECORATIONS);
	public static final Item TRIPS_STAIRS = register(OverkillModBlocks.TRIPS_STAIRS, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TRIPS_SLAB = register(OverkillModBlocks.TRIPS_SLAB, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item TRIPS_FENCE = register(OverkillModBlocks.TRIPS_FENCE, CreativeModeTab.TAB_DECORATIONS);
	public static final Item TRIPS_FENCE_GATE = register(OverkillModBlocks.TRIPS_FENCE_GATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item TRIPS_PRESSURE_PLATE = register(OverkillModBlocks.TRIPS_PRESSURE_PLATE, CreativeModeTab.TAB_REDSTONE);
	public static final Item TRIPS_BUTTON = register(OverkillModBlocks.TRIPS_BUTTON, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static Item register(Item item) {
		REGISTRY.add(item);
		return item;
	}

	private static Item register(Block block, CreativeModeTab tab) {
		return register(new BlockItem(block, new Item.Properties().tab(tab)).setRegistryName(block.getRegistryName()));
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Item[0]));
	}
}
