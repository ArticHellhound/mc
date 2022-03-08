
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.overkill.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.SpawnEggItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import net.mcreator.overkill.item.ThalimiteSwordItem;
import net.mcreator.overkill.item.ThalimiteShovelItem;
import net.mcreator.overkill.item.ThalimitePickaxeItem;
import net.mcreator.overkill.item.ThalimiteIngotItem;
import net.mcreator.overkill.item.ThalimiteHoeItem;
import net.mcreator.overkill.item.ThalimiteAxeItem;
import net.mcreator.overkill.item.ThalimiteArmorItem;
import net.mcreator.overkill.item.ShickaxeItem;
import net.mcreator.overkill.item.Secret1Item;
import net.mcreator.overkill.item.NitrogyenItem;
import net.mcreator.overkill.item.FanaleItem;
import net.mcreator.overkill.item.CoffeeItem;
import net.mcreator.overkill.item.CoffeatItem;
import net.mcreator.overkill.item.BurpleShovelItem;
import net.mcreator.overkill.item.BurplePickaxeItem;
import net.mcreator.overkill.item.BurpleIngotItem;
import net.mcreator.overkill.item.BurpleHoeItem;
import net.mcreator.overkill.item.BurpleAxeItem;
import net.mcreator.overkill.item.BurpleArmorItem;
import net.mcreator.overkill.item.BallsItem;

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
	public static final Item THALIMITE_ARMOR_HELMET = register(new ThalimiteArmorItem.Helmet());
	public static final Item THALIMITE_ARMOR_CHESTPLATE = register(new ThalimiteArmorItem.Chestplate());
	public static final Item THALIMITE_ARMOR_LEGGINGS = register(new ThalimiteArmorItem.Leggings());
	public static final Item THALIMITE_ARMOR_BOOTS = register(new ThalimiteArmorItem.Boots());
	public static final Item COFFEE = register(new CoffeeItem());
	public static final Item SECRET_1 = register(new Secret1Item());
	public static final Item COFFEAT = register(new CoffeatItem());
	public static final Item BURPLE_INGOT = register(new BurpleIngotItem());
	public static final Item BURPLE = register(new BurpleItem());
	public static final Item BURPLE_ORE = register(OverkillModBlocks.BURPLE_ORE, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BURPLE_BLOCK = register(OverkillModBlocks.BURPLE_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final Item BURPLE_PICKAXE = register(new BurplePickaxeItem());
	public static final Item BURPLE_AXE = register(new BurpleAxeItem());
	public static final Item BURPLE_SHOVEL = register(new BurpleShovelItem());
	public static final Item BURPLE_HOE = register(new BurpleHoeItem());
	public static final Item BURPLE_ARMOR_HELMET = register(new BurpleArmorItem.Helmet());
	public static final Item BURPLE_ARMOR_CHESTPLATE = register(new BurpleArmorItem.Chestplate());
	public static final Item BURPLE_ARMOR_LEGGINGS = register(new BurpleArmorItem.Leggings());
	public static final Item BURPLE_ARMOR_BOOTS = register(new BurpleArmorItem.Boots());
	public static final Item BALLS = register(new BallsItem());
	public static final Item TEST = register(
			new SpawnEggItem(OverkillModEntities.TEST, -16776961, -10027009, new Item.Properties().tab(CreativeModeTab.TAB_MISC))
					.setRegistryName("test_spawn_egg"));

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
