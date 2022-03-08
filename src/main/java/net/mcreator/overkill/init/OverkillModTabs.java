
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package net.mcreator.overkill.init;

import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class OverkillModTabs {
	public static CreativeModeTab TAB_OVERKILL;

	public static void load() {
		TAB_OVERKILL = new CreativeModeTab("taboverkill") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(OverkillModItems.COFFEE);
			}

			@OnlyIn(Dist.CLIENT)
			public boolean hasSearchBar() {
				return true;
			}
		}.setBackgroundSuffix("item_search.png");
	}
}
