package net.mcreator.overkill.client.renderer;

public class TestRenderer extends MobRenderer<TestEntity, CreeperModel<TestEntity>> {

	public TestRenderer(EntityRendererProvider.Context context) {
		super(context, new CreeperModel(context.bakeLayer(ModelLayers.CREEPER)), 0.5f);

		this.addLayer(new EyesLayer<TestEntity, CreeperModel<TestEntity>>(this) {
			@Override
			public RenderType renderType() {
				return RenderType.eyes(new ResourceLocation("overkill:textures/nitrogyen.png"));
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TestEntity entity) {
		return new ResourceLocation("overkill:textures/nitro.png");
	}

}
