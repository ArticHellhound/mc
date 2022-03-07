
package net.mcreator.overkill.item;

import net.minecraft.world.level.Level;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.RecordItem;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.network.chat.TextComponent;
import net.minecraft.network.chat.Component;

import net.mcreator.overkill.init.OverkillModSounds;

import java.util.List;

public class CoffeeItem extends RecordItem {
	public CoffeeItem() {
		super(0, OverkillModSounds.REGISTRY.get(new ResourceLocation("overkill:coffee")),
				new Item.Properties().tab(CreativeModeTab.TAB_MISC).stacksTo(1).rarity(Rarity.RARE));
		setRegistryName("coffee");
	}

	@Override
	public void appendHoverText(ItemStack itemstack, Level world, List<Component> list, TooltipFlag flag) {
		super.appendHoverText(itemstack, world, list, flag);
		list.add(new TextComponent(
				"COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE COFFEE"));
	}
}
