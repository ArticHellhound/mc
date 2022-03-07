
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.overkill.init;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.event.RegistryEvent;

import net.minecraft.world.level.block.Block;

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

	private static Block register(Block block) {
		REGISTRY.add(block);
		return block;
	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(REGISTRY.toArray(new Block[0]));
	}
}
