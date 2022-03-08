
package net.mcreator.overkill.item;

import net.minecraft.world.entity.ai.attributes.Attributes;

public class BurpleItem extends Item {

	public BurpleItem() {
		super(new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(64).rarity(Rarity.COMMON));
		setRegistryName("burple");
	}

	@Override
	public int getUseDuration(ItemStack itemstack) {
		return 0;
	}

}
