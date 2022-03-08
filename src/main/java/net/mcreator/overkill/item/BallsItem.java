
package net.mcreator.overkill.item;

import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;

import net.mcreator.overkill.init.OverkillModSounds;

public class BallsItem extends RecordItem {
	public BallsItem() {
		super(0, OverkillModSounds.REGISTRY.get(new ResourceLocation("overkill:copying_you_speed")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("balls");
	}
}
