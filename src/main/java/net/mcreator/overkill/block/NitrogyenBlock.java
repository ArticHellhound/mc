
package net.mcreator.overkill.block;

import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.Direction;
import net.minecraft.core.BlockPos;

import net.mcreator.overkill.procedures.NitrogyenMobplayerCollidesBlockProcedure;
import net.mcreator.overkill.init.OverkillModFluids;

public class NitrogyenBlock extends LiquidBlock {
	public NitrogyenBlock() {
		super(OverkillModFluids.NITROGYEN, BlockBehaviour.Properties.of(Material.WATER).strength(100f)

				.lightLevel(s -> 5));
		setRegistryName("nitrogyen");
	}

	@Override
	public int getFlammability(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 100;
	}

	@Override
	public int getFireSpreadSpeed(BlockState state, BlockGetter world, BlockPos pos, Direction face) {
		return 20;
	}

	@Override
	public boolean propagatesSkylightDown(BlockState state, BlockGetter reader, BlockPos pos) {
		return true;
	}

	@Override
	public void entityInside(BlockState blockstate, Level world, BlockPos pos, Entity entity) {
		super.entityInside(blockstate, world, pos, entity);
		NitrogyenMobplayerCollidesBlockProcedure.execute(entity);
	}
}
