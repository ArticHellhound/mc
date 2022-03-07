
package net.mcreator.overkill.item;

import net.minecraft.network.chat.Component;

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
