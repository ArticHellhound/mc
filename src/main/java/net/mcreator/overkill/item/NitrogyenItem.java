
package net.mcreator.overkill.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import net.mcreator.overkill.init.OverkillModFluids;

public class NitrogyenItem extends BucketItem {
	public NitrogyenItem() {
		super(() -> OverkillModFluids.NITROGYEN,
				new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
		setRegistryName("nitrogyen_bucket");
	}
}
