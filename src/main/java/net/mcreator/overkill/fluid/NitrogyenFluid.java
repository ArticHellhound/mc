
package net.mcreator.overkill.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;
import net.minecraft.world.item.Rarity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.core.particles.ParticleOptions;

import net.mcreator.overkill.init.OverkillModItems;
import net.mcreator.overkill.init.OverkillModFluids;
import net.mcreator.overkill.init.OverkillModBlocks;
import net.mcreator.overkill.fluid.attributes.NitrogyenFluidAttributes;

public abstract class NitrogyenFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> OverkillModFluids.NITROGYEN,
			() -> OverkillModFluids.FLOWING_NITROGYEN,
			NitrogyenFluidAttributes.builder(new ResourceLocation("overkill:blocks/nytrog"), new ResourceLocation("overkill:blocks/nytro"))

					.rarity(Rarity.UNCOMMON).color(-4138753)).explosionResistance(100f)

							.bucket(() -> OverkillModItems.NITROGYEN_BUCKET).block(() -> (LiquidBlock) OverkillModBlocks.NITROGYEN);

	private NitrogyenFluid() {
		super(PROPERTIES);
	}

	@Override
	public ParticleOptions getDripParticle() {
		return ParticleTypes.EXPLOSION;
	}

	public static class Source extends NitrogyenFluid {
		public Source() {
			super();
			setRegistryName("nitrogyen");
		}

		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends NitrogyenFluid {
		public Flowing() {
			super();
			setRegistryName("flowing_nitrogyen");
		}

		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
