
package net.mcreator.overkill.item;

import net.minecraft.network.chat.Component;

public class BallsItem extends RecordItem {

	public BallsItem() {
		super(0, OverkillModSounds.REGISTRY.get(new ResourceLocation("overkill:copying_you_speed")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));

		setRegistryName("balls");
	}

}
