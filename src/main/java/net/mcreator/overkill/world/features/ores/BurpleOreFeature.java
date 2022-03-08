
package net.mcreator.overkill.world.features.ores;

public class BurpleOreFeature extends OreFeature {

	public static final BurpleOreFeature FEATURE = (BurpleOreFeature) new BurpleOreFeature().setRegistryName("overkill:burple_ore");
	public static final ConfiguredFeature<?, ?> CONFIGURED_FEATURE = FEATURE
			.configured(new OreConfiguration(BurpleOreFeatureRuleTest.INSTANCE, OverkillModBlocks.BURPLE_ORE.defaultBlockState(), 7))
			.range(new RangeDecoratorConfiguration(UniformHeight.of(VerticalAnchor.absolute(1), VerticalAnchor.absolute(63)))).squared().count(11);

	public static final Set<ResourceLocation> GENERATE_BIOMES = null;

	public BurpleOreFeature() {
		super(OreConfiguration.CODEC);
	}

	public boolean place(FeaturePlaceContext<OreConfiguration> context) {
		WorldGenLevel world = context.level();
		ResourceKey<Level> dimensionType = world.getLevel().dimension();
		boolean dimensionCriteria = false;

		if (dimensionType == Level.OVERWORLD)
			dimensionCriteria = true;

		if (!dimensionCriteria)
			return false;

		return super.place(context);
	}

	private static class BurpleOreFeatureRuleTest extends RuleTest {

		static final BurpleOreFeatureRuleTest INSTANCE = new BurpleOreFeatureRuleTest();
		static final com.mojang.serialization.Codec<BurpleOreFeatureRuleTest> codec = com.mojang.serialization.Codec.unit(() -> INSTANCE);

		static final RuleTestType<BurpleOreFeatureRuleTest> CUSTOM_MATCH = Registry.register(Registry.RULE_TEST,
				new ResourceLocation("overkill:burple_ore_match"), () -> codec);

		public boolean test(BlockState blockAt, Random random) {
			boolean blockCriteria = false;

			if (blockAt.getBlock() == Blocks.STONE)
				blockCriteria = true;

			return blockCriteria;
		}

		protected RuleTestType<?> getType() {
			return CUSTOM_MATCH;
		}

	}

}
