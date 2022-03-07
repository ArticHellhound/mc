
package net.mcreator.overkill.item;

import net.minecraft.network.chat.Component;

public class Secret1Item extends RecordItem {

	public Secret1Item() {
		super(0, OverkillModSounds.REGISTRY.get(new ResourceLocation("overkill:gtahub")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));

		setRegistryName("secret_1");
	}

}
