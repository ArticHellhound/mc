package net.mcreator.overkill.client.renderer;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.entity.layers.EyesLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.CreeperModel;

import net.mcreator.overkill.entity.TestEntity;

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
