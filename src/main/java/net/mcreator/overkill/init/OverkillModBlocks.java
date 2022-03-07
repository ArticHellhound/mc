
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.overkill.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

import net.mcreator.overkill.block.TripsWoodBlock;
import net.mcreator.overkill.block.TripsStairsBlock;
import net.mcreator.overkill.block.TripsSlabBlock;
import net.mcreator.overkill.block.TripsPressurePlateBlock;
import net.mcreator.overkill.block.TripsPlanksBlock;
import net.mcreator.overkill.block.TripsLogBlock;
import net.mcreator.overkill.block.TripsLeavesBlock;
import net.mcreator.overkill.block.TripsFenceGateBlock;
import net.mcreator.overkill.block.TripsFenceBlock;
import net.mcreator.overkill.block.TripsButtonBlock;
import net.mcreator.overkill.block.ThalimiteOreBlock;
import net.mcreator.overkill.block.ThalimiteBlockBlock;
import net.mcreator.overkill.block.NitrogyenBlock;
import net.mcreator.overkill.block.FanalePortalBlock;

import java.util.List;
import java.util.ArrayList;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
public class OverkillModBlocks {
	private static final List<Block> REGISTRY = new ArrayList<>();
	public static final Block THALIMITE_ORE = register(new ThalimiteOreBlock());
	public static final Block THALIMITE_BLOCK = register(new ThalimiteBlockBlock());
	public static final Block NITROGYEN = register(new NitrogyenBlock());
	public static final Block FANALE_PORTAL = register(new FanalePortalBlock());
	public static final Block TRIPS_WOOD = register(new TripsWoodBlock());
	public static final Block TRIPS_LOG = register(new TripsLogBlock());
	public static final Block TRIPS_PLANKS = register(new TripsPlanksBlock());
	public static final Block TRIPS_LEAVES = register(new TripsLeavesBlock());
	public static final Block TRIPS_STAIRS = register(new TripsStairsBlock());
	public static final Block TRIPS_SLAB = register(new TripsSlabBlock());
	public static final Block TRIPS_FENCE = register(new TripsFenceBlock());
	public static final Block TRIPS_FENCE_GATE = register(new TripsFenceGateBlock());
	public static final Block TRIPS_PRESSURE_PLATE = register(new TripsPressurePlateBlock());
	public static final Block TRIPS_BUTTON = register(new TripsButtonBlock());

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
