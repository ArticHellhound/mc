
package net.mcreator.overkill.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BurpleIngotItem extends Item {

	public BurpleIngotItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("burple_ingot");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
