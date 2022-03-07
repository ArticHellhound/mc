
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

import net.mcreator.overkill.item.ThaumiteSwordItem;
import net.mcreator.overkill.item.ThaumiteShovelItem;
import net.mcreator.overkill.item.ThaumitePickaxeItem;
import net.mcreator.overkill.item.ThaumiteHoeItem;
import net.mcreator.overkill.item.ThaumiteAxeItem;
import net.mcreator.overkill.item.ThalimiteIngotItem;
import net.mcreator.overkill.item.ThalamiteArmorItem;
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
	public static final Item THALAMITE_ARMOR_HELMET = register(new ThalamiteArmorItem.Helmet());
	public static final Item THALAMITE_ARMOR_CHESTPLATE = register(new ThalamiteArmorItem.Chestplate());
	public static final Item THALAMITE_ARMOR_LEGGINGS = register(new ThalamiteArmorItem.Leggings());
	public static final Item THALAMITE_ARMOR_BOOTS = register(new ThalamiteArmorItem.Boots());
	public static final Item NITROGYEN_BUCKET = register(new NitrogyenItem());
	public static final Item FANALE = register(new FanaleItem());
	public static final Item THAUMITE_PICKAXE = register(new ThaumitePickaxeItem());
	public static final Item THAUMITE_AXE = register(new ThaumiteAxeItem());
	public static final Item THAUMITE_SWORD = register(new ThaumiteSwordItem());
	public static final Item THAUMITE_SHOVEL = register(new ThaumiteShovelItem());
	public static final Item THAUMITE_HOE = register(new ThaumiteHoeItem());
	public static final Item SHICKAXE = register(new ShickaxeItem());

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
